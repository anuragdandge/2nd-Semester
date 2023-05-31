SELECT
    SO.CLIENT_NO,
    SOD.PRODUCT_NO,
FROM
    SALES_ORDER SO,
    SALES_ORDER_DETAILS SOD,
    PRODUCT_MASTER PM,
    CLIENT_MASTER CM
WHERE
    SO.ORDER_NO = SOD.ORDER_NO
    AND SOD.PRODUCT_NO = PM.PRODUCT_NO
    AND SO.CLIENT_NO = CM.CLIENT_NO
GROUP BY
    SO.CLIENT_NO,
    SOD.PRODUCT_NO,
    PM.DESCRIPTION
HAVING
    SO.CLIENT_NO = 'C00001'
    AND SO.CLIENT_NO = 'C00002';