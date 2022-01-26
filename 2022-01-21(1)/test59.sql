--2022-01-21(3~4장 정리)
/*
    142page → SQL(구조화된 질의 언어)
  [ 데이터 베이스를 관리하는 사람 ] 
  - 웹프로그래머 : 일반 사용자 대신 SQL문장을 제작 / 사용자요청  → 오라클 연결을 위해서 SQL문장을 제작
  - 데이터베이스 관리자(DBA)  : 웹프로그래머가 사용을 할 수 있게 데이터를 모아서 주는 역할, 관리


   1. SQL 언어의 종류
   2. SQL언어의 형식
   3. SQL문장의 실행결과

*/
-- 테이블제작
/*
  형식 : 
	CREATE TABLE table_name(
	     컬럼명 데이터형 [제약조건(여러개 사용)]
	);
*/
/*
-- 카테고리별
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
-- 데이터 저장
-- 검색

-- 지역별(카테고리와 관련이 없다
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

