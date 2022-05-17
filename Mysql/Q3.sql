-- String Functions 

-- instr() : Display's the first occurrence of given character

select instr('Ramyasri','a');

select Ename, Instr(Ename,'a') from Emp;

-- reverse() : Used to display string in reverse order

select reverse('Ramyasri');

select Ename, Reverse(Ename) from Emp;

-- Length() : Used to display length of string 

select length('Ramyasri');

select Ename, Length(Ename) from Emp;

-- LEFT() : Displays no.of left-side characters

select left('Welcome to Sql',4);

-- Right() : Displays no.of right-side characters

select right('Welcome to Sql',4);

-- Lower() : Displays in lower case

select ename,lower(ename) from Emp;

select 'Ramyasri',lower('Ramyasri'),
	Upper('Ramyasri');

-- Upper() : Displays in upper case

-- Concat() : Used to concatenate mutiple values

select concat('Sripada',' ','Subrahmanya');

-- Replace() : Used to replace old value with new
-- value in all occurrences 

select replace('Java Training','Java','MySql');

-- Substr(): Used to display part of the string 

select substr('welcome to mysql training',5,10);