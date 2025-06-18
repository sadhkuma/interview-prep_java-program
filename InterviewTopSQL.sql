CREATE DATABASE ORG;
SHOW DATABASES;
USE ORG;

CREATE TABLE Worker (
	WORKER_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	FIRST_NAME CHAR(25),
	LAST_NAME CHAR(25),
	SALARY INT(15),
	JOINING_DATE DATETIME,
	DEPARTMENT CHAR(25)
);

INSERT INTO Worker 
	(WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
		(001, 'Monika', 'Arora', 100000, '21-02-20 09.00.00', 'HR'),
		(002, 'Niharika', 'Verma', 80000, '21-06-11 09.00.00', 'Admin'),
		(003, 'Vishal', 'Singhal', 300000, '21-02-20 09.00.00', 'HR'),
		(004, 'Amitabh', 'Singh', 500000, '21-02-20 09.00.00', 'Admin'),
		(005, 'Vivek', 'Bhati', 500000, '21-06-11 09.00.00', 'Admin'),
		(006, 'Vipul', 'Diwan', 200000, '21-06-11 09.00.00', 'Account'),
		(007, 'Satish', 'Kumar', 75000, '21-01-20 09.00.00', 'Account'),
		(008, 'Geetika', 'Chauhan', 90000, '21-04-11 09.00.00', 'Admin');

CREATE TABLE Bonus (
	WORKER_REF_ID INT,
	BONUS_AMOUNT INT(10),
	BONUS_DATE DATETIME,
	FOREIGN KEY (WORKER_REF_ID)
		REFERENCES Worker(WORKER_ID)
        ON DELETE CASCADE
);

INSERT INTO Bonus 
	(WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE) VALUES
		(001, 5000, '23-02-20'),
		(002, 3000, '23-06-11'),
		(003, 4000, '23-02-20'),
		(001, 4500, '23-02-20'),
		(002, 3500, '23-06-11');
		
		
		
		=========================================
		
		CREATE TABLE Title (
	WORKER_REF_ID INT,
	WORKER_TITLE CHAR(25),
	AFFECTED_FROM DATETIME,
	FOREIGN KEY (WORKER_REF_ID)
		REFERENCES Worker(WORKER_ID)
        ON DELETE CASCADE
);

INSERT INTO Title 
	(WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM) VALUES
 (001, 'Manager', '2023-02-20 00:00:00'),
 (002, 'Executive', '2023-06-11 00:00:00'),
 (008, 'Executive', '2023-06-11 00:00:00'),
 (005, 'Manager', '2023-06-11 00:00:00'),
 (004, 'Asst. Manager', '2023-06-11 00:00:00'),
 (007, 'Executive', '2023-06-11 00:00:00'),
 (006, 'Lead', '2023-06-11 00:00:00'),
 (003, 'Lead', '2023-06-11 00:00:00');
 
 
 
 #Q-1. Write an SQL query to fetch “FIRST_NAME” from the Worker table using the alias name <WORKER_NAME>.

select FIRST_NAME  as WORKER_NAME
from worker;

#Q-2. Write an SQL query to fetch “FIRST_NAME” from the Worker table in upper case.
select ucase(FIRST_NAME) from worker;

#Q-3. Write an SQL query to fetch unique values of DEPARTMENT from the Worker table.

select DEPARTMENT from worker
group by DEPARTMENT;

select distinct DEPARTMENT from worker;

#Q-4. Write an SQL query to print the first three characters of  FIRST_NAME from the Worker table.

select  substr(FIRST_NAME,1,3) from worker;

#Q-5. Write an SQL query to find the position of the alphabet (‘a’) in the first name column ‘Amitabh’ from the Worker table.

select instr(FIRST_NAME,"a") from worker
where FIRST_NAME="Amitabh";

select position("a"in FIRST_NAME) from worker
where FIRST_NAME="Amitabh";

#Q-6. Write an SQL query to print the FIRST_NAME from the Worker table after removing white spaces from the right side.

select rtrim(FIRST_NAME) from worker;

#Q-7. Write an SQL query to print the DEPARTMENT from the Worker table after removing white spaces from the left side.

select ltrim(DEPARTMENT) from worker;

#Q-8. Write an SQL query that fetches the unique values of DEPARTMENT from the Worker table and prints its length
Select distinct length(DEPARTMENT) from Worker;

#Q-9. Write an SQL query to print the FIRST_NAME from the Worker table after replacing ‘a’ with ‘A’.
select  replace( FIRST_NAME,"a","A") from worker;

#Q-10. Write an SQL query to print the FIRST_NAME and LAST_NAME from the Worker table into a single column COMPLETE_NAME. A space char should separate them.
select concat(FIRST_NAME," ",LAST_NAME)  as COMPLETE_NAME from worker;

#Q-11. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME Ascending.
select * from worker order by FIRST_NAME;

#Q-12. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME Ascending and DEPARTMENT Descending.
select * from worker 
order by FIRST_NAME asc,DEPARTMENT desc;

#Q-13. Write an SQL query to print details for Workers with the first names “Vipul” and “Satish” from the Worker table.

Select * from Worker where FIRST_NAME in ('Vipul','Satish');

#Q-15. Write an SQL query to print details of Workers with DEPARTMENT name as “Admin”.
Select * from Worker where DEPARTMENT like 'Admin%';

#Q-16. Write an SQL query to print details of the Workers whose FIRST_NAME contains ‘a’.
Select FIRST_NAME from Worker
 where FIRST_NAME like '%a%';
 
 #Q-18. Write an SQL query to print details of the Workers whose FIRST_NAME ends with ‘h’ and contains six alphabets.
 Select * from Worker
 where FIRST_NAME like '_____h';
 
 #Q-19. Write an SQL query to print details of the Workers whose SALARY lies between 100000 and 500000.
 select * from worker
 where SALARY between 100000 and 500000;
 
 
 
 #Q-20. Write an SQL query to print details of the Workers who joined in Feb 2021.
select * from  worker
where year(JOINING_DATE)=2021 and month(JOINING_DATE)=2;

#Q-21. Write an SQL query to fetch the count of employees working in the department ‘Admin’.
select count(*) from worker
where DEPARTMENT='Admin';

select count(*) from worker
group by DEPARTMENT
having DEPARTMENT='Admin';


use org;
#Q-40. Write an SQL query to fetch the departments that have less than five people in them.
SELECT DEPARTMENT, COUNT(WORKER_ID) as 'Number of Workers' FROM Worker GROUP BY DEPARTMENT HAVING COUNT(WORKER_ID) < 5;

#Q-41. Write an SQL query to show all departments along with the number of people in there.
SELECT DEPARTMENT, COUNT(WORKER_ID) as 'Number of Workers' FROM Worker GROUP BY DEPARTMENT;

#Q-42. Write an SQL query to show the last record from a table.
select * from worker 
 where WORKER_ID= (select  max(WORKER_ID)  from worker);
 
 select * from worker
 where WORKER_ID>(select count(*) from worker)-1;
 
 #Q-44. Write an SQL query to fetch the last five records from a table.
 select * from worker;
 
 (SELECT * FROM worker ORDER BY WORKER_ID DESC LIMIT 5)
ORDER BY WORKER_ID ASC;

SELECT * FROM worker
WHERE 
WORKER_ID > (SELECT COUNT(*) FROM worker) - 5;

#Q-46. Write an SQL query to fetch three max salaries from a table.
select   distinct SALARY from worker order by SALARY desc limit 3;

#Q-45. Write an SQL query to print the names of employees having the highest salary in each department.
select DEPARTMENT,max(SALARY) from worker
group by DEPARTMENT;

#Q-47. Write an SQL query to fetch three min salaries from a table.
select SALARY from worker order by SALARY limit 3;


===========================================

#Q-1. Write an SQL query to fetch “FIRST_NAME” from the Worker table using the alias name <WORKER_NAME>.

select FIRST_NAME  as WORKER_NAME
from worker;

#Q-2. Write an SQL query to fetch “FIRST_NAME” from the Worker table in upper case.
select ucase(FIRST_NAME) from worker;

#Q-3. Write an SQL query to fetch unique values of DEPARTMENT from the Worker table.

select DEPARTMENT from worker
group by DEPARTMENT;

select distinct DEPARTMENT from worker;

#Q-4. Write an SQL query to print the first three characters of  FIRST_NAME from the Worker table.

select  substr(FIRST_NAME,1,3) from worker;

#Q-5. Write an SQL query to find the position of the alphabet (‘a’) in the first name column ‘Amitabh’ from the Worker table.

select instr(FIRST_NAME,"a") from worker
where FIRST_NAME="Amitabh";

select position("a"in FIRST_NAME) from worker
where FIRST_NAME="Amitabh";

#Q-6. Write an SQL query to print the FIRST_NAME from the Worker table after removing white spaces from the right side.

select rtrim(FIRST_NAME) from worker;

#Q-7. Write an SQL query to print the DEPARTMENT from the Worker table after removing white spaces from the left side.

select ltrim(DEPARTMENT) from worker;

#Q-8. Write an SQL query that fetches the unique values of DEPARTMENT from the Worker table and prints its length
Select distinct length(DEPARTMENT) from Worker;

#Q-9. Write an SQL query to print the FIRST_NAME from the Worker table after replacing ‘a’ with ‘A’.
select  replace( FIRST_NAME,"a","A") from worker;

#Q-10. Write an SQL query to print the FIRST_NAME and LAST_NAME from the Worker table into a single column COMPLETE_NAME. A space char should separate them.
select concat(FIRST_NAME," ",LAST_NAME)  as COMPLETE_NAME from worker;

#Q-11. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME Ascending.
select * from worker order by FIRST_NAME;

#Q-12. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME Ascending and DEPARTMENT Descending.
select * from worker 
order by FIRST_NAME asc,DEPARTMENT desc;

#Q-13. Write an SQL query to print details for Workers with the first names “Vipul” and “Satish” from the Worker table.

Select * from Worker where FIRST_NAME in ('Vipul','Satish');

#Q-15. Write an SQL query to print details of Workers with DEPARTMENT name as “Admin”.
Select * from Worker where DEPARTMENT like 'Admin%';

#Q-16. Write an SQL query to print details of the Workers whose FIRST_NAME contains ‘a’.
Select FIRST_NAME from Worker
 where FIRST_NAME like '%a%';
 
 #Q-18. Write an SQL query to print details of the Workers whose FIRST_NAME ends with ‘h’ and contains six alphabets.
 Select * from Worker
 where FIRST_NAME like '_____h';
 
 #Q-19. Write an SQL query to print details of the Workers whose SALARY lies between 100000 and 500000.
 select * from worker
 where SALARY between 100000 and 500000;
 
 #Q-20. Write an SQL query to print details of the Workers who joined in Feb 2021.
select * from  worker
where year(JOINING_DATE)=2021 and month(JOINING_DATE)=2;

#Q-21. Write an SQL query to fetch the count of employees working in the department ‘Admin’.
select count(*) from worker
where DEPARTMENT='Admin';

select count(*) from worker
group by DEPARTMENT
having DEPARTMENT='Admin';