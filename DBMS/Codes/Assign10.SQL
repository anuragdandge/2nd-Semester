-- Assignment X : Study & Implementation of SQL function and procedure
-- Create a stored function to perform item_id
-- check operation. Which accepts a item_id
-- returns a flag as per the id exist or not.
-- CREATE FUNCTION CheckItemID(item_id INT) RETURNS BOOLEAN
-- BEGIN
--   DECLARE flag BOOLEAN;
  
--   SELECT EXISTS(SELECT 1 FROM SALES_ORDER_DETAILS WHERE PRODUCT_NO = item_id) INTO flag;
  
--   RETURN flag;
-- END;

-- SELECT CheckItemID(123) AS item_exists FROM SALES_ORDER_DETAILS;

-- DROP FUNCTION CheckItemID;


CREATE FUNCTION check_item_id(item_no VARCHAR2(6)) RETURNS BOOLEAN 
BEGIN
    DECLARE flag BOOLEAN;
    
    SELECT COUNT(*) INTO flag FROM SALES_ORDER_DETAILS WHERE PRODUCT_NO = item_no;
    
    IF flag > 0 THEN
        SET flag = TRUE;
    ELSE
        SET flag = FALSE;
    END IF;
    
    RETURN flag;
END;
/

DROP FUNCTION check_item_id;

SELECT * FROM SALES_ORDER_DETAILS;

DECLARE 
v_res BOOLEAN;
BEGIN 
 v_res := check_item_id('P00001');
 DBMS_OUTPUT.PUT_LINE('Flag '|| v_res);
END;
