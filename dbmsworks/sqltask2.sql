
create table Customers(
customer_id int primary key auto_increment,
first_name varchar(20),
last_name varchar(20),
email varchar(20) unique,
phone_number varchar(15),
address varchar(20)
);

create table rooms(
room_id int primary key auto_increment,
room_type varchar(20),
price_per_night decimal(10,2),
room_status varchar(20),
floor_number varchar(20)
);

create table reservations(
reservation_id int primary key auto_increment,
customer_id int,
room_id int,
reservation_date date,
check_in_date date,
check_out_date date,
reservation_status varchar(20),
foreign key (customer_id) references customers(customer_id),
foreign key (room_id) references rooms(room_id)
);

create table payments(
payment_id int primary key auto_increment,
reservation_id int,
payment_date date,
amount_paid decimal(10,2),
payment_method varchar(20),
foreign key (reservation_id) references reservations(reservation_id)
);

create table staff(
staff_id int primary key auto_increment,
first_name varchar(10),
last_name varchar(10),
staff_role varchar(20),
hire_date date
);

create table room_assignments(
assignment_id int primary key auto_increment,
staff_id int,
room_id int,
assignment_date date,
task_description varchar(20),
foreign key (staff_id) references staff(staff_id),
foreign key (room_id) references rooms(room_id)
);

insert into customers(first_name,last_name,email,phone_number,address) values("Anjali","V","anjali@gmail.com",1234567890,
"Kottiyam"),("Arya","Sajeev","arya@gmail.com",8880978190,"Paripally"),("Asif","T","asif@gmail.com",9876543210,
"Kottiyam"),("Akhil","S","akhil@gmail.com",8765432109,"Ayathil"),("Alan","S","alan@gmail.com",7890123456,"Chathanoor");
select * from customers;

insert into rooms(room_type,price_per_night,room_status,floor_number) values ("Single",250.00,"occupied",3),
("Double",350.00,"occupied",2),("Single",250.00,"available",1),("Suite",450.00,"occupied",5),
("Double",200.00,"under maintenance",4);
select * from rooms;

insert into reservations(customer_id,room_id,reservation_date,check_in_date,check_out_date,reservation_status) values
(1,2,'2024-01-23','2024-02-14','2024-02-29',"confirmed"),(3,1,'2022-05-13','2022-07-14','2022-07-20',"cancelled"),
(4,4,'2024-11-01','2024-12-04','2024-12-19',"confirmed"),(2,3,'2023-07-23','2023-10-03','2023-11-29',"completed"),
(5,5,'2024-08-15','2024-08-20','2024-08-30',"cancelled");
select * from reservations;
insert into reservations values (6,1,4,'2022-09-06','2022-09-08','2022-09-11',"completed");



insert into payments (reservation_id,payment_date,amount_paid,payment_method) values (1,'2024-01-25',100.00,"credit card"),
(2,'2022-05-25',50.00,"cash"),(3,'2024-12-04',200.00,"cash"),(4,'2023-07-23',100.00,"credit card"),
(5,'2024-08-15',100.00,"credit card");
select * from payments;
insert into payments values (6,6,'2022-09-06',150,"cash");
update payments set payment_date='2024-10-13' where payment_id=6;

insert into staff(first_name,last_name,staff_role,hire_date) values ("Abhinav","Raj","Manager",'2012-03-11'),
("Krishna","S","Receptionalist",'2019-12-11'),("Hari","Krishnan","Housekeeper",'2021-09-24'),
("Vyshnav","Saji","Housekeeper",'2020-06-30'),("Abhija","J","Housekeeper",'2019-02-18');
select * from staff;

insert into room_assignments(staff_id,room_id,assignment_date,task_description) values(2,1,'2023-09-08',"Food and Beverages"),
(3,4,'2024-12-03',"Cleaning"),(5,2,'2023-02-08',"Cleaning"),(1,5,'2020-04-28',"Maintenence"),
(4,3,'2021-09-08',"food and beverages");
select * from room_assignments;

-- on a particular floor 
select r.room_type,r.price_per_night,r.room_status,rs.customer_id,rs.reservation_date,rs.check_in_date,
rs.check_out_date,rs.reservation_status,r.floor_number
from rooms r join reservations rs on r.room_id=rs.room_id
where floor_number=4;

-- ordered by check in date
select c.first_name,c.last_name,c.email,rs.reservation_date,rs.check_in_date,rs.check_out_date,rs.reservation_status
from customers c join reservations rs on c.customer_id=rs.customer_id 
order by rs.check_in_date;

-- customers who stayed more than 5 nights
select c.first_name,c.last_name,c.phone_number,rs.check_in_date,rs.check_out_date,datediff(rs.check_out_date,rs.check_in_date) 
as num_of_nights from customers c join reservations rs 
on c.customer_id=rs.customer_id 
where datediff(rs.check_out_date,rs.check_in_date)>5;

select * from room_assignments;

select s.staff_id from staff s 
where not exists (select 1 from room_assignments rs where s.staff_id=rs.staff_id);


-- total amount paid for each reservation
select reservation_id,sum(amount_paid) as total_amount_paid
from payments 
group by reservation_id;

-- avg room price
select room_type,avg(price_per_night) as price 
from rooms 
group by room_type;

-- total revenue in last month
select sum(amount_paid) as revenue 
from payments where payment_date>=date_sub(curdate(),interval 1 month);

-- staff member assigned to most rooms in last month
select s.staff_id,s.first_name,s.last_name,count(ra.assignment_id) as assignment 
from staff s join room_assignments ra
on s.staff_id=ra.staff_id where ra.assignment_date>=date_sub(curdate(),interval 1 month) 
group by s.staff_id;


select c.first_name,c.last_name,max(rs.reservation_date) as latest_reservation_date from reservations rs join
customers c on rs.customer_id=c.customer_id group by c.customer_id;


select r.*,c.first_name,c.last_name 
from customers c inner join reservations r on c.customer_id=r.customer_id;




















