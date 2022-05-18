-- Having clause use to check the conditions in aggregate fields. 

-- What is the difference between WHERE clause and Having Clause 

-- Where clause used to check the conditions on table_fields, and Having clause can be used to check condition on
-- Aggregate Fields, means group by field needs to check condition then we need the help of having 

-- Display total salary paying to each job, where total salary > 5000
select job,sum(sal) from Emp
group by job
having sum(sal) > 5000;

-- Display Summary report as how many employees working in each job, and display records in which more than 1 
-- employ working

select job, count(*) from Emp
group by job
having count(*) > 1;

-- Display the highest, lowest, sum, and average salary of all employees. Label the columns
-- Maximum, Minimum, Sum, and Average, respectively. Round your results to the nearest whole 
-- number.

select max(sal) 'Highest Salary', min(sal) 'Minimum Salary', sum(sal) 'Total Salary',
avg(sal) 'Average Salary'
from Emp ;

select job, max(sal) 'Highest Salary', min(sal) 'Minimum Salary', sum(sal) 'Total Salary',
avg(sal) 'Average Salary'
from Emp group by job;

-- Write a query to display the number of people with the same job

select job,count(*) from Emp 
group by job;

-- Determine the number of managers without listing them. Label the column Number of Managers

select count(*) from Emp where job='Manager';

select max(sal)-min(sal) 'DIFFERENCE' from Emp;

select count(*), year(Hiredate) from Emp 
where 
Year(Hiredate) in(1980,1981,1982)
group by year(Hiredate) ;