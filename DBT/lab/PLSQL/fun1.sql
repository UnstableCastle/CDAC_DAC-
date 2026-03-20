drop function if exists fun1;
delimiter $
create function fun1() returns varchar(20)
begin
declare x varchar(100);
-- return concat("hello-0>",123);
select concat('hello ',123) into x;
return x ;
end $
delimiter ; 


 
