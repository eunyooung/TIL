-- 2022-01-10 오라클 (데이터 저장공간) => 테이블 (179~186page)
/*
     테이블,뷰,인덱스 ...
     DDL(정의언어) 
     ==========
         1. CREATE : 생성 
               CREATE TABLE 
               CREATE VIEW
               CREATE INDEX
               CREATE SEQUNCE... 
         2. DROP : 삭제 => 테이블을 통째로 삭제 (복구가 어렵다)
         3. ALTER : 수정 
                        = 추가(컬럼)  : ADD
                        = 수정(컬럼)  : MODIFY
                        = 삭제(컬럼)  : DROP
         4. RENAME : 컬럼이름 변경, 테이블명 변경 
         5. TRUNCATE : 테이블을 유지 => 데이터 삭제 (잘라내기)
     테이블 제작 
       = 테이블명 설정 (식별자)
          1) 알파벳이나 한글(운영체제에 따라 깨질 수 있다)로 시작한다
          2) 테이블명의 글자수 30byte => 한글(15자) 
          3) 숫자를 사용할 수 있다 (앞에 사용할 수 없다) 
          4) 대소문자를 구분하지 않는다 (특수문자 => _ , $) 
          5) 키워드는 사용할 수 없다 (SELECT, UPDATE, DELETE...) 
       = 형식 
          CREATE TABLE table_name(
             컬럼명 데이터형 [제약조건],
             컬럼명 데이터형 [제약조건],
             컬럼명 데이터형 [제약조건],
             컬럼명 데이터형 [제약조건],
             [제약조건] => 기본키, 참조키를 한번에 지정 
                                 => 기본키는 원래는 한개만 지정이 가능 
                                      여러개 동시에 지정이 가능
          )
       = 오라클 제공 데이터형
          문자형 
             고정 바이트 : CHAR(1~2000byte)
                               => 글자수가 같은 내용 저장
                               => 성별 (남자, 여자) 
                               => Y/N ==> 로그인된 상태 
             가변 바이트 : VARCHAR2(1~4000byte) ****** 문자열에서는 가장 많이 사용 
                               => 일반 데이터 (ID, Password, 이름, 주소, 전화번호
                                                      게시판 제목, 영화명, 맛집명...)
             대용량 (가변 바이트) : CLOB (4기가)
                               => 줄거리, 요리법, 회사소개 ....
          숫자형
             정수 : NUMBER(숫자의 갯수) => NUMBER(4) ~ 0~9999
             실수 : NUMBER(숫자의 갯수, 소수점) => NUMBER(2, 1) => 3.8, 4.0...
                      NUMBER => 14자리수 사용이 가능 ...
          날짜형 : DATE, TIMESTAMP => YY/MM/DD
          기타형 (자주 기술면접)  => 4기가 (그림, 사진...) => 서버에 폴더를 제작 ...
             BFILE : 파일 형식으로 저장 
             BLOB : 바이너리 형식으로 저장  

             emp  
              empno : 사번 => 4자리 정수 
                          empno NUMBER(4) ==> 공간에는 정수가 들어간다 0~9999
              ename : 이름 
                          ename VARCHAR2(34) ==> 우리나라 기준 => 17자 
              job : 직위 
                          job VARCHAR2(10)
              mgr : 사수번호 
                          mgr NUMBER(4)
              hiredate : 입사일 
                          hiredate DATE
              sal : 급여
                          sal NUMBER(7, 2) 
              comm : 성과급 
                          comm NUMBER(7, 2)
              deptno : 부서번호 
                          deptno NUMBER(2)
              *** 레코드 (ROW) 
       = 제약조건 
              NOT NULL : NULL을 허용하지 않는다 (반드시 입력값이 있어야 한다)
                               => 필수 입력 (NOT NULL)
                               => name VARCHAR2(34) NOT NULL
                                    입력을 저장할때는 반드시 입력값이 있어야 한다 
              UNIQUE : 유일값 (중복이 없는 값) => NULL허용 
                               => 대체키로 사용 (tel, email, 주민번호)
                               => email VARCHAR2(100) UNIQUE
                                    이메일은 반드시 중복이 없는 데이터를 첨부한다 
                                    없는 경우에는 NULL값을 첨부할 수 있다  
              PRIMARY KEY : UNIQUE + NOT NULL 
                                    => 기본키 (사번, 학번, 게시물번호, 영화번호, ID)
                                    => id VARCHAR2(20) PRIMARY KEY
                                    => 데이터무결성
              FOREIGN KEY : 다른 테이블의 데이터를 참조해서 사용 
                                    => 관계형 데이터베이스 
                                    => deptno NUMBER(20) 
                                         FOREIGN KEY
                                         REFERENCE dept(deptno)
                                         dept(10, 20, 30, 40)
                                         emp(10, 20, 30, 40, 50) => 오류    
                                         ----- 10, 20, 30, 40   
                                         참조무결성  
              CHECK : 지정한 데이터만 첨부가 가능하게 만든다 
                                   => 부서명, 직위, 근무지 ...., 지역
                                  => dname VARCHAR2(10) 
                                       CHECK(dname IN('영업부', '기획부', '개발부'))
                                  => 총무부(X)
              DEFAULT : 사용자가 데이터를 보내지 않는 경우 처리 
                             => 등록일, 조회수 
                             regdate DATE SYSDATE
                             hit NUMBER 0
              ==> 실무(기본 => 간단한 테이블은 직접 만들어서 처리)
                             예) 게시판, 댓글 ...... 공지사항 
       -------------------------- ALTER 
       = 수정 (컬럼명 변경, 데이터 글자수 변경)
              ==> address VARCHAR2(100) ==> 글자수가 초과 
              ==> ALTER TABLE join MODIFY address VARCHAR2(200); 
                     ----------------
       = 삭제 (컬럼 삭제, 전체 테이블)
              ==> nickname VARCHAR2(100)
              ==> ALTER TABLE join DROP COLUMN nickname 
                     ---------------        ------------------ ------------ 삭제할 컴럼명 
       = 추가 (컬럼명 추가) 
              ==> ALTER TABLE join ADD email VARCHAR2(100)
                                              -------
       -------------------------------------------------------------------------
       = 테이블명 변경 
             ==> RENAME TABLE old_name TO new_name 
       = 데이터가 잘못 들어가서 전체 데이터만 삭제 한다 
             ==> TRUNCATE TABLE table_name  ==> 테이블이 빈 공백으로 유지 
*/
/*
      게시판 (요구사항 분석 = 게시판에 저장되는 데이터가 무엇이 있는지 확인)
       = 게시물 번호 (구분자) => 중복없는 값 (반드시 입력) => PRIMARY KEY
       = 이름 => 문자열 => 반드시 입력 
       = 제목 => 문자열 => 반드시 입력 
       = 내용 => 문자열 => 반드시 입력 (글자수가 많을 수도 있다)
       = 비밀번호 => 문자열 => 반드시 입력 
       = 등록일 => 날짜형 => 디폴트
       = 조회수 => 날짜형 => 디폴트 (0)
      ======== 테이블 제작 2가지 방식 ======== 약식 
      CREATE TABLE board(
          no NUMBER PRIMARY KEY,
          name VARCHAR2(34) NOT NULL,
          subject VARCHAR2(1000) NOT NULL,
          content CLOB NOT NULL,
          pwd VARCHAR2(10) NOT NULL,
          regdate DATE DEFAULT SYSDATE,
          hit NUMBER DEFAULT 0
      );
     ========================= 실제로 실무에서 사용 
     DEFAULT,NOT NULL은 컬럼 뒤에서만 사용이 가능 
     나머지 (PRIMARY, FOREIGN, CHECK) 테이블에 첨부 
     보통적으로 제약조건의 이름을 사용할 때 (모든 테이블에서 중복이 있으면 안된다)
     테이블_컬럼명_nn => NOT NULL (nn)
     테이블_컬럼명_pk => PRIMARY KEY  (pk)
     테이블_컬럼명_fk  => FOREIGN KEY (fk)
     테이블_컬럼명_ck  => CHECK (ck)
     테이블_컬럼명_uk  => UNIQUE (uk)
           => 댓글 (FOREIGN) 
     CREATE TABLE board(
         no NUMBER,
         name VARCHAR2(34) CONSTRAINT board_name_nn NOT NULL,
         subject VARCHAR2(1000) CONSTRAINT board_subject_nn NOT NULL,
         content CLOB CONSTRAINT board_content_nn NOT NULL,
         pwd VARCHAR2(10) CONSTRAINT board_pwd_nn NOT NULL,
         regdate DATE DEFAULT SYSDATE,
         hit NUMBER DEFAULT 0,
         CONSTRAINT board_no_pk PRIMARY KEY(no)
     );
      = CHECK 
      = UNIQUE
      회원가입 (회원가입에 필요한 데이터가 무엇이 있는지 확인)
         id => 문자열 (중복이 없는 데이터) => 아이디 중복체크  => PRIAMRY 
         pwd => 문자열 => NOT NULL (반드시 입력)
         name => 문자열 => NOT NULL
         sex    => 문자열 => 남자/여자 ==> CHECK
         birthday => DATE
         email  => 문자열 => UNIQUE
         post    => 문자열 (000-000) => NOT NULL
         addr1  => 문자열 => NOT NULL
         addr2  => 문자열 => NULL 허용 
         tel       => 문자열 => UNIQUE 
         content  => CLOB => NULL 허용 

      CREATE TABLE member(
         id  VARCHAR2(20),
         pwd VARCHAR2(10) CONSTRAINT member_pwd_nn NOT NULL,
         name VARCHAR2(34) CONSTRAINT member_name_nn NOT NULL,
         sex   CHAR(9),
         birthday DATE,
         email VARCHAR2(100),
         post VARCHAR2(10) CONSTRAINT member_post_nn NOT NULL,
         addr1 VARCHAR2(100) CONSTRAINT member_addr1_nn NOT NULL,
         addr2 VARCHAR2(100),
         tel VARCHAR2(20),
         content CLOB,
         CONSTRAINT member_id_pk PRIMARY KEY(id),
         CONSTRAINT member_sex_ck CHECK(sex IN('남자', '여자')),
         CONSTRAINT member_email_uk UNIQUE(email),
         CONSTRAINT member_tel_uk UNIQUE(email)
      );
*/
/*
DROP TABLE board;
DROP TABLE member;
CREATE TABLE board(
         no NUMBER,
         name VARCHAR2(34) CONSTRAINT board_name_nn NOT NULL,
         subject VARCHAR2(1000) CONSTRAINT board_subject_nn NOT NULL,
         content CLOB CONSTRAINT board_content_nn NOT NULL,
         pwd VARCHAR2(10) CONSTRAINT board_pwd_nn NOT NULL,
         regdate DATE DEFAULT SYSDATE,
         hit NUMBER DEFAULT 0,
         CONSTRAINT board_no_pk PRIMARY KEY(no)
     );
CREATE TABLE member(
         id  VARCHAR2(20),
         pwd VARCHAR2(10) CONSTRAINT member_pwd_nn NOT NULL,
         name VARCHAR2(34) CONSTRAINT member_name_nn NOT NULL,
         sex   CHAR(9),
         birthday DATE,
         email VARCHAR2(100),
         post VARCHAR2(10) CONSTRAINT member_post_nn NOT NULL,
         addr1 VARCHAR2(100) CONSTRAINT member_addr1_nn NOT NULL,
         addr2 VARCHAR2(100),
         tel VARCHAR2(20),
         content CLOB,
         CONSTRAINT member_id_pk PRIMARY KEY(id),
         CONSTRAINT member_sex_ck CHECK(sex IN('남자', '여자')),
         CONSTRAINT member_email_uk UNIQUE(email),
         CONSTRAINT member_tel_uk UNIQUE(tel)
      );
*/
-- PRIMARY KEY => NOT NULL + UNIQUE
/*
       댓글 
        no NUMBER ,
        id VARCHAR2(20) ,
        name VARCHAR2(34) ,
        msg CLOB 
        regdate DATE 
*/ 
-- 180page 
CREATE TABLE reply(
    no NUMBER,
    id VARCHAR2(20),
    name VARCHAR2(34) CONSTRAINT reply_name_nn NOT NULL,
    msg CLOB CONSTRAINT reply_msg_nn NOT NULL,
    regdate DATE DEFAULT SYSDATE,
    CONSTRAINT reply_no_pk PRIMARY KEY(no, id)
);