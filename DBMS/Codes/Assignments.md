

# Assignment II : Implementation of DDL commands with Constraints


Implementation of DDL commands of SQL with suitable examples
  
#### Create table 
#### Alter table
#### Drop Table
Create the following tables. Insert the appropriate data in these tables and solve the queries

1. Client_master(client_no,name,address1,address2,city,pincode,state,bal_due)
2. Product_master(product_no, description, profit_percent, unit_ measure, qty_on_hand ,reorder_lvl, sell_price,
cost_price)
3. Salesman_master(salesman_name,address1, address2, city, pincode, state, sal_amt,tgt_to_get,ytd_sales,remarks)
4. Sales_order(order_no,order_date,client_no,dely_addr,salesman_no,dely_type,billed_yn,dely_date, order_status)
5. Sales_order_details(order_no,product_no,qty_ordered,qty_disp,product_rate)
## Constraints are
Client_master( Client_no is PK &amp; first letter must start with ‘C’ , Name Not NULL)

Product_master(product_no is PK &amp; first letter must start with ‘P’)

Salesman_master(salesman_no is PK &amp; first letter must start with ‘S’ Name not NULL)

Sales_Order(order_no is PK &amp; first letter must start with ‘O’,dely_type(Delivery: part(P)/full(f)
Default (F), dely_date can not be less than order_date, order_status values (‘In Process’, ‘Fulfilled’‘BackOrder’,’Cancelled’)

1. Alter table sales_order_details add column price.
2. Drop table sales_order_details


---

# Assignment III : Implementation of DML commands 

Implementation of DML commands of SQL with suitable examples
#### Insert
#### Update
#### Delete
1. Add a record to department table with values (50,’PERSONNEL’,’BOSTON’).
2. Make a table called ‘Bonus1’ having fields name, job, salary and store records from the existing employee table for Analysts and Manager only.
3. If a new person HERALD joins the organization in place of TURNER on the 5 th of September 1992 with employee number 7999,make the required changes.


---

# Assignment IV : Implementation of different types of function of Oracle

Implementation of different types of function with suitable examples
####  Number function
####  Aggregate Function
####  Character Function
####  Conversion Function
####  Date Function


1. Find out details of employees where commission is greater than 7% of salary.
2. Select names of all employees whose name start with ‘S’.
3. Display the department name which has more than 3 employees in it.
4. Write a query which concatenates the employee number, his name and manager number.Display the output with spaces in between the columns.
5. List names of people who have salary less than the average salary for department 20.
6. Display details of all employees who were hired earliest and latest
7. Find out the department in which the maximum number of employees works
8.Display information about employees who have the maximum number of employees reporting to him
9. Find the day of the week, time of the day, month  and century on which SMITH joined.
10. Find number of months the PRESIDENT has worked for the company. Round the months to the nearest whole number.


---

# Assignment V : Implementation of different types of operators of Oracle

Implementation of different types of operators in SQL
#### Arithmetic Operators
#### Logical Operators
#### Comparison Operator
#### Special Operator
#### Set Operation
1. Display names, departments, and positions who work as Analyst or Clerk.
2. Display different types of jobs / positions available in the company.
3. Display the names of people and their departments working in either Sales or Research department.
4. Find the list of all clients who stay in ‘Bombay’ or ‘Delhi’ or ‘Chennai’.
5. Print the list of clients whose bal_due is greater than value 10000.
6. Display the order information for client_no ‘C00001’ and ‘C00002’.
7. Find products whose selling price is greater than 2000 and less than or equal to 5000.
8. Find products whose selling price is more than 1500. Calculate a new selling price as, original selling price * .15. Rename the new
column in the above query new_price.