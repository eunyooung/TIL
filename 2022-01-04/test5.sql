-- 정리 (데이터 검색 , 데이터 읽기 : SELECT)
-- 원하는 데이터만 출력 , 조건에 맞는 데이터를 출력(연산자)
/*
      SELECT 형식 (순서) 

      -------------------------------------------------------------------------------------------
      SELECT 원하는 컬럼명 | * 
      FROM 테이블명 ========> 테이블은 관련된 데이터끼리 모아둔 데이터 저장소 
                                                                      =======
               ====== 뷰(View:가상테이블) , SELECT ~ (인라인뷰:페이징기법)
               *** SELECT : 컬럼대신(스칼라 서브쿼리) , 테이블 대신 사용이 가능  
      -------------------------------- 필수 조건 ----------------------------------------------
      옵션 => 필요한 경우에 사용한다 
      [
           WHERE 조건문 (연산자) 
           GROUP BY 그룹컬럼
           HAVING 그룹에 대한 컬럼 => GROUP BY가 있는 경우만 사용이 가능 
           ORDER BY 컬럼명 ==> 정렬 (ASC / DESC)
      ]

      1. 전체를 출력하고 있는 지, 필요한 컬럼만 출력하고 있는지 확인 
         1) 웹사이트 
             = 목록 출력 : 원하는 컬럼만 출력 할 수 있게 만든다 
             = 상세 보기 : * (전체 내용 출력)
             = 찾기  : 원하는 컬럼만 출력 할 수 있게 만든다
      2. 사용자가 요청은 데이터 어디에 있는지 확인 (테이블)
      3. 조건이 있는 지 확인 (검색:LIKE , 상세보기 : 비교연산자 (=))
         ========== 처리 
         연산자 
           1) 산술연산자 : 통계 , 평균등에서 사용 => SELECT 컬럼에서 주로 연산자 
           2) 비교연산자 : 상세보기,회원찾기 , 회원탈퇴 , 로그인 , 아이디 중복체크 
              ======== ( = , !=(<>) )
           3) 논리연산자 : AND , OR 
               ======== 장바구니 ,마이페이지 , 예매정보 (ID,날짜) , 페이지기법 
               *** && => 오라클에서 입력값을 받는 경우  
               *** ||    => 문자열 결합시에 처리 
           4) 오라클에서 지원하는 연산자 
               OR => 찾는 데이터가 많은 경우  (대체 : IN)
               AND => (대체 : BETWEEN ~ AND)
               NOT => 부정값을 가지고 온다 
                           NOT IN , NOT LIKE , NOT BETWEEN 
               NULL => 값이 존재하지 않는 상태 (NULL인 경우 연산처리=결과값이 NULL)
                            NULL 여부를 확인해서 처리 
                            NULL인 경우 처리 (IS NULL) 
                            NULL이 아닌 경우 처리 (IS NOT NULL)
               LIKE => 검색 (게시물 , 영화 , 음악 , 책 , ....) 
                           %(문자 갯수를 알 수 없는 경우) , _(한개의 문자)
                           1. 서제스트 : 시작문자열이 같은 데이터를 읽는다 
                              ====== 자동 완성기 
                              검색문자열% => 자바 (startsWith)
                           2. 끝나는 문자열 
                               %끝나는 문자열 => 자바(endsWith) => 확장자 검색, 파일명 
                               갤러리 게시판 (이미지 첨부)
                           3. 포함 문자열 
                               %검색어% ==> 가장 많이 사용 
                           4. 문자의 갯수를 아는 경우에는  _
                              '_____' , '_A%' , '_AB__'
                              '%A%R%C%'
              145~154page 
*/