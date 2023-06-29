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

EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('An error occurred. Updates rolled back.');
END;
/



-- 2. HRD manager has decided to raise the salary of employees by 0.15. Write a PL/SQL block to accept the employee number
-- update the salary of that emp. Display message based on the existence of record in employee table.

BEGIN
UPDATE EMP SET SAL=SAL*0.15 WHERE EMPNO=:EMPNO;
DBMS_OUTPUT.PUT_LINE('Salary Update ');
EXCEPTION 
WHEN OTHERS THEN 
DBMS_OUTPUT.PUT_LINE(' Error Occured ');
END;
