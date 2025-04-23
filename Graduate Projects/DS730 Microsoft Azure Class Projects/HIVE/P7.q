DROP TABLE IF EXISTS financial;
CREATE EXTERNAL TABLE IF NOT EXISTS financial(fund STRING, year INT, month INT, day INT, open DOUBLE, high DOUBLE, low DOUBLE, close DOUBLE, volume INT, openint INT)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LOCATION '/user/maria_dev/hivetest/financial';

SELECT subquery.fund, subquery.year
FROM
  (SELECT f1.fund, f1.year, f1.avgcloseprice, DENSE_RANK() OVER (ORDER BY f1.avgcloseprice ASC) AS ranked
  FROM 
	(SELECT fund, year, avg(close) AS avgcloseprice
	FROM financial
	WHERE month <= 6
	GROUP BY fund, year) AS f1) AS subquery
WHERE subquery.ranked == 1;