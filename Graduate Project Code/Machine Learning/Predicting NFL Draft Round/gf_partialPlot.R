gf_partialPlot <- function(model, df, x.var, which.class = NULL, average = "mean", num_points = 50){
  # model should be a caret object
  # df is a data frame or tbl
  # x.var is a quoted name of a column in df
  # which.class is a quoted name of a level of the response variable.  This specifies which class we want to count as "1" (numerator of the log odds).  If omitted, uses the 0th class (for coding simplicity and consistency with randomforest::partialPlot).  This argument does nothing for regression problems.
  # Note that the y-axis of randomForest::partialPlot is a scaled version of the y-axis of this function.  I have not dug into why this is.
  # This is the revised version from 13 July 2023.
  # Now uses quantiles instead of evenly-spaced test points.
  # Now computes log odds as log(p)-log(1-p) instead of log(p/(1-p)), so that p = 1 produces Inf rather than NaN.
  # Now uses a point graph rather than a line graph for transparency of what points were tested.
  # num_points is the number of test points to try between the min and the max of x.var.  Larger values mean a more detailed graph but slower.
  # average can be "mean" or "median".  This specifies how to average the results for a given test value.  "mean" matches randomForest::partialPlot.  "median" is recommended for classification problems if some predicted values are extremely close to 1 or 0 (resulting in log odds of Inf or -Inf).
  # Idea for future revisions:  If we use x.var = "blah" and `blah` isn't found, then the code should look for variables that *start* with `blah` and graph all of them, so you could do ClassFrosh, ClassSophomore, ClassJunior, all at once.  Would save confusion by students who let caret do the one-hot encoding for them.
  
  library(ggformula)
  
  observed_data = df[x.var]
  test_vals = seq(min(observed_data), max(observed_data),length = num_points)
  #test_vals = quantile(unlist(observed_data), probs = seq(0, 1, length = num_points))
  pred_avg = numeric(num_points)
  
  if(model$modelType == "Classification"){
    for(ii in 1:num_points){
      comp_df <- df 
      comp_df[x.var] = test_vals[ii]
      
      probs = predict(model, comp_df, type = "prob")
      if(is.null(which.class)){
        log_odds = log(probs[ ,1]) - log(1-probs[ ,1])
      }
      else{
        log_odds = log(probs[ ,which.class]) - log(1-probs[ ,which.class])
      }
      if(average == "mean"){
        pred_avg[ii] = mean(log_odds)
      }
      else{
        pred_avg[ii] = median(log_odds)
      }
    } # end iteration over the test_vals
  } # end "if Classification"
  else{ # Regression model
    for(ii in 1:num_points){
      comp_df <- df 
      comp_df[x.var] = test_vals[ii]
      
      if(average == "mean"){
        pred_avg[ii] = mean(predict(model, comp_df))
      }
      else{
        pred_avg[ii] = median(predict(model, comp_df))
      }
    }
  } #end "if Regression"
  to_return = gf_point(pred_avg ~ test_vals) %>%
    gf_labs(title = paste("Partial dependence on", x.var))
  return(to_return)
} # end of function
