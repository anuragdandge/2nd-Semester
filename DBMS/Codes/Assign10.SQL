-- Assignment X : Study & Implementation of SQL function and procedure
-- Create a stored function to perform item_id
-- check operation. Which accepts a item_id
-- returns a flag as per the id exist or not.
CREATE FUNCTION CheckItemID(item_id INT) RETURNS BOOLEAN
BEGIN
  DECLARE flag BOOLEAN;
  
  SELECT EXISTS(SELECT 1 FROM SALES_ORDER_DETAILS WHERE PRODUCT_NO = item_id) INTO flag;
  
  RETURN flag;
END;

SELECT CheckItemID(123) AS item_exists FROM SALES_ORDER_DETAILS;

DROP FUNCTION CheckItemID;