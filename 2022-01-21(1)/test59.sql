--2022-01-21(3~4�� ����)
/*
    142page �� SQL(����ȭ�� ���� ���)
  [ ������ ���̽��� �����ϴ� ��� ] 
  - �����α׷��� : �Ϲ� ����� ��� SQL������ ���� / ����ڿ�û  �� ����Ŭ ������ ���ؼ� SQL������ ����
  - �����ͺ��̽� ������(DBA)  : �����α׷��Ӱ� ����� �� �� �ְ� �����͸� ��Ƽ� �ִ� ����, ����


   1. SQL ����� ����
   2. SQL����� ����
   3. SQL������ ������

*/
-- ���̺�����
/*
  ���� : 
	CREATE TABLE table_name(
	     �÷��� �������� [��������(������ ���)]
	);
*/
/*
-- ī�װ���
CREATE TABLE foodHouse(
   no NUMBER,
   cno NUMBER,
   poster VARCHAR2(4000) CONSTRAINT foodh_poster_nn NOT NULL,
   name VARCHAR2(200) CONSTRAINT foodh_name_nn NOT NULL,
   score NUMBER(2,1) CONSTRAINT foodh_score_nn NOT NULL,
   address VARCHAR2(500) CONSTRAINT foodh_addr_nn NOT NULL,
   tel VARCHAR2(20) CONSTRAINT foodh_tel_nn NOT NULL,
   type VARCHAR2(100) CONSTRAINT foodh_type_nn NOT NULL,
   price VARCHAR2(100) CONSTRAINT foodh_price_nn NOT NULL,
   time VARCHAR2(200),
   menu CLOB,
   good NUMBER,
   soso NUMBER,
   bad NUMBER,
   CONSTRAINT foodh_no_pk PRIMARY KEY(no),
   CONSTRAINT foodh_cno_fk FOREIGN KEY(cno)
   REFERENCES category(cno)
);
*/
-- ������ ����
-- �˻�

-- ������(ī�װ��� ������ ����
CREATE TABLE foodLocation(
   no NUMBER,
   cno NUMBER,
   poster VARCHAR2(4000) CONSTRAINT foodl_poster_nn NOT NULL,
   name VARCHAR2(200) CONSTRAINT foodl_name_nn NOT NULL,
   score NUMBER(2,1) CONSTRAINT foodl_score_nn NOT NULL,
   address VARCHAR2(500) CONSTRAINT foodl_addr_nn NOT NULL,
   tel VARCHAR2(20) CONSTRAINT foodl_tel_nn NOT NULL,
   type VARCHAR2(100) CONSTRAINT foodl_type_nn NOT NULL,
   price VARCHAR2(100) CONSTRAINT foodl_price_nn NOT NULL,
   time VARCHAR2(200),
   menu CLOB,
   good NUMBER,
   soso NUMBER,
   bad NUMBER,
   CONSTRAINT foodl_no_pk PRIMARY KEY(no),
   CONSTRAINT foodl_cno_fk FOREIGN KEY(cno)
   REFERENCES category(cno)
);

