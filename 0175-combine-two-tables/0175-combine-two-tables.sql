# Write your MySQL query statement below
select firstName,
       lastName,
       city,
       state
from Person pr
left join Address ad
on pr.personId=ad.personId;
