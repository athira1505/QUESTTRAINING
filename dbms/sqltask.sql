

create table Author(
author_id INT PRIMARY KEY auto_increment,
first_name VARCHAR(10),
last_name VARCHAR(10));

create table Books (
book_id INT PRIMARY KEY auto_increment, 
title VARCHAR(20),
author_id INT,
publcation_year YEAR,
price DECIMAL(10,2),
FOREIGN KEY (author_id) REFERENCES Author(author_id));


create table Borrowers(
borrower_id INT PRIMARY KEY auto_increment,
first_name VARCHAR(10),
last_name VARCHAR(10),
email  VARCHAR(20) UNIQUE,
dob DATE);

create table loans (
loan_id INT PRIMARY KEY auto_increment,
borrower_id INT,
book_id INT,
loan_date DATE,
return_date DATE,
FOREIGN KEY (borrower_id) REFERENCES Borrowers(borrower_id),
FOREIGN KEY (book_id) REFERENCES Books(book_id));

select * from author;
select * from books;
select * from borrowers;
select * from loans;

insert into Author (first_name,last_name) values ("Arya","B"),("Archa","B"),("Anjali","V"),("Abhija","J"),("Avani","Suresh");

insert into Books values (101,"ABC",1,1992,400.00);
insert into Books values (102,"PQR",3,1999,500.00);
insert into Books values (107,"LMN",4,2002,450.00);
insert into Books values (111,"HIJ",5,2013,600.00);
insert into Books values (123,"XYZ",2,2021,700.00);
insert into Books values (134,"The Great Gatsby",2,2020,20.00);



insert into Borrowers values (1001,"Athul","S","athul@gmail.com",'1990-06-12');
insert into Borrowers values (1002,"Akhil","Mathew","akhil@gmail.com",'1998-09-23');
insert into Borrowers (borrower_id,first_name,last_name,email,dob) values (1006,"Alfiya","Nazar","alfi@gmail.com",'2000-12-29'),
(1010,"Salman","Hassan","salman@gmail.com",'1997-01-23'),(1020,"Nandhana","S","nandhu@gmail.com",'1992-09-23');


insert into loans values (2001,1002,111,'2020-06-12','2021-01-01');
insert into loans values (2003,1001,101,'2024-08-12','2024-12-01');
insert into loans values(2004,1010,123,'2022-06-12','2022-12-01');
insert into loans values(2010,1006,107,'2024-06-11','2025-01-12');
insert into loans values(2111,1020,102,'2022-06-12','2022-01-01');

update books set title='Moby Dick' where book_id=101; 

select * from books;
select title,price,publcation_year from books where price>20;

select first_name,last_name,email from borrowers where borrower_id in 
(select borrower_id from loans where loan_date>'2024-01-01');


update books set title='Moby Dick' where book_id=101; 

delete from loans where book_id=(select book_id from books where title='Moby Dick');
delete from books where title='Moby Dick';

alter table books add genre VARCHAR(20);

select count(borrower_id) from borrowers;
select sum(price) from books;
select avg(price) from books;

select * from books where book_id in 
(select book_id from loans where borrower_id in
(select borrower_id from borrowers where timestampdiff(year,dob,CURDATE())>30));













