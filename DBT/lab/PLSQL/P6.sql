DROP PROCEDURE IF EXISTS PRO6;
DELIMITER $

CREATE PROCEDURE PRO6(IN p_val VARCHAR(20))
BEGIN
    DECLARE v_msg VARCHAR(20);
  
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
        SET autocommit = 0; 
        SELECT 'Query rolled back' AS alert;
    END;

    SET v_msg = 'Record inserted'; 
    
    SET autocommit = 0;

    START TRANSACTION READ WRITE;
    
        INSERT INTO test1(X1) VALUES(p_val);
        
    COMMIT;

    SET autocommit = 1;
    SELECT v_msg AS alert;

END $

DELIMITER ;