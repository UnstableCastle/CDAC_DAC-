drop procedure if exists PRO11;
delimiter $ 
create procedure PRO11()
BEGIN
update accounts set No_Type =  concat(AcType,"-",AcNo);

end $
delimiter ; 
