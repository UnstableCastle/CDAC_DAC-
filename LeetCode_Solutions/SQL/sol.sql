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

--1280. Students and Examinations
SELECT  s.student_id,s.student_name,sub.subject_name,COUNT(e.subject_name) AS attended_exams FROM Students s JOIN Subjects sub LEFT JOIN Examinations e
ON s.student_id = e.student_id AND sub.subject_name = e.subject_name GROUP BY s.student_id, s.student_name, sub.subject_name ORDER BY s.student_id,sub.subject_name;