DROP FUNCTION IF EXISTS get_total_marks;

DELIMITER $

CREATE FUNCTION get_total_marks(sid INT)
RETURNS INT

BEGIN
    DECLARE total INT DEFAULT 0;

    SELECT IFNULL(SUM(marks), 0)
    INTO total
    FROM student_qualifications
    WHERE studentID = sid
      AND name IN ('10', '12', 'BE');

    RETURN total;
END $

DELIMITER ;
