-- 1.Write a PL/SQL block of code that first inserts a record in an ‘emp’ table. 
-- Update the salary by Rs. 2000.then check to see that the total salary does not exceed 20000.
-- if so, undo the updates made to the salaries.


DECLARE
  v_total_salary NUMBER;
BEGIN
  INSERT INTO EMP (EMPNO,ENAME, SAL)
  VALUES (0310,'Anurag',9999);


  UPDATE EMP
  SET SAL = SAL + 2000
  WHERE EMPNO = 0310;


  SELECT SAL
  INTO v_total_salary
  FROM emp WHERE EMPNO=0310;


  IF v_total_salary > 20000 THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Total salary exceeded 20000. Updates rolled back.');
  ELSE
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Updates committed successfully.');
  END IF;  
END;
/



SELECT * FROM EMP;

-- 2. HRD manager shas decided to raise the salary of employees by 0.15. Write a PL/SQL block to accept the employee number
-- update the salary of that emp. Display message based on the existence of record in employee table.

BEGINs
UPDATE EMP SET SAL=SAL*0.15 WHERE EMPNO=:EMPNO;
DBMS_OUTPUT.PUT_LINE('Salary Update ');
EXCEPTION 
WHEN OTHERS THEN 
DBMS_OUTPUT.PUT_LINE(' Error Occured ');
END;
-------------------
CREATE FUNCTION check_item_id(item_no VARCHAR2(6)) RETURNS BOOLEAN
BEGIN
    DECLARE flag BOOLEAN;
    SELECT COUNT(*) INTO flag FROM PRODUCT_MASTER WHERE PRODUCT_NO = item_no;
    IF flag > 0 THEN
        SET flag = TRUE;
    ELSE
        SET flag = FALSE;
    END IF;
    RETURN flag;
END;
/

DROP FUNCTION check_item_id;

SELECT * FROM PRODUCT_MASTER;

DECLARE 
v_res BOOLEAN;
BEGIN 
 v_res := check_item_id(P00001);
 DBMS_OUTPUT.PUT_LINE('Flag '|| v_res);
END;
/




-- Assignment X : Study & Implementation of SQL function and procedure
-- Create a stored function to perform item_id
-- check operation. Which accepts a item_id
-- returns a flag as per the id exist or not.

CREATE TABLE ITEMS(ITEM_NO NUMBER,ITEM_NAME VARCHAR2(20));

INSERT INTO ITEMS VALUES (1,'Laptop');
INSERT INTO ITEMS VALUES (2,'Mouse');
INSERT INTO ITEMS VALUES (3,'Keyboard');

SELECT * FROM ITEMS;

CREATE OR REPLACE FUNCTION IS_PRESENT(I_NO NUMBER)
    RETURN VARCHAR2
IS 
Y_N_PRESENT VARCHAR2(6);
BEGIN 
SELECT 'TRUE' INTO Y_N_PRESENT
FROM ITEMS
WHERE ITEM_NO = I_NO;

RETURN Y_N_PRESENT;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
  RETURN 'FALSE';
END;
/



DECLARE
   item_exists_flag VARCHAR2(6);
BEGIN
   item_exists_flag := IS_PRESENT(2);
   IF item_exists_flag = 'TRUE' THEN
      DBMS_OUTPUT.PUT_LINE('Item ID exists.');
   ELSE
      DBMS_OUTPUT.PUT_LINE('Item ID does not exist.');
   END IF;
END;
/
