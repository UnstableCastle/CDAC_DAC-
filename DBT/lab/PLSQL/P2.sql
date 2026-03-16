DROP PROCEDURE IF exists PRO2;
DELIMITER $
CREATE procedure PRO2(IN X INT ,IN Y INT)
begin

select X + Y AS addition ;



END $
DELIMITER ;
