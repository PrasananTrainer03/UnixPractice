use tb35practice;

drop table if exists Test;

create table Test
(
   empno int,
   name varchar(30),
   basic numeric(9,2)
);

-- Add a column gender to the Test table 

Alter table Test add gender ENUM('MALE','FEMALE');

-- Add a Column Dept to the Test Table

Alter table Test Add Dept varchar(30);

-- Describe the Table Test 

-- DESC Test;

-- Add Primary Key Constraint to test table on Empno Field 

Alter Table Test add primary key(empno);

-- Change the Name field size to 20 chars 

Alter Table Test modify Name varchar(20);

-- Drop the column gender 

Alter table Test Drop Column Gender;

DESC Test;