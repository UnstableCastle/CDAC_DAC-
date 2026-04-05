DROP TRIGGER IF EXISTS deleteStudent;
delimiter $
create trigger deleteStudent before delete on student for each row
begin
insert into student_log values(old.id,old.namefirst,old.namelast,old.DOB,old.emailID);
end$
delimiter ; 