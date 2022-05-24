drop database if exists tb35practice;

create database tb35practice;

use tb35practice;

/* ****************************************************************************
						Createing Employ Table
   ****************************************************************************
*/

drop table if exists employ;

create table Employ
(
   Empno INT primary key,
   Name varchar(30),
   Gender ENUM('MALE','FEMALE'),
   Dept varchar(30),
   Desig varchar(30),
   Basic numeric(9,2)
);

/* **********************************************************************************
				Inserting Records into Employ Table 
   **********************************************************************************
*/

Insert into Employ(empno,name,gender,dept,desig,basic) 
values(1,'Ramya','FEMALE','Java','Programmer',94343),
(2,'Ganesh Sai','MALE','Dotnet','Developer',94223),
(3,'Guru Datta','MALE','Java','Programmer',93234),
(4,'Lavanya','FEMALE','Dotnet','Developer',99424),
(5,'Mahati','FEMALE','Java','Programmer',99234);

select * from Employ;