drop table if exists Salesman;
drop table if exists Region;
drop table if exists Product;
drop table if exists Sales;

CREATE TABLE Salesman(salesmanID INT PRIMARY KEY auto_increment,salesmanName VARCHAR(100) NOT NULL);

CREATE TABLE Region(regionID INT PRIMARY KEY,    regionName VARCHAR(50) NOT NULL );

CREATE TABLE Product(productID INT PRIMARY KEY,    productName VARCHAR(100) NOT NULL);

CREATE TABLE Sales(salesmanID INT,regionID INT,    productID INT,PRIMARY KEY (salesmanID, regionID, productID), FOREIGN KEY (salesmanID) REFERENCES Salesman(salesmanID),FOREIGN KEY (regionID) REFERENCES Region(regionID),    FOREIGN KEY (productID) REFERENCES Product(productID));

CREATE INDEX idx_sales_product ON Sales(productID);


INSERT INTO Salesman (salesmanID, salesmanName) VALUES(1, 'Saleel'), (2, 'Rahul'), (3, 'Omkar'), (4, 'Ninad');

INSERT INTO Region (regionID, regionName) VALUES(1, 'Region1'), (2, 'Region2'), (3, 'Region3'), (4, 'Region4');

INSERT INTO Product (productID, productName) VALUES(1,'Car'), (2, 'Bus'), (3, 'Cycle'), (4, 'Motorcycle'), (5, 'Shirt'), (6, 'Pant'), (7, 'Gloves'), (8, 'Book'),(9, 'Pencil'), (10, 'Notebook'), (11, 'Keyboard'), (12, 'Mouse'), (13, 'Pen Drive'), (14, 'CD'),(15, 'Monitors'), (16, 'Scanners'), (17, 'Photos'), (18, 'Photo Frames');

INSERT INTO Sales VALUES(1,1,1),(1,1,2),(1,2,1),(1,2,2),(1,2,3),(1,3,3),(1,3,4),(1,4,1);

INSERT INTO Sales VALUES(2,1,5),(2,1,6),(2,1,7),(2,2,7),(2,2,8),(2,2,9),(2,3,9),(2,3,10),(2,4,11),(2,4,12);

INSERT INTO Sales VALUES(3,1,11),(3,1,12),(3,2,13),(3,2,14),(3,3,15),(3,3,16),(3,4,16),(3,4,14);


INSERT INTO Sales VALUES(4,1,17),(4,1,18),(4,2,5),(4,2,6),(4,2,7),(4,3,3),(4,3,4),(4,4,2),(4,4,3),(4,4,1);

/*
Display complete sales data (Salesman, Region, Product).
Find all products sold by Saleel.
List all regions where Rahul works.
Display all products sold by Omkar.
Find all salesmen who sell Car.
List all products sold in Region3.
Find salesmen who sell both Car AND Bus.
Find salesmen who do not sell Cycle.
Display products sold in more than one region.
Count number of products sold by each salesman.
Find the region with maximum sales.
Find the most sold product.
Count total sales per region.
Find number of regions covered by each salesman.
Find salesmen working in all regions.
Find products sold by all salesmen.
Find common products between Saleel and Ninad.
Find unique products sold only by Omkar.
Find salesmen who sell only one product.
Find products not sold in Region1.
Find salesmen who sell more products than average.
Find products sold in Region2 but not in Region1.
Find salesmen who sell same products as Rahul.
Update product name Pant → Trousers.
Delete a salesman and handle dependencies.
Add a new region and assign products to a salesman.
Insert a new product and map it to multiple regions.
Why is this schema in 3NF?
Identify candidate keys in each table.
Explain the relationship between Salesman, Product, and Region.
Why is a composite key used in Sales table?
What anomalies are removed after normalization?
Can this schema be extended to 4NF? Explain.

*/