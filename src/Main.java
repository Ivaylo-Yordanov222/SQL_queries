public class Main {
    public static void main(String[] args) {
//        CREATE DATABASE Tests

//        CREATE TABLE salesman(
//                salesman_id INT PRIMARY KEY NOT NULL,
//                name VARCHAR(50) NOT NULL,
//                city VARCHAR(50) NOT NULL,
//                commission DECIMAL(10,2) DEFAULT 0
//        );
//
//        CREATE TABLE customer(
//                customer_id INT PRIMARY KEY NOT NULL,
//                cust_name VARCHAR(50) NOT NULL,
//                city VARCHAR(50) NOT NULL,
//                grade INT,
//                salesman_id INT NOT NULL,
//                CONSTRAINT FK_customer_salesman FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
//        );
//
//        CREATE TABLE orders(
//                ord_no INT PRIMARY KEY NOT NULL,
//                purch_amt DECIMAL(10,2) NOT NULL,
//                ord_date DATE NOT NULL,
//                customer_id INT NOT NULL,
//                salesman_id INT NOT NULL,
//                CONSTRAINT FK_orders_customer FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
//                CONSTRAINT FK_orders_salesman FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
//        );
//
//        INSERT INTO salesman (salesman_id,name,city,commission) VALUES (5001,'James Hoog','New York',0.15)
//        INSERT INTO salesman (salesman_id,name,city,commission) VALUES (5002,'Nail Knite','Paris',0.13)
//        INSERT INTO salesman (salesman_id,name,city,commission) VALUES (5005,'Pit Alex','London',0.11)
//        INSERT INTO salesman (salesman_id,name,city,commission) VALUES (5006,'Mc Lyon','Paris',0.14)
//        INSERT INTO salesman (salesman_id,name,city,commission) VALUES (5007,'Paul Adam','Rome',0.13)
//        INSERT INTO salesman (salesman_id,name,city,commission) VALUES (5003,'Lauson Hen','San Jose',0.12)
//
//
//        INSERT INTO customer (customer_id,cust_name,city,grade,salesman_id) VALUES (3002,'Nick Rimando','New York',100,5001)
//        INSERT INTO customer (customer_id,cust_name,city,grade,salesman_id) VALUES (3007,'Brad Davis','New York',200,5001)
//        INSERT INTO customer (customer_id,cust_name,city,grade,salesman_id) VALUES (3005,'Graham Zusi','California',200,5002)
//        INSERT INTO customer (customer_id,cust_name,city,grade,salesman_id) VALUES (3008,'Julian Green','London',300,5002)
//        INSERT INTO customer (customer_id,cust_name,city,grade,salesman_id) VALUES (3004,'Fabian Johnson','Paris',300,5006)
//        INSERT INTO customer (customer_id,cust_name,city,grade,salesman_id) VALUES (3009,'Geoff Cameron','Berlin',100,5003)
//        INSERT INTO customer (customer_id,cust_name,city,grade,salesman_id) VALUES (3003,'Jozy Altidor','Moscow',200,5007)
//        INSERT INTO customer (customer_id,cust_name,city,grade,salesman_id) VALUES (3001,'Brad Guzan','London',,5005)
//
//        INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES(70001,150.5,'2012-10-05',3005,5002)
//        INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES(70009,270.65,'2012-09-10',3001,5005)
//        INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES(70002,65.26,'2012-10-05',3002,5001)
//        INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES(70004,110.5,'2012-08-17',3009,5003)
//        INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES(70007,948.5,'2012-09-10',3005,5002)
//        INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES(70005,2400.6,'2012-07-27',3007,5001)
//        INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES(70008,5760,'2012-09-10',3002,5001)
//        INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES(70010,1983.43,'2012-10-10',3004,5006)
//        INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES(70003,2480.4,'2012-10-10',3009,5003)
//        INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES(70012,250.45,'2012-06-27',3008,5002)
//        INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES(70011,75.29,'2012-08-17',3003,5007)
//        INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES(70013,3045.6,'2012-04-25',3002,5001)
//
//           Queries
//        1.
//        SELECT name AS salesman_name,cust_name AS customer_name,s.city AS salesman_city
//        FROM salesman AS s
//        INNER JOIN customer AS c
//        ON s.city = c.city

//        2.
//        SELECT cust_name AS customer_name , name AS salesman_name
//        FROM salesman AS s
//        INNER JOIN customer AS c
//        ON s.salesman_id = c.salesman_id

//        3.
//        SELECT ord_no AS order_no, cust_name, o.customer_id, o.salesman_id
//        FROM salesman AS s
//        INNER JOIN customer AS c
//        ON s.salesman_id = c.salesman_id
//        INNER JOIN orders AS o
//        ON o.customer_id = c.customer_id
//        WHERE c.city != s.city

//        4.
//        SELECT  ord_no AS order_number, cust_name AS customer_name
//        FROM orders AS o
//        INNER JOIN customer AS c
//        ON o.customer_id = c.customer_id

//        5.
//        SELECT  cust_name AS "Customer", c.grade AS "Grade", ord_no AS "Order NO"
//        FROM salesman AS s
//        INNER JOIN customer AS c
//        ON s.salesman_id = c.salesman_id
//        INNER JOIN orders AS o
//        ON o.customer_id = c.customer_id
//        WHERE c.grade IS NOT NULL AND c.city = s.city

//        6.
//        SELECT cust_name AS "Customer", c.city as "City"
//        FROM salesman AS s
//        INNER JOIN customer AS c
//        ON s.salesman_id = c.salesman_id
//        WHERE s.commission >= 0.12 AND s.commission <= 0.14

//        7.
//        SELECT c.cust_name AS customer_name,s.commission AS "Commission%",o.purch_amt * s.commission AS "Commission"
//        FROM salesman AS s
//        INNER JOIN customer AS c
//        ON s.salesman_id = c.salesman_id
//        INNER JOIN orders as o
//        ON o.salesman_id = s.salesman_id
//        WHERE c.grade >= 200

//        8.
//        SELECT c.customer_id, cust_name,c.city,grade,s.salesman_id,ord_no,purch_amt,ord_date,o.customer_id,o.salesman_id
//        FROM salesman AS s
//        INNER JOIN customer AS c
//        ON s.salesman_id = c.salesman_id
//        INNER JOIN orders as o
//        ON o.customer_id = c.customer_id
//        WHERE o.ord_date < '2012/10/5'

    }
}