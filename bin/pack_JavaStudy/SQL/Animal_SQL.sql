create database FCT;
use FCT;
create table Animal_INS(
ANIMAL_ID			VARCHAR(7)	not null,
ANIMAL_TYPE			VARCHAR(50)	not null,
DATETIME			DATETIME	not null,
INTAKE_CONDITION	VARCHAR(20)	not null,
NAME				VARCHAR(50)			,
SEX_UPON_INTAKE		VARCHAR(90) not null
);

insert into Animal_ins values('A349996','Cat','2018-01-22 14:32:00','Normal','Sugar','Neutered Male');
insert into Animal_ins values('A350276','Cat','2017-08-13 13:50:00','Normal','Jewel','Spayed Female');
insert into Animal_ins values('A396810','Dog','2016-08-22 16:13:00','Injured','Raven','Spayed Female');
insert into Animal_ins values('A410668','Cat','2015-11-19 13:41:00','Normal','Raven','Spayed Female');
select Animal_ID,Name from Animal_INS where INTAKE_CONDITION !='Aged' order by Animal_ID asc; /*22/06/14 S30*/
select Animal_ID,Name from Animal_INS order by Animal_ID asc;/*22/06/14 S30*/
select Animal_ID,Name,DateTime from Animal_INS order by Name asc , dateTime desc; /*22/06/13 S_34*/
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

drop table Animal_INS;