drop procedure if exists pro11;
delimiter $
create procedure pro11(IN x int , OUT y INT)
BEGIN 
 set y = x*x;
 
 end $
 delimiter ;