# Write your MySQL query statement below
SELECT x.id
FROM Weather x
JOIN Weather y 
  ON DATE_SUB(x.recordDate, INTERVAL 1 DAY) = y.recordDate
WHERE x.temperature > y.temperature;