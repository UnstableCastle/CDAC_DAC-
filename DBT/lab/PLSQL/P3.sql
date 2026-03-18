DROP PROCEDURE IF exists PRO3;
DELIMITER $
CREATE procedure PRO3(IN ideptno INT , in isal int)
begin


select empno , ename ,deptno from emp where deptno = ideptno and sal >= isal;


END $
DELIMITER ;
