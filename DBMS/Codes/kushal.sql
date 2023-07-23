create table kushal (rollno int,age int,surname varchar(10));
insert into kushal VALUES(24,24,'Tak');
select * from kushal; 

CREATE VIEW new_view AS
SELECT
    rollno,age
FROM
  kushal; 
SELECT * FROM new_view;




