-- how to change to Ts35 database 

use Ts35;

-- Display the tables avaialble in Ts35 database 

Show Tables;

-- Display structure of Emp table 

DESC Emp;

-- Display all records from Emp table 

select * from Emp;

-- Display Empno,Ename,Job,sal from Emp table 

select Empno, Ename, Job, Sal
from Emp;

-- Where Clause :Used to filter the database table records

-- Display all records whose sal <= 3000 

select * from Emp where sal <= 3000;

-- Display all records whose Job is 'CLERK' 

select * from Emp where Job='CLERK';

-- Display all records whose Ename is 'ADAMS'

select * from Emp where Ename='ADAMS';

-- Between...AND : Used to display values from start to end 

select * from Emp where sal between 1000 and 3000;

select * from Emp where sal not between 1000 and 3000;

-- in clause :Used to check with multiple values of particular column 

select * from Emp where Job in('CLERK','MANAGER');

select * from Emp where job not in('CLERK','MANAGER');

-- LIKE operator : Used to display records w.r.t. Wild cards 

select * from Emp where Ename like 'S%';

select * from Emp where Ename like '%S';

select * from Emp Where ENAME LIKE 'J___S';

-- Order By : Used to display records w.r.t. Specific Field(s) in ascending or 
-- descending order

select Empno,Ename,Job,Sal,Mgr from Emp
order By Sal;

select Empno, Ename,JOb,Sal,Mgr from Emp
order By sal desc;

select Empno, Ename,job,sal,mgr from Emp
Order By Job,Ename;