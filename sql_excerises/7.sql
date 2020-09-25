mysql> select CustomerFirstName from customers_details inner join account_details on customers_details.CustomerNumber = account_details.CustomerNumber group by CustomerFirstName having Count(CustomerFirstName)>=2 order by CustomerFirstName;
+-------------------+
| CustomerFirstName |
+-------------------+
| Monesh            |
| Venkul            |
+-------------------+
2 rows in set (0.00 sec)