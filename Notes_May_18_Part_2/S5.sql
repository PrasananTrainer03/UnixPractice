desc Dept;
desc Emp;

select Dept.Deptno,Dname,Empno,Ename,job,sal
from Dept,Emp 
Where Dept.Deptno=Emp.Deptno;

select Dept.Deptno,Dname,Empno,Ename,Job,Sal
from Dept INNER JOIN EMP 
ON Dept.Deptno=EMP.Deptno;

select D.Deptno, Dname,Empno,Ename,Job,Sal
from Dept D INNER JOIN EMP E
ON D.Deptno=E.Deptno;

select A.AgentID,FirstName,LastName,City,SSN,
P.PolicyID,ModalPremium,AnnualPremium,PaymentModeID
from Agent A INNER JOIN AgentPolicy AP
ON A.AgentID=AP.AgentID
INNER JOIN Policy P 
ON P.PolicyID=AP.PolicyID;

-- LEFT OUTER JOIN

select D.Deptno, Dname,Empno,Ename,Job,Sal
from Dept D LEFT JOIN EMP E
ON D.Deptno=E.Deptno;

select A.AgentID,FirstName,LastName,City,SSN,
P.PolicyID,ModalPremium,AnnualPremium,PaymentModeID
from Agent A LEFT JOIN AgentPolicy AP
ON A.AgentID=AP.AgentID
LEFT JOIN Policy P 
ON P.PolicyID=AP.PolicyID;

-- RIGHT OUTER JOIN

select D.Deptno, Dname,Empno,Ename,Job,Sal
from Dept D RIGHT JOIN EMP E
ON D.Deptno=E.Deptno;

select A.AgentID,FirstName,LastName,City,SSN,
P.PolicyID,ModalPremium,AnnualPremium,PaymentModeID
from Agent A RIGHT JOIN AgentPolicy AP
ON A.AgentID=AP.AgentID
RIGHT JOIN Policy P 
ON P.PolicyID=AP.PolicyID;

-- Cross Join 

select * from Dept cross join Emp;

select * from Agent cross join AgentPolicy;

select * from Policy cross join AgentPolicy;

-- SELF JOIN : If a table joins with itself, known as self-join 

select empno,ename,job,mgr from Emp;

select E1.Empno 'Manager Id', 
E1.Ename 'Manager Name', 
E2.Empno 'Employ Id',
E2.Ename 'Employ Name'
from Emp E1 INNER JOIN Emp E2 
ON E1.Empno=E2.Mgr
ORDER BY E1.Empno;