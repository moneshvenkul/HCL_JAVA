mysql> select CustomerFirstName from customers_details inner join account_details on customers_details.CustomerNumber = account_details.CustomerNumber group by CustomerFirstName having Count(AccountNumber)>1 order by CustomerFirstName;
+-------------------+
| CustomerFirstName |
+-------------------+
| Venkul            |
+-------------------+
1 row in set (0.00 sec)