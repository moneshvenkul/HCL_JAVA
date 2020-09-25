mysql> select count(AccountNumber) as Count_CustomerNumber from customers_details inner join account_details on customers_details.CustomerNumber = account_details.CustomerNumber where AccountNumber not in (select AccountNumber from account_details);
+----------------------+
| Count_CustomerNumber |
+----------------------+
|                    0 |
+----------------------+
1 row in set (0.00 sec)