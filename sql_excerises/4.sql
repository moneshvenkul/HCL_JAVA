mysql> insert into customers_details(CustomerFirstName, CustomerLastName, OpeningDate) Values('Monesh', 'Vommi','2020-09-20');
Query OK, 1 row affected (0.00 sec)

mysql> select * from customers_details;
+---------------+----------------+-------------------+------------------+-------------+
| AccountNumber | CustomerNumber | CustomerFirstName | CustomerLastName | OpeningDate |
+---------------+----------------+-------------------+------------------+-------------+
|           101 |              1 | Monesh            | Vommi            | 2020-09-20  |
|           102 |              2 | Venkul            | Vommi            | 2020-09-21  |
|           103 |              3 | Srinu             | Vommi            | 2020-09-22  |
|          NULL |              4 | Monesh            | Vommi            | 2020-09-20  |
+---------------+----------------+-------------------+------------------+-------------+
4 rows in set (0.00 sec)

mysql> select count(CustomerNumber) as Count_CustomerNumber from customers_details where CustomerNumber not in (select CustomerNumber from account_details);
+----------------------+
| Count_CustomerNumber |
+----------------------+
|                    1 |
+----------------------+
1 row in set (0.00 sec)
