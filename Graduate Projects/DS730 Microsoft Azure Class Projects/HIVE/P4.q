DROP TABLE IF EXISTS meta;
CREATE EXTERNAL TABLE IF NOT EXISTS meta(fund STRING, fname STRING, lname STRING, year INT, month INT, city STRING, state STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LOCATION '/user/maria_dev/hivetest/metadata';
DROP TABLE IF EXISTS financial;
CREATE EXTERNAL TABLE IF NOT EXISTS financial(fund STRING, year INT, month INT, day INT, open DOUBLE, high DOUBLE, low DOUBLE, close DOUBLE, volume INT, openint INT)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LOCATION '/user/maria_dev/hivetest/financial';

SELECT subquery.state
FROM
  (SELECT f.fund, m.state, f.totalvolume, DENSE_RANK() OVER (ORDER BY f.totalvolume DESC) AS ranked
  FROM meta AS m
  JOIN
	(SELECT fund, sum(volume) AS totalvolume
	FROM financial
	WHERE year == 2014
	GROUP BY fund) AS f
  WHERE m.fund = f.fund) AS subquery
WHERE subquery.ranked < 3;
