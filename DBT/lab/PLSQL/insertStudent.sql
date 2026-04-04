DROP TRIGGER IF EXISTS insertStudent;
DELIMITER $

create TRIGGER insertStudent after insert ON student for each row
BEGIN
	insert into log (cdate, ctime , message)
    values(CURDATE(), CURTIME(), "Record inserted successfully");
END $

DELIMITER ;