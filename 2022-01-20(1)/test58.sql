-- 2022-01-20(PL/SQL → FUNCTION,PROCEDURE,TRIGGER)
-- 오라클 자체의 언어(DBA) → 메뉴얼 제공
/*
   자바에서 오라클 연결(JDBC) → ojdbc8.jar(오라클에서 제공)
  [ 오라클 연결시 필요한 값 ]
    1. 드라이버 : 자바에서 오라클을 직접 연결 할 수 없다(드라이버를 이용해서 연결)
	- oracle.jdbc.driver.OracleDriver
    2. 오라클 연결 주소
	- CREATE DATABASE data_name
	- jdbc:oracle:thin:@IP:1521:XE(전역 데이터베이스)
 	 → 데이터베이스 업체명, IP PORT 데이터베이스 
    3. 유저명/비밀번호 → hr/happy

   [ 자바에 연결하는 방식 ]
    1.  드라이버등록 → 한번만생성 → 생성자에서 주로 등록
    2. 오라클 연결 : getConnection()
    3. 오라클 닫기 : disConnection()
    4. 기능설정 
	SELECT 
                찾기,목록
	INSERT/UPDATE/DELETE → 제어(오라클 자체 처리) →void
	1) 오라클 연결
	2) SQL문장제작
	3) 오라클로 SQL문장 전송
	4) 실행 후 결과값 받기(메모리)
	5) VO, Listdp ahdktj tkdydwkdprp wjsthdgksek
	6) 오라클 닫기

*/
