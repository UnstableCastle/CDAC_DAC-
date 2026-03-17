DROP PROCEDURE IF EXISTS checkuser;
DELIMITER $

CREATE PROCEDURE checkuser()
BEGIN

    DECLARE m VARCHAR(200) DEFAULT ' in log file';

    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        SELECT ' query terminated ' AS alert;
    END;

    IF EXISTS (SELECT 1 FROM login WHERE emailId IS NOT NULL) THEN
        SELECT 'Found users with an emailId' AS alert;
        
        SELECT username, password FROM login WHERE emailId IS NOT NULL;
        
    ELSEIF EXISTS (SELECT 1 FROM login WHERE emailId IS NULL) THEN 
        INSERT INTO log(message) VALUES(m);
        SELECT 'inserted in log' AS alert;
        
        SELECT user, password FROM login WHERE emailId IS NULL;
        
    END IF;

END$
DELIMITER ;