drop database if exists canteen15;

create database canteen15;

use canteen15;

Drop Table If exists OrderDetails;

Drop Table if Exists Restaurant;

Create Table Restaurant
(
   RestaurantId int primary key auto_increment,
   RestaurantName varchar(30),
   City varchar(30),
   State varchar(30),
   Mobile varchar(15),
   Email varchar(20),
   Type varchar(30),
   Rating varchar(10)
);

Insert into Restaurant(RestaurantName,City,State,Mobile,Type,Rating) 
values('McDonalds','Chennai','TN','94939442','NONVEG','4.8'),
('Sangeetha','Chennai','TN','94923845','VEG','4.8'),
('Arabic','Tirupathi','AP','94923855','NONVEG','4.9'),
('Minarva','Tirupathi','AP','94923853','NONVEG','4.5'),
('Chillies','Tirupathi','AP','94923533','NONVEG','5.0');

Drop Table IF EXISTS Menu;

Create Table Menu
(
    MenuID INT auto_increment Primary Key,
	ItemName varchar(30),
    Price Numeric(9,2),
    RestaurantId INT references Restaurant(RestaurantID),
    ItemType varchar(30)
);

Insert into Menu(ItemName,Price,RestaurantId,ItemType)
values('Veg Biryani',485,1,'VEG'),
('Chiken Tikka',999,1,'NON-VEG'),
('Butter Nan',44,2,'TANDURI'),
('ROTI',32,2,'TANDURI'),
('Manchuria',234,2,'STARTER'),
('RRChicken',999,2,'STARTER'),
('DOSA',200,3,'BREAKFAST'),
('IDLY',180,3,'BREAKFAST'),
('ONION DOSA',300,3,'BREAKFAST'),
('PANEER DOSA',320,3,'BREAKFAST'),
('Tandoori',999,4,'LUNCH'),
('Vaneela',300,4,'BEVERAGE'),
('StrawBerry',300,4,'BEVERAGE'),
('Chicken Biryani',999,4,'NONVEG'),
('Mughalai Biryani',1200,5,'NONVEG'),
('Fish Biryani',2994,5,'NONVEG');

Drop Table IF Exists Customer;

Drop Table if exists Customer;

Create Table Customer
(
   CustomerId INT Primary Key auto_increment,
   CustomerUserName varchar(30),
   CustomerPassword varchar(30),
   CustomerFirstName varchar(30),
   CustomerLastName varchar(30),
   CustomerEmail varchar(30),
   CustomerMobile varchar(15)
);

Insert into Customer(CustomerUserName,CustomerPassword,CustomerFirstName,
CustomerLastName,CustomerEmail,CustomerMobile) 
values('raju123','rajub234','Raju','Nernika','raju123@gmail.com','84838585'),
('Tharun23','Tharunk@333','Tharun','Kumar','tharaun@gmail.com','94235533'),
('venkatkiran','venkat@123','Venkat','Kiran','venkatk@gmail.com','949234555'),
('Chetansai','chetan@123','ChetanSai','Jinka','chetan@gmail.com','428385853'),
('Ashishsiri','Sirigowni@123','Ashish','Sirigowni','ashish@gmail.com','9923953344');

select * from customer;

Drop Table IF Exists Vendor;

Create Table Vendor
(
   VendorId INT auto_increment Primary Key,
   VendorUserName varchar(30) unique KEY,
   VendorPassword varchar(30),
   VendorFirstName varchar(30),
   VendorLastName varchar(30),
   VendorEmail varchar(30),
   VendorMobile varchar(30)
);

Insert into Vendor(VendorUserName,VendorPassword,VendorFirstName,VendorLastName,VendorEmail,
VendorMobile) values
('balan89','chennai@123','Balan','Venkata','balan@gmail.com','9239848834'),
('anu56','bordia@123','Anukrithi','Bordia','anu.delhi@gmail.com','88238845'),
('aarifk','saleem@123','Aarifa','Saleem','aarifkhan@gmail.com','92374737233'),
('ksheera','kolkatha@123','Ksheerabdhi','Patnaik','ramki9@gmail.com','8382384853'),
('saikumarm','infinite','Sai Kumar','Maganti','sai@gmail.com','88238453');

select * from Vendor;


Drop Table If Exists Wallet;

Create Table Wallet
(
    WalletId INT primary Key auto_increment,
    WalletType ENUM('GPAY','PAYTM','PHONEPE'),
    CustomerId INT references Customer(CustomerId),
    WalletAmount numeric(9,2)
);

/*  ************************************************************************************
					Inserting Records into Wallet Table 
	************************************************************************************
*/


Insert into Wallet(WalletType,CustomerId,WalletAmount)
values('PAYTM',1,4823),('PHONEPE',1,4884),
('PAYTM',2,5523),('GPAY',2,8483),('PHONEPE',2,5852),
('PAYTM',3,4842),('PHONEPE',3,8324),('GPAY',3,8482),
('PAYTM',4,8822),('PHONEPE',4,6323),
('PHONEPE',5,8823),('GPAY',5,4433);

select * from Wallet;

Create Table OrderDetails
(
   OrderID INT auto_increment Primary Key,
   CustomerId INT references Customer(CustomerID),
   VendorId INT references Vendor(VendorId),
   MenuId INT references Menu(MenuID),
   WalletSource varchar(30),
   OrderDate Date,
   OrderQuantity INT,
   OrderStatus ENUM('PENDING','ACCEPTED','REJECTED'),
   OrderComments varchar(30)
);

select * from OrderDetails;