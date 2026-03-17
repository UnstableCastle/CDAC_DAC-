DROP PROCEDURE IF EXISTS PRO5;
DELIMITER $

CREATE PROCEDURE PRO5(x int )
BEGIN
    if x < 0  then select "Number is Negitive " alert;
    elseif x > 0 then select "Number is positive " alert;
        elseif  x = 0 then select "Number is equal to zero " alert; 
    end if;
    
END $

DELIMITER ;
