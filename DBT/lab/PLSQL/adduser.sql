DROP PROCEDURE IF EXISTS adduser;
DELIMITER $

CREATE PROCEDURE adduser(
    IN iuser VARCHAR(20), 
    IN ipassword VARCHAR(255), 
    IN iemailID VARCHAR(20)
)
BEGIN
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        SELECT 'Error: Please enter valid data or check for duplicates.' AS alert;
    END;

    
    INSERT INTO login (user, password, emailID) 
    VALUES (iuser, ipassword, iemailID);
    
    
    SELECT 'NEW user ADDED' AS alert;

END $

DELIMITER ;