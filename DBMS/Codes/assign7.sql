-- 1. Give a list of employees sorted on their names.

SELECT
    *
FROM
    EMP
ORDER BY
    ENAME;

-- 2. Display names and departments of employees who work in department 10.

SELECT
    EMP.ENAME,
    DEPT.DNAME
FROM
    EMP,
    DEPT
WHERE
    DEPT.DEPTNO = 10;

-- 3. Accept department number from user and display details of all employees in that department.

SELECT * FROM EMP WHERE DEPTNO=:DEPTNO;

-- 4. Create an index that would permit each salesperson to retrieve his or her orders grouped by date quickly.

CREATE INDEX SALESPERSON_DETAILS ON SALES_ORDER (ORDER_DATE);

DROP INDEX SALESPERSON_DETAILS;

-- 5. Create a view on emp table which will display empno, ename, sal, deptno, dname

CREATE VIEW EMP_VIEW AS
SELECT
    ENAME,
    EMPNO,
    SAL,
    EMP.DEPTNO,
    DEPT.DNAME
FROM
    EMP,
    DEPT;

SELECT * FROM  EMP_VIEW;