create schema studentDB;

create table studentDB.Student(
  studentId int NOT NULL,
  firstname varchar(45) NOT NULL,
  lastname varchar(45) NOT NULL,
  yearLebel int NOT NULL,
  PRIMARY KEY (studentId)
);