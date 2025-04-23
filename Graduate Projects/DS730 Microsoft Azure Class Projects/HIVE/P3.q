DROP TABLE IF EXISTS financial;
CREATE EXTERNAL TABLE IF NOT EXISTS financial(fund STRING, year INT, month INT, day INT, open DOUBLE, high DOUBLE, low DOUBLE, close DOUBLE, volume INT, openint INT)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LOCATION '/user/maria_dev/hivetest/financial';

SELECT f1.maxclose, f1.year
FROM
  (SELECT fund, year, max(close) AS maxclose
  FROM financial
  GROUP BY fund, year) AS f1
WHERE f1.fund == 'aadr.us';