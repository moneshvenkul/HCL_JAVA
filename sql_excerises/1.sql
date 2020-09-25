use bank_details;
Database changed
mysql> create table customers_details(AccountNumber int not null, CustomerNumber int primary key not null  auto_increment, CustomerFirstName varchar(255) not null, CustomerLastName varchar(255) not null, OpeningDate date not null);
Query OK, 0 rows affected (0.05 sec)

mysql> desc customers_details;
+-------------------+--------------+------+-----+---------+----------------+
| Field             | Type         | Null | Key | Default | Extra          |
+-------------------+--------------+------+-----+---------+----------------+
| AccountNumber     | int          | NO   |     | NULL    |                |
| CustomerNumber    | int          | NO   | PRI | NULL    | auto_increment |
| CustomerFirstName | varchar(255) | NO   |     | NULL    |                |
| CustomerLastName  | varchar(255) | NO   |     | NULL    |                |
| OpeningDate       | date         | NO   |     | NULL    |                |
+-------------------+--------------+------+-----+---------+----------------+
5 rows in set (0.01 sec)


mysql> insert into customers_details(AccountNumber, CustomerFirstName, CustomerLastName, CustomerNumber, OpeningDate) Values(101, 'Monesh', 'Vommi', 1, '2020-09-20'),(102, 'Venkul', 'Vommi', 2, '2020-09-21'),(103, 'Srinu', 'Vommi', 3, '2020-09-22');
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> select * from customers_details;
+---------------+----------------+-------------------+------------------+-------------+
| AccountNumber | CustomerNumber | CustomerFirstName | CustomerLastName | OpeningDate |
+---------------+----------------+-------------------+------------------+-------------+
|           101 |              1 | Monesh            | Vommi            | 2020-09-20  |
|           102 |              2 | Venkul            | Vommi            | 2020-09-21  |
|           103 |              3 | Srinu             | Vommi            | 2020-09-22  |
+---------------+----------------+-------------------+------------------+-------------+
3 rows in set (0.00 sec)

mysql> mysql> select * from customers_details order by OpeningDate;
+---------------+----------------+-------------------+------------------+-------------+
| AccountNumber | CustomerNumber | CustomerFirstName | CustomerLastName | OpeningDate |
+---------------+----------------+-------------------+------------------+-------------+
|           101 |              1 | Monesh            | Vommi            | 2020-09-20  |
|           102 |              2 | Venkul            | Vommi            | 2020-09-21  |
|           103 |              3 | Srinu             | Vommi            | 2020-09-22  |
+---------------+----------------+-------------------+------------------+-------------+
3 rows in set (0.00 sec)

mysql> create table account_details(CustomerNumber int primary key auto_increment, City varchar(45) not null);
Query OK, 0 rows affected (0.03 sec)

mysql> desc account_details;
+----------------+-------------+------+-----+---------+----------------+
| Field          | Type        | Null | Key | Default | Extra          |
+----------------+-------------+------+-----+---------+----------------+
| CustomerNumber | int         | NO   | PRI | NULL    | auto_increment |
| City           | varchar(45) | NO   |     | NULL    |                |
+----------------+-------------+------+-----+---------+----------------+
2 rows in set (0.01 sec)

mysql> insert into account_details(City) values('chennai'),('vizag'),('visakhapatnam');
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> select * from account_details;
+----------------+---------------+
| CustomerNumber | City          |
+----------------+---------------+
|              1 | chennai       |
|              2 | vizag         |
|              3 | visakhapatnam |
+----------------+---------------+
3 rows in set (0.00 sec)

mysql> select * from customers_details inner join account_details on customers_details.CustomerNumber = account_details.CustomerNumber;
+---------------+----------------+-------------------+------------------+-------------+----------------+---------------+
| AccountNumber | CustomerNumber | CustomerFirstName | CustomerLastName | OpeningDate | CustomerNumber | City          |
+---------------+----------------+-------------------+------------------+-------------+----------------+---------------+
|           101 |              1 | Monesh            | Vommi            | 2020-09-20  |              1 | chennai       |
|           102 |              2 | Venkul            | Vommi            | 2020-09-21  |              2 | vizag         |
|           103 |              3 | Srinu             | Vommi            | 2020-09-22  |              3 | visakhapatnam |
+---------------+----------------+-------------------+------------------+-------------+----------------+---------------+
3 rows in set (0.00 sec)

mysql> select * from customers_details inner join account_details on customers_details.CustomerNumber = account_details.CustomerNumber order by AccountNumber ASC;
+---------------+----------------+-------------------+------------------+-------------+----------------+---------------+
| AccountNumber | CustomerNumber | CustomerFirstName | CustomerLastName | OpeningDate | CustomerNumber | City          |
+---------------+----------------+-------------------+------------------+-------------+----------------+---------------+
|           101 |              1 | Monesh            | Vommi            | 2020-09-20  |              1 | chennai       |
|           102 |              2 | Venkul            | Vommi            | 2020-09-21  |              2 | vizag         |
|           103 |              3 | Srinu             | Vommi            | 2020-09-22  |              3 | visakhapatnam |
+---------------+----------------+-------------------+------------------+-------------+----------------+---------------+
3 rows in set (0.00 sec)

mysql> select * from customers_details inner join account_details on customers_details.CustomerNumber = account_details.CustomerNumber order by AccountNumber DESC;
+---------------+----------------+-------------------+------------------+-------------+----------------+---------------+
| AccountNumber | CustomerNumber | CustomerFirstName | CustomerLastName | OpeningDate | CustomerNumber | City          |
+---------------+----------------+-------------------+------------------+-------------+----------------+---------------+
|           103 |              3 | Srinu             | Vommi            | 2020-09-22  |              3 | visakhapatnam |
|           102 |              2 | Venkul            | Vommi            | 2020-09-21  |              2 | vizag         |
|           101 |              1 | Monesh            | Vommi            | 2020-09-20  |              1 | chennai       |
+---------------+----------------+-------------------+------------------+-------------+----------------+---------------+
3 rows in set (0.00 sec)