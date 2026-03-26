# Write your MySQL query statement below
select w1.id
from weather w1 , weather w2
where w1.recordDate=DATE_ADD(w2.recordDate,INTERVAL 1 DAY)
AND w1.temperature > w2.temperature;