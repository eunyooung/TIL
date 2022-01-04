# My SELECT Exercise Answers

1. 부서 번호가 10번인 부서의 사람 중 사원번호, 이름, 급여를 출력하라.
```
SELECT empno, ename, sal
FROM emp
WHERE deptno = 10;
```

2. 사원번호가 7698인 사람 중 이름, 입사일자, 부서번호를 출력하라.
```
SELECT ename, hiredate, deptno
FROM emp
WHERE empno = 7698;
```

3. 이름이 ALLEN인 사람의 모든 정보를 출력하라.
```
SELECT *
FROM emp
WHERE ename = ‘ALLEN’;
```
 
4. 입사일자가 83/01/12인 사원의 이름, 부서 번호, 급여를 출력하라.
```
SELECT ename, deptno, sal
FROM emp
WHERE hiredate = ‘83/01/12’;
```

5. 직업이 MANAGER가 아닌 사람의 모든 정보를 출력하라.
```
SELECT *
FROM emp
WHERE job <> ‘MANAGER’;
```
```
SELECT *
FROM emp
WHERE not job = ‘MANAGER’;
```
```
SELECT *
FROM emp
WHERE job != ‘MANAGER’;
```

6. 입사일자가 81/04/02 이후에 입사한 사원의 정보를 출력하라.
```
SELECT *
FROM emp
WHERE hiredate > ‘81/04/02’;
```

7. 급여가 $800이상인 사람의 이름, 급여, 부서 번호를 출력하라.
```
SELECT *
FROM emp
WHERE sal >= 800;
```

8. 부서번호가 20번 이상인 사원의 모든 정보를 출력하라.
```
SELECT *
FROM emp
WHERE deptno >= 20;
```

9. 성명이 K로 시작하는 사람보다 높은 이름을 가진 사람의 모든 정보를 출력하라.
```
SELECT *
FROM emp
WHERE ename > ‘K’;
```
   
10. 입사일자가 81/12/03 보다 먼저 입사한 사람들의 모든 정보를 출력하라.
```
SELECT *
FROM emp
WHERE hiredate < ‘81/12/03’;
```

11. 입사번호가 7698 보다 작거나 같은 사람들의 입사번호와 이름을 출력하라.
```
SELECT empno, ename
FROM emp
WHERE empno <= 7698;
```

12. 입사일자가 81/04/02 보다 늦고 82/12/09 보다 빠른 사원의 이름, 월급, 부서 번호를 출력하라.
```
SELECT ename, sal, deptno
FROM emp
WHERE hiredate >= ‘81/04/02’ AND hiredate <= ‘82/12/09’;
```
```
SELECT ename, sal, deptno
FROM emp
WHERE hiredate BETWEEN ‘81/04/02’ AND ‘82/12/09’;
```

13. 급여가 1,600 보다 크고 $3,000보다 작은 사람은 이름, 직무, 급여를 출력하라.
```
SELECT ename, job, sal
FROM emp
WHERE sal > 1600 AND sal < 3000;
```

14. 사원번호가 7654와 7788 사이 이외의 사원의 모든 정보를 출력하라.
```
SELECT *
FROM emp
WHERE empno NOT BETWEEN 7654 AND 7788;
```

15. 이름이 B와 J 사이의 모든 사원의 정보를 출력하라.
```
SELECT *
FROM emp
WHERE ename BETWEEN ‘B’ AND ‘J’;
```

16. 입사일자가 81년 이외에 입사한 사람의 모든 정보를 출력하라.
```
SELECT *
FROM emp
WHERE substr(hiredate,1,2) <> ‘81’;
```
```
SELECT *
FROM emp
WHERE hiredate NOT LIKE ‘81%’;
```

17. 직무가 MANAGER와 SALESMAN인 사람의 모든 정보를 출력하라.
```
SELECT *
FROM emp
WHERE job IN (‘MANAGER’, ‘SALESMAN’);
```
```
SELECT *
FROM emp
WHERE job = ‘MANAGER’ OR job = ‘SALESMAN’;
```

18. 부서 번호가 20,30번을 제외한 모든 사람의 이름, 사원번호, 부서 번호를 출력하라.
```
SELECT ename, empno, deptno
FROM emp
WHERE deptno NOT IN (20, 30);
```
```
SELECT ename, empno, deptno
FROM emp
WHERE NOT (deptno = 20 OR deptno = 30);
```

19. 이름이 S로 시작하는 사원의 사원번호, 이름, 입사일자, 부서번호를 출력하라.
```
SELECT ename, hiredate, deptno
FROM emp
WHERE ename LIKE ‘S%’;
```

20. 입사일자가 81년도인 사람의 모든 정보를 출력하라.
```
SELECT *
FROM emp
WHERE substr(hiredate,1,2) = ‘81’;
```

21. 이름 중 S자가 들어가 있는 사람만 모든 정보를 출력하라.
```
SELECT *
FROM emp
WHERE ename LIKE ‘%S%’;
```

22. 이름이 S로 시작하고 마지막 글자가 T인 사람의 모든 정보를 출력하라 (단, 이름은 전체 5자리이다.. 
```
SELECT *
FROM emp
WHERE ename LIKE ‘S___T’;
```
                      
23. 첫 번째 문자는 관계없고 두 번째 문자가 A인 사람의 정보를 출력하라.
```
SELECT *
FROM emp
WHERE ename LIKE ‘_A%’;
```
 
24. 커미션이 NULL인 사람의 정보를 출력하라.
```
SELECT *
FROM emp
WHERE comm IS NULL;
```

25. 커미션이 NULL이 아닌 사람의 모든 정보를 출력하라.
```
SELECT *
FROM emp
WHERE comm IS NOT NULL;
```

26. 부서가 30번 부서이고 급여가 $1,500 이상인 사람의 이름, 부서, 월급을 출력하라.
```
SELECT ename, deptno, sal
FROM emp
WHERE deptno = 30 AND sal >= 1500;
```

27. 이름의 첫 글자가 K로 시작하거나 부서 번호가 30인 사람의 사원번호, 이름, 부서 번호를 출력하라.
```
SELECT empno, ename, deptno
FROM emp
WHERE ename LIKE ‘K%’ OR deptno = 30;
```
	
28. 급여가 $1,500이상이고 부서 번호가 30번인 사워 중 직업이 MANAGER인 사람의 정보를 출력하라.
```
SELECT *
FROM emp
WHERE sal >= 1500 AND deptno = 30 AND job = ‘MANAGER’;
```