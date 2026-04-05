DROP TRIGGER IF EXISTS insertDuplicate;
delimiter $
create trigger insertDuplicate after insert on student for each row
begin
insert into student_log values(new.id,new.namefirst,new.namelast,new.DOB,new.emailID);
end$
delimiter ; 