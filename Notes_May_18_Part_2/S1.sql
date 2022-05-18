-- Aggregate Functions 

-- Sum() : Used to perform sum operation on the given table field. 

select sal from Emp;

select sum(sal) from Emp;

-- Avg() : used to perform avg. operation 

select avg(sal) from Emp;

-- max() : Display max. value 

select max(sal) from Emp;

-- min() : Displays the min. value 

select min(sal) from Emp;

-- Count(*) : Display's total no.of records 

select count(*) from Emp;

select sum(sal), avg(sal), max(sal),min(sal)
from Emp;

-- Group By : Used to perform aggregate operation on the given 
-- field 

select job, sum(sal) from Emp
group by job;

select job, max(sal) from Emp 
group by job;

select job, min(sal) from Emp 
group by job;

select job, count(*) from Emp 
group by job;

-- --------------------------------------------------------------------------------------------

select job,count(*) from Emp
Group By Job
having count(*) > 1;

select job, sum(sal) from Emp 
group by job 
having sum(sal) > 5000;



-- -------------------------------------------------------------------------------------------