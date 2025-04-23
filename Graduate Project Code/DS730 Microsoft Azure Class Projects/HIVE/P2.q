DROP TABLE IF EXISTS financial;
CREATE EXTERNAL TABLE IF NOT EXISTS financial(fund STRING, year INT, month INT, day INT, open DOUBLE, high DOUBLE, low DOUBLE, close DOUBLE, volume INT, openint INT)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LOCATION '/user/maria_dev/hivetest/financial';

SELECT subquery.fund
FROM
  (SELECT f.fund, f.avgvolume, DENSE_RANK() OVER (ORDER BY f.avgvolume DESC) AS ranked
  FROM
	(SELECT fund, avg(volume) AS avgvolume
	FROM financial
	WHERE year == 2013
	GROUP BY fund) AS f) AS subquery
WHERE subquery.ranked == 3;