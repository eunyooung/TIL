# My Exercise Answers

### emp 테이블 
![table1](https://user-images.githubusercontent.com/70963337/148264690-6dc56871-0f69-448f-b4fb-67a7472ef05b.png)

### SQL 종류
|유형|명령문|기능|
|:---:|:---:|:---:|
|질의어(DQL:Data Query Language)|SELECT|데이터 검색|
|데이터 조작어(DML:DataManipulation Language)|INSERT</br>UPDATE</br>DELETE|데이터 입력</br>데이터 수정</br>데이터 삭제|
|데이터 정의어(DDL:Data Definition Language)|CREATE</br>ALTER</br>DROP</br>RENAME</br>TRUNCATE|데이터베이스 객체 생성</br>데이터베이스 객체 변경</br>데이터베이스 객체 삭제</br>데이터베이스 객체 이름 변경</br>데이터 및 저장 공간 삭제|
|트랜잭션 처리어(TCL:TransactionControl Language)|COMMIT</br>ROLLBACK|트랜잭션의 정상적인 종료 처리</br>트랜잭션 취소|
|데이터 제어어(DCL:Data Control Language)|GRANT</br>REVOKE|권한 부여</br>권한 취소|

---

**1. 사원번호, 이름, 월급을 출력하시오.**
```
SELECT empno, ename, sal
FROM emp;
```

**2. 이름 월급 직업 입사일을 출력하시오.**
```
SELECT ename, sal, job, hiredate
FROM emp;
```

---

**※ NVL 함수**  
- 값 대신에 다른 값을 출력하고 싶을때 사용하는 함수

---

**3. 이름, 월급, 커미션, 월급 + 커미션을 출력하시오.**
```
SELECT ename, sal, comm, sal + NVL(comm,0)
FROM emp;
```

---

※ AS 별칭  
- as는 별칭을 쓸때 사용하며 생략 가능하다.
- 별칭을 소문자로 써도 대문자로 인식하는데, " "를 해주면 대소문자를 구분한다.

※ 더블쿼테이션 마크를 사용하는 경우  
1. 컬럼 별칭에 대소문자를 구분하고자 할때
2. 컬럼 별칭에 특수문자를 넣고자 할때

---

**4. 사원이름과 월급을 출력하는데, 이름의 컬럼명을 employee라고 하고 월급의 컬럼명을 salary라고 하시오.**
```
SELECT ename AS employee, sal AS salary
FROM emp;
```

**5. 사원이름과 입사일을 출력하는데 사원이름의 컬럼명이 employee name으로 출력되게 하시오.**
```
SELECT ename AS “employee name”, hiredate
FROM emp;
```

**6. 직업을 출력하시오.**
- 설명 
    - distinct : 중복제거 키워드
```
SELECT DISTINCT job
FROM emp;
```

**7. 부서번호를 출력하는데 중복제거해서 출력하시오.**
```
SELECT DISTINCT deptno
FROM emp;
```

**8. 사원번호가 7788번인 사원의 사원번호와 이름을 출력하시오.**
```
SELECT empno, ename
FROM emp
WHERE empno = 7788;
```

**9. 월급이 3000인 사원들의 이름과 월급을 출력하시오.**
```
SELECT ename, sal
FROM emp
WHERE sal = 3000;
```

---

※ 문자 및 날자형 데이터  
숫자형 데이터는 관계없지만, 문자와 날자형 데이터는 양쪽에 싱클쿼테이션 마크를 사용해야한다.

---

※ 연산자의 종류  
1. 산술 연산자 : * / + -
2. 비교 연산자 :>, <, <=, >=, =, !=, <>, ^= (같지 않음 연산자는 뒤에서부터 3개의 표현이 존재)
3. 논리 연산자 : and, or, not

---

**10. 이름이 scott인 사원의 이름과 직업을 출력하시오.**
```
SELECT ename, job
FROM emp
WHERE ename = ‘scott’;

SELECT ename, job
FROM emp
WHERE ename = 'SCOTT';

SELECT ename, job
FROM emp
WHERE LOWER(ename) = 'scott';

SELECT ename, job
FROM emp
WHERE ename = UPPRE('scott');
```

**11. 월급이 3000 이상인 사원들의 이름과 월급을 출력하시오.**
```
SELECT ename, sal
FROM emp
WHERE sal >= 3000;
```

**12. 직업이 SALESMAN이 아닌사원들의 이름과 직업을 출력하시오.**
```
SELECT ename, job
FROM emp
WHERE NOT (job = ‘SALESMAN’);

FROM emp
WHERE job <> 'SALESMAN'

SELECT ename,job
FROM emp
WHERE job != 'SALESMAN'
```

**13. 월급이 1000에서 3000 사이인 사원들의 이름과 월급을 출력하는데, 컬럼명을 Employee, Salary로 출력하시오.**
- 설명
    - between A and B : A이상 B이하 사이의 데이터
```
SELECT ename AS “Employee”, sal AS “Salary”
FROM emp
WHERE sal BETWEEN 1000 AND 3000;
```

---

※ order by 절  
- 쿼리의 결과를 정렬하는 절로써 가장 마지막 순서에 위치한다.
- ascending, descending (asc=오름차순, desc=내림차순)

---

**14. 사원이름과 월급을 출력하는데 월급이 낮은 사원부터 높은 사원순으로 출력하시오.**
```
SELECT sal
FROM emp
ORDER BY sal;

SELECT sal
FROM emp
ORDER BY sal ASC;
```

**15. 이름과 입사일을 출력하는데 가장 최근에 입사한 사원부터 출력하시오.**
```
SELECT ename, hiredate
FROM emp
ORDER by hiredate DESC;
```

**16. 직업이 SALESMAN인 사원들의 이름과 월급과 직업을 출력하는데, 월급이 높은 사원부터 출력하시오.**
```
SELECT ename, sal, job
FROM emp
WHERE job = 'SALESMAN'
ORDER BY sal DESC;
```

**17. 월급이 1000 이상인 사원들의 이름과 월급을 출력하는데 월급이 낮은 사원부터 높은 사원순으로 출력하시오.**
```
SELECT ename, sal
FROM emp
WHERE sal >= 1000
ORDER BY sal ASC;
```

---

※ SQL의 내부적 실행 순서  
- from -> where -> select -> order by 순서로 실행된다.
- order by절에서 별칭 사용 가능, where 절에서 별칭 사용 불가능

---

**18. 연봉(셀러리*12)이 36000 이상인 사원들의 이름과 연봉을 출력하고 컬럼명의 별칭은 "연봉"으로 하시오.**
```
SELECT ename, sal * 12 AS “연봉”
FROM emp
WHERE sal * 12 >= 36000;
```

---

※ 기타 비교 연산자  
1. between ..and
2. like
3. in
4. is null

---

**19. 월급이 1000에서 3000사이가 아닌 사원들의 이름과 월급을 출력하시오.**
```
SELECT ename, sal
FROM emp
WHERE sal NOT BETWEEN 1000 AND 3000;
```

---

※ 와일드 카드  
- %(퍼센트)는 wild card : 해당하는 자리에 무엇이 와도 관계없다는 의미.
- _(언더바)는 자릿수를 의미 함 : 해당하는 자리에 무엇이 와도 관계없다는 의미.(자릿수는 언더바의갯수에 관계)

---

**20. 이름의 첫 글자가 S로 시작하는 사원들의 이름을 출력하시오.**
```
SELECT ename
FROM emp
WHERE ename LIKE ‘S%’;
```

**21. 이름의 끝 글자가 T로 끝나는 사원들의 이름을 출력하시오.**
```
SELECT ename
FROM emp
WHERE ename LIKE ‘%T’;
```

**22. 이름의 두번째 철자가 M인 사원들의 이름을 출력하시오.**
```
SELECT ename
FROM emp
WHERE ename LIKE ‘_M%’;
```

**23. 이름의 세번째 철자가 L인 사원의 이름을 출력하시오.**
```
SELECT ename
FROM emp
WHERE ename LIKE ‘__L%’;
```

**24. 이름의 두번째 철자가 %인 사원의 이름을 출력하시오.**
```
SELECT ename
FROM emp
WHERE ename LIKE ‘_m%%’ ESCAPE ‘m’;
```
- 설명
    - escape 절 : m바로 다음에 나오는 %는 wild card가 아니라 특수문자 %로 인식

**25. 이름의 두번째 철자와 세번째 철자가 %인 사원들의 이름을 출력하시오**
```
SELECT ename
FROM emp
WHERE ename LIKE ‘_m%m%%’ ESCAPE ‘m’;
```

**26. 이름의 첫번째 철자가 S 가 아닌 사원들의 이름을 출력하시오.**
```
SELECT ename
FROM emp
WHERE ename NOT LIKE ‘S%’;
```

**27. 사원 번호가 7788, 7902, 7369번인 사원들의 사원번호와 이름을 출력하시오.**
```
SELECT empno, ename
FROM emp
WHERE empno IN(7788, 7902, 7369);
```

**28. 직업이 SALESMAN ANALYST가 아닌 사원들의 이름과 직업을 출력하시오.**
```
SELECT ename, job
FROM emp
WHERE job NOT IN(‘SALESMAN’, ‘ANALYST’);
```

**29. 커미션이 null인 사원들의 이름과 커미션을 출력하시오.**
```
SELECT ename, comm
FROM emp
WHERE comm IS NULL;
```

**30. 커미션이 null이 아닌 사원들의 이름과 커미션을 출력하시오.**
```
SELECT ename, comm
FROM emp
WHERE comm is NOT NULL;
```

**31. 월급이 1000에서 3000 사이인 사원들의 이름과 월급을 출력하는데 월급이 높은  사원부터 출력하시오**
```
SELECT ename, sal
FROM emp WHERE sal BETWEEN 1000 AND 3000
ORDER BY sal DESC;
```

---

※ 데이터베이스 Tools  
- 오라클 DB에 접속해서 편하게 데이터를 검색 조작하는 TOOLS : orange, toad, SQLGATE

---

**32. 1981년 11월 17일에 입사한 사원들의 이름과 입사일을 출력하시오.**
```
SELECT ename, hiredate
FROM emp
WHERE TO_CHAR(hiredate,'YYYY"년" MM"월" DD"일"') = '1981년 12월 11일';
```

**33. 1981년 12월 11일에 입사한 사원들의 이름과 입사일을 출력하시오.**
```
SELECT ename, hiredate
FROM emp
WHERE TO_CHAR(hiredate,'YYYY') = 1981;
```

**34. 1981년도에 입사한 사원들의 이름과 입사일을 출력하시오.**
```
SELECT ename, hiredate
FROM emp
WHERE hiredate LIKE ‘81%’;
```

**35. 연결연산자를 이용해서 이름과 월급을 연결해서 출력하시오.**
```
SELECT ename || sal
FROM emp;
```

**36. 쿼리를 사용해 "SCOTT의 직업은 ANALYST 입니다."와 같은 결과를 출력하시오.**
```
SELECT ename||’의 직업은’||job||’입니다’
FROM emp;
```

**37. 아래의 쿼리 결과를 출력하시오.**

![table2](https://user-images.githubusercontent.com/70963337/148264693-9e778df4-47c3-4919-800d-b489ae60ca18.png)
```
SELECT ename, job, sal
FROM emp
ORDER BY job, sal;
```
 
**38. 직업이 SALESMAN인 사원들의 이름과 연봉을 출력하는데 연봉이 높은 사원부터 출력하고 아래과 같이 결과를 출력하시오.**
- "ALLEN 의 연봉은 36000 입니다."
```
SELECT ename||’ 의 연봉은 ’||sal*12||’ 입니다’
FROM emp
WHERE job = ‘SALESMAN’
ORDER BY sal DESC;
``` 

**39. 이름은 대문자로 직업은 소문자로, 이름의 첫글자를 대문자 나머지는 소문자로 출력하시오.**
```
SELECT UPPER(ename), LOWER(job), INITCAP(ename)
FROM emp;
```

**40. 이름이 scott인 사원의 이름과 월급을 출력하는데 where절에 scott의 소문자로 검색해서 출력하시오.**
```
SELECT ename, sal
FROM emp
WHERE ename = UPPER('scott');

SELECT ename, sal
FROM emp
WHERE LOWER(ename) = 'scott';

SELECT LOWER(ename), sal
FROM emp
WHERE ename = ‘scott’;
```
