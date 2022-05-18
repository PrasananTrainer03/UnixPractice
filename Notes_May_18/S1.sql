-- Display structure of Agent table
desc Agent;

-- Display all records from Agent Table 

select * from agent;

-- Display AgentId,FirstName,LastName,City,SSN from Agent table

select AgentId,FirstName,LastName,City,SSN
from Agent;

-- Display all records whose AgentId < 10 

select * from Agent where AgentID < 10;

-- Display all records whose gender is Female

select * from Agent where gender='Female';

-- Display all recores who are born in 1987 (field dob)

select * from Agent where year(dob)=1987;

-- Display all recods from agent who are unmarried 
-- Means (MartialStaus is 0)

select * from Agent where MaritalStatus=0;

