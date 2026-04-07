


drop function if exists fn1;
delimiter $
create function fn1() returns varchar(100)
deterministic
BEGIN
	declare x varchar(100);
	set x :=  "Hello World";
	return x;
end$
delimiter ;





drop function if exists fn1;
delimiter $
create function fn1( x int, y int) returns int
deterministic
BEGIN
	return (ifnull(x,0) + ifnull(y,0));
end$
delimiter ;




drop function if exists fn1;
delimiter $
create function fn1() returns int
deterministic
BEGIN
	declare x int;
		select max(deptno) + 10 into x from dept;
		return x;
end$
delimiter ;



drop FUNCTION if exists fn1;
delimiter $
create FUNCTION fn1() returns varchar(100)
deterministic
BEGIN
  declare cnt int default 0;
  declare x varchar(30) default '';
  lbl:loop
   set cnt := cnt + 1;
	set x := concat(x, cast(char(floor(97 + rand() * 26)) as char));
	if cnt > 9  then
		leave lbl;
	end if;
  end loop lbl;
  return x;

end$
delimiter ;


/*
1. Create a UDF that extracts the domain name (part after @) from an email.

2. Write a UDF that returns tax as per:
	0% if salary < 2500
	5% if salary between 2500–5000
	10% if salary > 5000.

3. Create a UDF that returns the initials of a full name ("Saleel Bagde" → "S.B").

4. Write a UDF that returns the number of vowels in the string ("Saleel Bagde" → 5).

5. Write a UDF that converts the first letter of every word into uppercase and the  
   rest lowercase ("saleel bagde" → "Saleel Bagde"). 

*/




drop FUNCTION if exists fn1;
delimiter $
create FUNCTION fn1(x int) returns varchar(50)
deterministic
BEGIN
 declare a varchar(30);
 select substr(emailID, instr(emailID, '@')+1) into a from student where studentID = x;
 
 if a is not null then
	return a;
 else
	return "emailID not found for the give studentID";
 end if;
 
end$
delimiter ;