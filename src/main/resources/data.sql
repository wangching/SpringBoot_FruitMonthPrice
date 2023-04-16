insert into FRUIT_MONTH_PRICE (ID, fruit_fruit, fruit_month, fmp, enviroment)
    SELECT * FROM CSVREAD('FMP_Unpivot.csv');
