-- 2022-01-10 오라클 정리 및 문제 풀이 
/*

     ORACLE : SELECT (JOIN, SUBQUERY) => 내장 함수 / 연산자 
                   데이터 저장 장소 : 검색 (사용자가 요청한 데이터를 가지고 온다) 
                   사이트 (검색, 게시판, 구매, 회원가입, 예매 => DML)
JOIN : 다른 테이블의 데이터 검색 
                             --------
SUBQUERY : SQL과 연결 => SQL문장안에서 다른 SQL문장을 작성하는 과정 
----------------------------
                  = 용도 
                     컬럼 대신 사용 : 스칼라 서브쿼리 
                     테이블 대신 사용하는 방법 : 인라인뷰 
                     조건에 해당되는 값을 읽는 경우 
                     ====================
                        값 1개     : 단일행 서브쿼리 
                        값 여러개 : 다중행 서브쿼리 (전체를 대입, 최대값, 최소값)
                                        => 함수 
                                        IN(SQL)
                                        ANY, SOME(SQL)
                                        ALL(SQL)
                                        -------------------
                                        <ANY(SQL) => 여러개의 값중에 최대값을 대입
                                        >ANY => 여러개의 값중에 최소값을 대입 

                                        <ALL => 여러개의 값중에 최소값을 대입
                                        >ALL => 여러개의 값중에 최대값을 대입 

                                        예) <ANY(10, 20, 30) =>  deptno < 30 ==> 10, 20
                                             >ANY(10, 20, 30) => deptno > 10  ==> 20, 30

                                             <ALL(10, 20, 30)  => deptno < 10  ==> 실행이 안됨
                                             >ALL(10, 20, 30)  => deptno > 30  ==> 실행이 안됨
                                             ==> ANY, SOME, ALL() : (SELECT MIN() / MAX()~)
                          *** 오라클은 서버 (네트워크 통신) => 최대한으로 전송하는 
                               SQL문장을 줄여서 보내는 것이 좋다 (3개SQL => 2개, 1개)
        형식)
                  단일행 서브쿼리 
                     SELECT
                     FROM
                     WHERE 컬럼명 연산자 (서브쿼리 : 결과값 1개)
                  다중행 서브쿼리 
                     SELECT
                     FROM
                     WHERE 컬럼명 연산자 (서브쿼리 : 결과값 여러개)
                     메인 = (서브쿼리) => 서브쿼리에서 실행된 결과를 받아서 메인에 실행 
                  ---------------- 4장 (고급 SQL)
                  스칼라 서브쿼리 
                     SELECT 컬럼명, 컬럼명, 다른 테이블에서 데이터 읽기 
                                                   --------------------------------
                                                    (SELECT ~~~ ) 
                     FROM 테이블명
                  인라인뷰 
                     SELECT ~~~
                     FROM (SELECT ~~~) ==> 테이블 복사할때 사용, 커서에 데이터값을 채운다 



SUBQUERY 정리 (170~176page)

SUBQUERY 문제

1. SCOTT의 급여와 동일하거나 더 많이 받는 사원의 이름과 급여를 출력하세요.
   ----------------

   1) SCOTT의 급여를 가지고 온다 
      SELECT sal 
      FROM emp
      WHERE ename = 'SCOTT';  --> 3000

   2) 급여를 대입 ==> 동일하거나 더 많이 받는 사원의 이름과 급여
      SELECT ename, sal
      FROM emp
      WHERE sal >= 3000;

   3) 1) + 2) => 서브쿼리가 가능하다 
     SELECT ename, sal
     FROM emp
     WHERE sal >= (SELECT sal 
                         FROM emp
                         WHERE ename = 'SCOTT');



2. 직급(job)이 'CLERK'인 사람의 부서의 부서번호와 부서명을 출력하세요.
   ---------------------------------------

   1) CLERK이 직급인 사원의 부서번호 (Sub)
       SELECT DISTINCT deptno
       FROM emp
       WHERE job = 'CLERK'; ==> 다중 서브쿼리

   2) 부서번호를 대입을 받아서 부서명을 구한다 (Main)
       SELECT  deptno, dname
       FROM dept 
       WHERE deptno IN(10, 20, 30);

   3) 1) + 2)
       SELECT deptno, dname
       FROM dept
       WHERE deptno IN(SELECT DISTINCT deptno
                                 FROM emp
                                 WHERE job = 'CLERK');



3. 이름에 T를 포함하고 있는 사원들과 같은부서에서 근무하는
   사원의 사번과 이름을 출력하세요
   --------------------------------------------------

   1) SELECT DISTINCT deptno
      FROM emp
      WHERE ename LIKE '%T%';

   2) SELECT empno, ename
      FROM emp
      WHERE deptno IN(20, 30)
      ORDER BY empno ASC;

   3) 1) + 2)
      SELECT empno, ename
      FROM emp
      WHERE deptno IN(SELECT DISTINCT deptno
                                FROM emp
                                WHERE ename LIKE '%T%')
     ORDER BY empno ASC;



4. 부서위치(loc)가 DALLAS인 모든 사원의 이름, 부서번호를 출력하세요
    ---------------------------

    1) SELECT deptno
        FROM dept
        WHERE loc = 'DALLAS'; -- 단일행 서브쿼리(결과값이 1)
    2) SELECT ename, deptno
       FROM emp
       WHERE deptno = 20;
    3)
       SELECT ename, deptno
       FROM emp
       WHERE deptno = (SELECT deptno
                               FROM dept
                                WHERE loc = 'DALLAS');



5. SALES 부서의 모든사원의 이름과 급여를 출력하세요 => dept / emp (deptno)
   -------------

   1) SELECT deptno
       FROM dept 
       WHERE dname = 'SALES';
   2) SELECT ename, sal
      FROM emp
      WHERE deptno = 30;

   3) 1) + 2) 
      SELECT ename, sal
      FROM emp
      WHERE deptno = (SELECT deptno
                              FROM dept 
                              WHERE dname = 'SALES');



6. 자신의 급여가 평균 급여보다 많고 이름에 S가 들어가는 사원과
    동일한 부서에서 근무하는 모든 사원의 이름, 급여를 출력하세요
   -------------

   1) SELECT ename, sal
       FROM emp 
       WHERE sal > (SELECT AVG(sal) FROM emp) AND ename LIKE '%S%'; 


                    
7. 평균 급여보다 더 많은 급여를 받는 사원의 이름, 사번, 급여를 검색하되 급여가 많은 순서로나열하세요.
   -----------

   1) 평균 급여를 구한다
       SELECT ROUND(AVG(sal)) FROM emp;

   2) > 평균급여  ==> 
      ORDER BY 
      SELECT ename, empno, sal 
      FROM emp
      WHERE sal > 2073
      ORDER BY 3 DESC;

   3)
        SELECT ename, empno, sal 
        FROM emp
        WHERE sal > (SELECT ROUND(AVG(sal)) FROM emp)
        ORDER BY 3 DESC;



   출력 : 사원이름, 입사일, 직위, 급여, 부서명, 근무지 
           ------------------------------  -----------------
                     emp                           dept ======> JOIN
   SELECT ename, hiredate, job, sal, dname, loc
   FROM emp, dept 
   WHERE emp.deptno = dept.deptno;

   SELECT ename, hiredate, job, sal,
             (SELECT dname FROM dept WHERE dept.deptno = emp.deptno) dname,
             (SELECT loc FROM dept WHERE dept.deptno = emp.deptno) loc
  FROM emp;
  -- 오라클의 SQL문장이 길어 진다 (JOIN, SubQuery)
  DDL 정리 (179~183page) 
*/