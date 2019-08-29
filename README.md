# OracleSQL
DDL (Data Definition Language) is a language used by a database management system (like Oracle) that allows users to define the database and specify data types, structures and constraints on the data.

Examples DDL statements are: CREATE TABLE, CREATE INDEX, UPDATE, ALTER, and DROP.
```
create table employee (emp_id int, fName varchar(10), lName varchar(10), --create table
				CONSTRAINT employee_pk PRIMARY KEY (emp_id));
```


DML (Data Manipulation Language) statements are the element in the SQL language that is used for data retrieval and manipulation.
 
Examples DML statements are: INSERT, UPDATE, DELETE, and MERGE.
```
insert into employee (emp_id, fName, lName)			--insert values into table
				values (100, 'Raul', 'Muniz');
```

## Basic Queries
```
select * from EMPLOYEE;
select fName from employee, dept_emp where employee.emp_id = dept_emp.emp_id and dept_emp.salary = 11000; --first name with 11000 salary
select fName, lName from employee, dept_emp where employee.emp_id = dept_emp.emp_id order by salary asc;  --low to high
select fName, lName from employee, dept_emp where employee.emp_id = dept_emp.emp_id order by salary desc; --high to low
select max(salary) from employee, dept_emp where employee.emp_id = dept_emp.emp_id; --max salary
select count(fName) from employee, dept_emp, department where employee.emp_id = dept_emp.emp_id 		--count of people from Texas
														and dept_emp.dept_id = department.dept_id and deptState = 'Texas';
```
### SQL Joins
```
select fName, lName, salary from employee inner join dept_emp on dept_emp.emp_id = employee.emp_id;

```
