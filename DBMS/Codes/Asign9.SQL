-- Create a table and perform the following


-- 1. Increase salary of each customer by 5000

CREATE TABLE CUSTOMER(CUSTOMER_NAME VARCHAR(30),CUSTOMER_ADDRESS VARCHAR(50),CUSTOMER_SAL NUMBER(8,2));

INSERT INTO CUSTOMER VALUES (CUSTOMER_NAME=:CUSTOMER_NAME,CUSTOMER_ADDRESS=:CUSTOMER_ADDRESS,CUSTOMER_SAL=:CUSTOMER_SAL);

DECLARE  
   total_rows number(2); 
BEGIN 
   UPDATE customer 
   SET CUSTOMER_SAL = CUSTOMER_SAL + 5000; 
   IF sql%notfound THEN 
      dbms_output.put_line('no customers selected'); 
   ELSIF sql%found THEN 
      total_rows := sql%rowcount;
      dbms_output.put_line( total_rows || ' customers selected '); 
   END IF;  
END; 
/

SELECT * FROM CUSTOMER;

DELETE  FROM CUSTOMER;


-- 2. Write a program to retrieve the customer name and address 

DECLARE 
   c_name CUSTOMER.CUSTOMER_NAME%type; 
   c_addr CUSTOMER.CUSTOMER_ADDRESS%type; 
   CURSOR c_customers is 
      SELECT CUSTOMER_NAME, CUSTOMER_ADDRESS FROM CUSTOMER; 
BEGIN 
   OPEN c_customers; 
   LOOP 
   FETCH c_customers into c_name, c_addr; 
      EXIT WHEN c_customers%notfound; 
      dbms_output.put_line(c_name || ' ' || c_addr); 
   END LOOP; 
   CLOSE c_customers; 
END; 
/