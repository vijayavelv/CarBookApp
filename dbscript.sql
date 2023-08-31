CREATE DATABASE carbookapp;

USE carbookapp;

create table dealer_details(
dealer_id int(8) NOT NULL AUTO_INCREMENT,
dealer_name varchar(50) NOT NULL,
address varchar(100) NOT NULL,
contact_no varchar(15) NOT NULL,
email_id varchar(50) NOT NULL,
last_updated_by varchar(50),
last_updated_time timestamp NOT NULL,
 PRIMARY KEY (dealer_id)
);

create table roles(
role_id int NOT NULL,
role_name varchar(10) NOT NULL,
PRIMARY KEY (role_id)
);

drop table login_details;

create table login_details(	
user_id int  NOT NULL AUTO_INCREMENT,
User_name varchar(20)  NOT NULL,
password varchar(32)  NOT NULL,
dealer_id int NOT NULL,
FOREIGN KEY (dealer_id) REFERENCES dealer_details(dealer_id),
role_id int NOT NULL,
 FOREIGN KEY (role_id) REFERENCES roles(role_id),
last_updated_by varchar(50),
Last_updated_time timestamp Not NUll,
 PRIMARY KEY (user_id)
);


create table customer_details(
cust_id int(8) NOT NULL AUTO_INCREMENT,
cust_name varchar(50) NOT NULL,
mobile_no varchar(15) NOT NULL,
email_id varchar(50) NOT NULL,
address varchar(100) NOT NULL,
last_updated_by varchar(50),
last_updated_time timestamp NOT NULL,
 PRIMARY KEY (cust_id)
);


create table vehicle_model(
model_id int(8) NOT NULL AUTO_INCREMENT,
model_name varchar(50) NOT NULL,
last_updated_by varchar(50),
last_updated_time timestamp NOT NULL,
 PRIMARY KEY (model_id )
);


create table vehicle_body(
body_id int(8) NOT NULL AUTO_INCREMENT,
body_type varchar(50) NOT NULL,
model_id int(8) NOT NULL,
FOREIGN KEY (model_id)
        REFERENCES vehicle_model(model_id),
last_updated_by varchar(50),
last_updated_time timestamp NOT NULL,
 PRIMARY KEY (body_id )
);

create table vehicle_engine(
engine_id int(8) NOT NULL AUTO_INCREMENT,
engine_name varchar(50) NOT NULL,
model_id int(8) NOT NULL,
FOREIGN KEY (model_id)
        REFERENCES vehicle_model(model_id)
        ON DELETE CASCADE,
price int not null,
last_updated_by varchar(50),
last_updated_time timestamp NOT NULL,
 PRIMARY KEY (engine_id )
);


create table vehicle_line(
line_id int(8) NOT NULL AUTO_INCREMENT,
line_name varchar(50) NOT NULL,
model_id int(8) NOT NULL,
FOREIGN KEY (model_id) REFERENCES vehicle_model(model_id),
Engine_id int(8) not null,
FOREIGN KEY (engine_id) REFERENCES vehicle_engine(engine_id),
price int not null,
last_updated_by varchar(50),
last_updated_time timestamp NOT NULL,
 PRIMARY KEY (line_id )
);


create table vehicle_equipment(
equipment_id int(8) NOT NULL AUTO_INCREMENT,
equipment_name varchar(50) NOT NULL,
model_id int(8) NOT NULL,
FOREIGN KEY (model_id)
        REFERENCES vehicle_model(model_id),
Engine_id int(8) not null,
FOREIGN KEY (engine_id)
        REFERENCES vehicle_engine(engine_id),
price int not null,
last_updated_by varchar(50),
last_updated_time timestamp NOT NULL,
 PRIMARY KEY (equipment_id )
);

create table vehicle_paint(
paint_id int(8) NOT NULL AUTO_INCREMENT,
paint_name varchar(50) NOT NULL,
paint_type varchar(10) NOT NULL,
model_id int(8) NOT NULL,
FOREIGN KEY (model_id)
        REFERENCES vehicle_model(model_id),
price int not null,
last_updated_by varchar(50),
last_updated_time timestamp NOT NULL,
 PRIMARY KEY (paint_id )
);


create table vehicle_transaction(
transaction_id int(8) NOT NULL AUTO_INCREMENT,
cust_id int not null,
FOREIGN KEY (cust_id) REFERENCES customer_details(cust_id),
LINE_ID INT NOT NULL,
FOREIGN KEY (LINE_ID) REFERENCES vehicle_line(LINE_ID),
model_id int(8) NOT NULL,
FOREIGN KEY (model_id) REFERENCES vehicle_model(model_id),
body_id int(8) NOT NULL,
FOREIGN KEY (body_id) REFERENCES vehicle_body(body_id),  
Engine_id int(8) not null,
FOREIGN KEY (engine_id) REFERENCES vehicle_engine(engine_id),
equipment_id int(8) NOT NULL,
FOREIGN KEY (equipment_id) REFERENCES vehicle_equipment(equipment_id),
INT_PAINT_id int NOT NULL,
FOREIGN KEY (INT_PAINT_id) REFERENCES vehicle_paint(paint_id),
EXT_PAINT_id int NOT NULL,
FOREIGN KEY (INT_PAINT_id) REFERENCES vehicle_paint(paint_id),
DISCOUNT INT NOT NULL,
total_price int not null,
last_updated_by varchar(50),
last_updated_time timestamp NOT NULL,
 PRIMARY KEY (transaction_id )
);

create table order_details(
order_id int NOT NULL AUTO_INCREMENT,
transaction_id int NOT NULL,
FOREIGN KEY (transaction_id) REFERENCES vehicle_transaction(transaction_id),
Order_date date not null,
EST_delivery_date date not null,
actual_delivery_date date not null,
order_status varchar(20) NOT NULL,
transport_cost int not null,
total_price int not null,
last_updated_by varchar(50),
last_updated_time timestamp NOT NULL,
 PRIMARY KEY (order_id )
);