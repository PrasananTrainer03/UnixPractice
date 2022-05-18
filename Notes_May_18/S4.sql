-- Aggregate Functions 

-- sum() -> Used to perform sum operation on the given field

select sum(sal) from Emp; 

select sum(annualpremium) from Policy;

-- Avg() : Calculates avg. on the given table rows 

select avg(sal) from Emp;

select avg(annualpremium) from Policy;

-- max() : Display's the max. value 

select max(sal) from Emp;

-- min() : Display's the min. value

select min(sal) from Emp; 

-- count(*) : Displays total no.of records in the given table 

select count(*) from Emp; 

select count(*) from Agent;

select count(*) from Policy;

-- Group By : Used to generate summary reports. 

select sum(sal) from Emp;

select job,sum(sal) from Emp 
group by job;

-- Display total no.of employees working in each job 

select job, count(*) from Emp 
group by job;

-- Display max.sal of employees w.r.t. job 

select job, max(sal) from Emp
group by job;

select job, sum(sal), avg(sal),
	  max(sal), min(sal), count(*)
from Emp
group by job;
