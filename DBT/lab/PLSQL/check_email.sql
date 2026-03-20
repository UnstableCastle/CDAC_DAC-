DROP FUNCTION IF EXISTS checkemail;

DELIMITER $$

CREATE FUNCTION checkemail(e VARCHAR(100)) 
RETURNS VARCHAR(200)
READS SQL DATA
BEGIN
    DECLARE details VARCHAR(200);

    IF EXISTS (SELECT 1 FROM login WHERE emailId = e) THEN
        SELECT CONCAT('User : ',user, ' | ','Password : ', password) 
        INTO details 
        FROM login 
        WHERE emailId = e
        LIMIT 1;
    ELSE 
        SET details = 'employee not exists';
    END IF;

    RETURN details;
END $$

DELIMITER ;
