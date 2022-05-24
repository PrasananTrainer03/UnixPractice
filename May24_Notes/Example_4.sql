use tb35practice;

/* **************************************************************************************************
								Creating AgentPolicy Table 
   **************************************************************************************************
*/

Drop Table if exists AgentPolicy;

Create Table AgentPolicy
(
    AgentId INT, 
    PolicyID INT,
    IsSplitAgent INT,
    foreign key(AgentId) REFERENCES Agent(AgentId),
    foreign key(PolicyID) references Policy(PolicyId),
    primary key(AgentId,PolicyId)
);

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(1,1,2),
					(1,3,1),
					(2,3,1),
					(2,1,1),
					(2,4,1),
					(2,5,1),
					(4,1,2),
					(4,3,1),
					(5,1,2),
					(5,2,1);
                    
select * from AgentPolicy;                    
