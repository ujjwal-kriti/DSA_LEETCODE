# Write your MySQL query statement below
delete k1
from person k1, person k2
where k1.email=k2.email
and k1.id>k2.id