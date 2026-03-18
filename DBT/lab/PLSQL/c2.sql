DROP PROCEDURE IF EXISTS PRO10;
DELIMITER $

CREATE PROCEDURE PRO10()
BEGIN
    DECLARE xen, xs, xdno INT;
    DECLARE xn, xjob VARCHAR(20); 
 
    DECLARE c1 CURSOR FOR SELECT empno, ename, job, sal, deptno FROM emp_cur;
    
    DECLARE EXIT HANDLER FOR 1329 SELECT "All applicable salaries updated." AS alert; 

    OPEN c1;
    label1: LOOP
        FETCH c1 INTO xen, xn, xjob, xs, xdno;
        
        IF xdno = 10 THEN  
            UPDATE emp_cur SET new_sal = sal + (sal * 15/100) WHERE empno = xen;
          ELSEIF xdno = 20 THEN  
            UPDATE emp_cur SET new_sal = sal + (sal * 20/100) WHERE empno = xen;   
			ELSEIF xdno = 30 THEN  
            UPDATE emp_cur SET new_sal = sal + (sal * 25/100) WHERE empno = xen;
        END IF;
        
    END LOOP label1;
    CLOSE c1;
 
END $
DELIMITER ;