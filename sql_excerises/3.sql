mysql> select AccountNumber,customers_details.CustomerNumber,CustomerFirstName from customers_details inner join account_details on customers_details.CustomerNumber = account_details.CustomerNumber where OpeningDate > '2020-08-15' order by account_details.CustomerNumber,AccountNumber;
+---------------+----------------+-------------------+
| AccountNumber | CustomerNumber | CustomerFirstName |
+---------------+----------------+-------------------+
|           101 |              1 | Monesh            |
|           102 |              2 | Venkul            |
|           103 |              3 | Srinu             |
+---------------+----------------+-------------------+
3 rows in set (0.00 sec)