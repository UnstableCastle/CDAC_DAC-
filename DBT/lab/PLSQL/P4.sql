DROP PROCEDURE IF EXISTS PRO4;
DELIMITER $

CREATE PROCEDURE PRO4()
BEGIN
    DECLARE x INT DEFAULT 0;

    label1: LOOP
        SET x = x + 1;
        SELECT x;

        IF x = 10 THEN
            LEAVE label1;
        END IF;

    END LOOP label1;

END $

DELIMITER ;
