CREATE TABLE sales (
    sno VARCHAR2(12),
    dates DATE CONSTRAINT sales_dates_nn NOT NULL,
    name VARCHAR2(34) CONSTRAINT sales_name_nn NOT NULL,
    tprice NUMBER,
    CONSTRAINT sales_sno_pk PRIMARY KEY(sno),
    CONSTRAINT sales_tprice_ck CHECK(tprice > 0)
);

CREATE TABLE product (
    pno VARCHAR2(12),
    pname VARCHAR2(100) CONSTRAINT product_pname_nn NOT NULL,
    uprice NUMBER,
    CONSTRAINT product_pno_pk PRIMARY KEY(pno),
    CONSTRAINT product_uprice_ck CHECK(uprice > 0)
);

CREATE TABLE detail (
    sno VARCHAR(12),
    pno VARCHAR(12),
    quantity NUMBER CONSTRAINT detail_quantity_nn NOT NULL,
    uprice NUMBER CONSTRAINT detail_uprice_nn NOT NULL,
    price NUMBER,
    CONSTRAINT detail_sno_pk PRIMARY KEY(sno),
    CONSTRAINT detail_sno_fk FOREIGN KEY(sno)
    REFERENCES sales(sno) ON DELETE CASCADE,
    CONSTRAINT detail_pno_fk FOREIGN KEY(pno)
    REFERENCES product(pno) ON DELETE CASCADE,
    CONSTRAINT detail_price_ck CHECK(price > 0)
);

DROP TABLE detail;
DROP TABLE sales;
DROP TABLE product;