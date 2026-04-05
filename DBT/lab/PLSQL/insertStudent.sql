DROP TRIGGER IF EXISTS insertStudent;
DELIMITER $

CREATE TRIGGER insertStudent 
AFTER INSERT ON student 
FOR EACH ROW
BEGIN
    INSERT INTO log (cd, ct, message)
    VALUES (CURDATE(), CURTIME(), 'Record inserted');
END $

DELIMITER ;
