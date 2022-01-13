# Exercise - My Answers

**41. 아래의 쿼리 결과를 출력하시오.**  
![q41](https://user-images.githubusercontent.com/70963337/148358360-6bae8db2-7d0e-41cc-9910-1dcffc34bc67.png)
```
SELECT ename, SUBSTR(ename, 1, 3)
FROM emp;
```

**42. 이름의 첫번째 철자만 출력하는데 소문자로 출력되게 하시오**
```
SELECT LOWER(SUBSTR(ename,1,1))
FROM emp;
```

**43. upper, lower, substr, || 를 사용해서 아래와 같은 결과를 출력하시오.**  
![q43](https://user-images.githubusercontent.com/70963337/148358368-c76af47b-1b53-4a5e-a1f7-f934eefc573a.png)

```
SELECT UPPER(SUBSTR(ename,1,1)) || LOWER(SUBSTR(ename,2))
FROM emp;
```

**44. 이름에 M자를 포함하고있는 사원들의 이름과 월급을 출력하시오.**
```
SELECT ename, sal
FROM emp
WHERE UPPER(ename) LIKE '%M%';
```

**45. 이름에 EN 또는 IN을 포함하고 있는 사원들의 이름과 입사일을 출력하는데 최근에 입사한 순서로 출력하시오.**
```
SELECT ename, hiredate
FROM emp
WHERE UPPER(ename) LIKE '%EN%' OR UPPER(ename) LIKE '%IN%';
```

**46. 직업이 SALESMAN인 사원들의 사원 이름과 직업과 월급을 출력하는데 월급이 높은 사원부터 출력하시오.**
```
SELECT ename, job, sal
FROM emp
WHERE UPPER(job) = 'SALESMAN'
ORDER BY sal DESC;
```

---

- 설명
    - 오라클 내부 순서는 from, where, select, order by 순으로 진행된다.
    - 이 진행 순서에 따라서 as 별칭을 인식하고 못하는 절 이 있다.

---

**47. 이름의 첫글자가 A로 시작하는 사원들의 이름과 월급과 직업을 출력하시오.**
```
SELECT ename, sal, job
FROM emp
WHERE UPPER(ename) LIKE 'A%';

SELECT ename,sal,job
FROM emp
WHERE INSTR(ename, 'A', 1, 1) = 1;
```

**48. 월급이 1000에서 3000 사이인 사원들의 이름과 월급과 입사일을 출력하는데, 입사일을 먼저 입사한 사원부터 출력되게 하시오.**
```
SELECT ename, sal, hiredate
FROM emp
WHERE sal BETWEEN 1000 AND 3000
ORDER BY hiredate ASC;
```

**49. 1981년도에 입사한 사원들의 이름과 입사일을 출력하시오.**
```
SELECT ename, hiredate
FROM emp
WHERE TO_CHAR(hiredate, 'YYYY') = 1981;

SELECT ename, hiredate
FROM emp
WHERE hiredate LIKE '81%';
```

---

- 설명
    - 단일행함수 : 문자, 숫자, 날짜, 변환, 일반
    - 복수행 함수 : MAX, MIN, AVG, SUM, COUNT
    - 문자 함수 : upper, lower, initcap, substr, instr, lpad, rpad, trim, replace

---

**50. 이름에 M자를 포함하고 있는 사원들의 이름을 출력하시오.**
```
SELECT ename
FROM emp
WHERE UPPER(ename) LIKE '%M%';

SELECT ename
FROM emp
WHERE INSTR(UPPER(ename), 'M') > 0;
```

**52. instr 함수를 이용해서 이름에 A자를 포함하고 있는 사원들의 이름을 출력하시오.**
```
SELECT ename
FROM emp
WHERE INSTR(ename, 'A') > 0;
```

---

- 설명
    - trim : 양쪽의 공백을 자른다.
    - rtrim : 오른쪽의 공백을 자른다.
    - ltrim : 왼쪽으로 공백을 자른다.

---

**53. 아래의 데이터를 EMP 테이블에 입력하고, 이름이 JACK인 사원의 이름과 월급을 출력하시오.**
- " insert into emp(empno, ename, sal) values(1238, 'JACK    ', 4000); " 
```
SELECT TRIM(ename), sal
FROM emp
WHERE TRIM(UPPER(ename)) = 'JACK';
```

**54. 이름과 월급을 출력하는데 월급을 전체 10자리로 출력하고 나머지 자리는 별로 출력하시오!**
```
SELECT ename, RPAD(sal, 10, '*')
FROM emp;
```

**55. 이름과 월급을 출력하는데 월급을 전체 10자리로 출력하고 나머지 자리는 공백으로 출력하시오.**
```
SELECT ename, RPAD(sal, 10, ' ')
FROM emp;
```

---

- 설명  
    - length : 문자열의 길이를 세는 함수

---

**56. length 함수를 이용해서 이름과 이름의 철자의 갯수를 출력하시오.**
```
SELECT ename, LENGTH(ename)
FROM emp;
```

**57. 이름, 입사한 날짜부터 오늘까지 총 몇일 근무했는지 소수점 뒤에는 잘라서 출력하시오.**
```
SELECT ename, TRUNC(SYSDATE - hiredate)
FROM emp;
```

---

※ 숫자 함수의 종류(round, trunc, mod)

1. round : 반올림하는 함수(지정한 자릿수까지 반올림해서 표시)
    ```
    select 756.89, round(756.89, 1)
    from dual;
    ``` 
    - (왼쪽부터 -3, -2, -1, 0, 1)
    - (임시적인 결과를 보기 위한 가상 테이블 dual)
2. trunc : 그냥 버리는 함수(지정한 자릿수까지 버림해서 표시)
    ```
    select 756.89, trimc(756.89, 1)
    from dual;
    ```
3. mod : 나누기 연산 후 나머지 값
    ```
    select 756.89, mod(756.89, 1)
    from dual;
    ```

---

**58. 이름, 입사한 날짜부터 오늘까지 총 몇달 근무했는지 소수점 뒤에는 잘라서 출력하시오.**
```
SELECT ename, ROUND(MONTHS_BETWEEN(SYSDATE, hiredate))
FROM emp;
```


---

- 설명  
    - 오늘 날짜 확인하는 방법  
        ```
        select sysdate from dual;
        ```

※ 날짜함수
 
1. months_netween : 날짜와 날짜 사이의 개월수 출력
    - 날짜 + 날짜 = 날짜
    - 날짜 - 숫자 = 날짜
    - 날짜 - 날짜 = 숫자
2. add_months : 날짜에서 개월수를 더한 날짜
3. next_day : 지정된 날짜에서 앞으로 돌아올 요일의 날짜를 출력
4. last_day : 지정된 날짜에서 마지막 날짜를 출력
 
---

**59. 오늘부터 100달 뒤의 날짜를 출력하시오.**
```
SELECT ADD_MONTHS(SYSDATE, 100)
FROM DUAL;
```

**60. 오늘부터 앞으로 돌아올 월요일의 날짜를 출력하시오.**
```
SELECT NEXT_DAY(SYSDATE, '월')
FROM DUAL; 
```

**61. 오늘부터 100달뒤 돌아올 금요일의 날짜를 출력하시오.**
```
SELECT NEXT_DAY(ADD_MONTHS(SYSDATE, 100), '금')
FROM DUAL;
```

**62. 이번달 말일의 날짜를 출력하시오.**
```
SELECT LAST_DAY(SYSDATE)
FROM DUAL;
```

**63. 오늘부터 요번달 말일까지 총 몇일남았는지 출력하시오!**
```
SELECT LAST_DAY(SYSDATE) - SYSDATE
FROM DUAL;
```

---

※ 데이터 타입을 변환하는 함수
1. 문자로 형변환 :to_char
2. 숫자로 형변환 :to_number
3. 날짜로 형변환 :to_date

---

**64. 오늘이 무슨 요일인지 출력하시오**
```
SELECT TO_CHAR(SYSDATE,'DY') || '요일'
FROM DUAL; 
```

**65. 이름, 입사한 요일을 출력하시오.**
```
SELECT ename, hiredate, TO_CHAR(hiredate, 'DY') "요일"
FROM emp;
```

---

- 설명
    - 날짜 포멧스트링(기초1의 볼륨1 4-12)
    - 요일 : day, dy
    - 년도 : YYYY, YY, RRRR, RR, year
    - 달 : mm, mon, month
    - 일 : dd
    - 주 : ww, w, iw
    - 시간 : hh, hh24
    - 분 : mi
    - 초 : ss

---

**66. 오늘부터 200달 뒤에 돌아오는 날짜의 요일을 출력**
```
SELECT TO_CHAR(ADD_MONTHS(SYSDATE,200), 'DY')
FROM DUAL;
```

**67. 이름과 입사한 년도를 출력하시오.**
```
SELECT ename , TO_CHAR(hiredate, 'RRRR')
FROM emp;
```

**68. 1981년도에 입사한 사원들의 이름과 입사일을 출력하시오.**
```
SELECT ename, hiredate 
FROM emp
WHERE TO_CHAR(hiredate, 'yyyy') = '2021';
```

**69. 목요일에 입사한 사원들의 이름과 입사일, 입사한 요일을 출력하시오.**
```
SELECT ename, hiredate, TO_CHAR(hiredate, 'DY') || '요일'
FROM emp
WHERE TO_CHAR(hiredate, 'DY') || '요일' = '목요일';
```

---

- 설명
    - trim은 DB에 뜻하지 않게 공백이 들어가서 적용한 함수

---


**70. 81년 12월 11일에 입사한 사원의 이름과 입사일을 출력하시오.**
```
SELECT ename, TO_CHAR(hiredate, 'YYYY"년" MM"월" DD"일"') "입사일"
FROM emp
WHERE  hiredate = '81/12/11';
```

**71. 이름과 월급을 출력하는데 월급에 천단위를 부여하시오! (예: 3000 -> 3,000)**
```
SELECT ename, TO_CHAR(sal, '$99,999')
FROM emp;
```

**72. 이름과 월급 * 5400을 출력하는데, 천단위와백만단위를 출력하시오.**
```
SELECT ename, TO_CHAR(sal*5400, '99,999,999')
FROM emp;
```

---

- 설명
    - 일반함수
        1. nvl
        2. decode
        3. case
---
 

**73. 이름과 커미션을 출력하는데 커미션이 null인 사원들은 0으로 출력하시오.**
```
SELECT ename, NVL(comm, 0)
FROM emp;
```

---

- 설명
    - nvl 함수는 argument 양쪽의 데이터 타입을 맞춰야 한다.

---

**74. 이름과 커미션을 출력하는데 커미션이 null인 사원들은 no comm 이란 글씨로 출력하시오.**
```
SELECT ename, NVL(TO_CHAR(comm), 'no comm')
FROM emp;
```