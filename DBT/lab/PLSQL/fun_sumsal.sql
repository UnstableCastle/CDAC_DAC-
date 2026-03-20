drop function if exists sumsal;
delimiter $
create function sumsal(ideptno int) returns int
begin

declare sum int;

select sum(sal) into sum from emp where deptno =ideptno; 

return sum;
end$
delimiter ;


