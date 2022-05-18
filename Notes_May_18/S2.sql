-- Display information about Policy Table

DESC Policy;

-- Display all records from Policy Table 

select * from Policy;

-- Display all records whose AnnualPremium greater than 1 lakh 

select * from Policy where annualpremium > 100000;

-- Dispaly PolicyId,AppNumber,AppDate,AnnualPremium,
-- PaymentId from Policy Table

select PolicyId,AppNumber,AppDate,AnnualPremium,
PaymentModeID from Policy;

-- Display all Policy records for Yearly Payment 
-- Means (PaymentMode is 1)

select * from Policy where PaymentModeId=1;

-- Display all Agent Table records sort by Gender, FirstName
-- in ascending order 

select * from Agent order by Gender,FirstName;