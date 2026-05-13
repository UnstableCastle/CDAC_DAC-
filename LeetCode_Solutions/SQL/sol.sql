-- combine two tables
SELECT p.firstname,p.lastname,a.city,a.state from Person p
Left join Address a on p.personId = a.personId;

-- Second highest salary
SELECT p.firstname,p.lastname,a.city,a.state from Person p 
Left join Address a on p.personId = a.personId;

-- nth highest salary
  CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
 SET N = N - 1;
    RETURN (
         # Write your MySQL query statement below.
        SELECT DISTINCT salary
        FROM Employee
        ORDER BY salary DESC
        LIMIT N, 1
    );
END

--584. Find Customer Referee
SELECT name FROM Customer WHERE referee_id IS NULL OR referee_id <> 2;