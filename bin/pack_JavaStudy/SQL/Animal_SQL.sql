create database FCT;
use FCT;
create table Animals_INS(
ANIMAL_ID			VARCHAR(7)	not null,
ANIMAL_TYPE			VARCHAR(50)	not null,
DATETIMES			DATETIME	not null,
INTAKE_CONDITION	VARCHAR(20)	not null,
NAME				VARCHAR(50)			,
SEX_UPON_INTAKE		VARCHAR(90) not null
);

insert into Animals_ins values('A399552','Dog','2013-10-14 15:38:00','Normal','Jack','Neutered Male');
insert into Animals_ins values('A379998','Dog','2013-10-23 11:42:00','Normal','Disciple','Intact Male');
insert into Animals_ins values('A370852','Dog','2013-11-03 15:04:00','Normal','Katie','Spayed Female');
insert into Animals_ins values('A403564','Dog','2013-11-18 17:03:00','Normal','Anna','Spayed Female');


select * from Animals_INS order by DATETIMES asc;
SELECT DATETIMES FROM Animals_INS WHERE 1=1 AND DATETIMES IN (SELECT max(DATETIMES) FROM Animals_INS);
/*SELECT DATETIME
FROM Animal_INS 
WHERE 1=1 
AND DATETIME 
IN (SELECT min(DATETIME) 
FROM Animal_INS);*/
select * from usertbl order by mdate asc;
desc Animals_ins;
select * from Animals_ins;

drop table Animals_INS;