DROP TABLE IF EXISTS financial;
CREATE EXTERNAL TABLE IF NOT EXISTS financial(fund STRING, year INT, month INT, day INT, open DOUBLE, high DOUBLE, low DOUBLE, close DOUBLE, volume INT, openint INT)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LOCATION '/user/maria_dev/hivetest/financial';

SELECT subquery.year, subquery.month
FROM
  (SELECT f1.year, f1.month, f1.tradingdays, DENSE_RANK() OVER (ORDER BY f1.tradingdays ASC) AS ranked
  FROM
	(SELECT year, month, count(day) AS tradingdays
	FROM financial
	GROUP BY year, month) AS f1) AS subquery
WHERE ranked == 3;
