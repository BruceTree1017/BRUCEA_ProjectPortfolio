DROP TABLE IF EXISTS meta;
CREATE EXTERNAL TABLE IF NOT EXISTS meta(fund STRING, fname STRING, lname STRING, year INT, month INT, city STRING, state STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LOCATION '/user/maria_dev/hivetest/metadata';
DROP TABLE IF EXISTS financial;
CREATE EXTERNAL TABLE IF NOT EXISTS financial(fund STRING, year INT, month INT, day INT, open DOUBLE, high DOUBLE, low DOUBLE, close DOUBLE, volume INT, openint INT)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LOCATION '/user/maria_dev/hivetest/financial';

SELECT subquery.fname, subquery.lname
FROM
  (SELECT f2.fund, m.fname, m.lname, f2.profitabledays, DENSE_RANK() OVER (ORDER BY f2.profitabledays DESC) AS ranked
  FROM meta as m
  JOIN					  
	(SELECT f1.fund, count(f1.fund) AS profitabledays
	FROM
	  (SELECT fund, close - open AS profitability
	  FROM financial) AS f1
	WHERE f1.profitability > 0
	GROUP BY f1.fund) AS f2
  WHERE m.fund = f2.fund) AS subquery
WHERE subquery.ranked == 1;