DROP TRIGGER IF EXISTS updateStudent;
delimiter $
create trigger updateStudent after update on student for each row
begin
insert into student_log values(new.id,new.namefirst,new.namelast,new.DOB,new.emailID);
end$
delimiter ; 