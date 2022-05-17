-- Date Functions 

select curdate();

select curtime();

select dayofweek(curdate());

select dayofmonth(curdate());

select quarter(curdate());

-- last_day() : Displays the last day of date of month specified

select last_day(curdate());

-- adddate() : Used to add no.of days 

select adddate(curdate(),INTERVAL 5 day); 

select adddate(curdate(), INTERVAL 3 MONTH);

