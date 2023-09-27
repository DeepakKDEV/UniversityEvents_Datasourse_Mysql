create database UniversityEventDB;
use UniversityEventDB;

desc event_model;
select * from event_model;

select * from student_model;

select age from student_model;
select age  from student_model where  age>24;

select department from  student_model where department="ME";

select event_id from event_model where  event_id=444 ;

SELECT date, end_time, event_name, location_of_event
FROM event_model
WHERE event_id = 444;
