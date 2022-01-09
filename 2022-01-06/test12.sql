-- 2022-01-06 ����Ŭ �Լ� (������ �Լ� , �����Լ�)
-- �����Լ� , GROUP BY , HAVING , JOIN , SUBQUERY 
/*
             ������� �������� ����  ���� ��� ���� 
     ������ ======== �ڹ�  ========= ����Ŭ 
                     ��û                  SQL���� ����  
     ================================> ���� (������)
     = ����Ŭ => �������� (���� (CHAR,VARCHAR2,CLOB), ���� (NUMBER) ,
                       ��¥ (DATE))
     ������ �Լ� 
       ���� ���� �Լ�
          = ������ ���� : LENGTH(����|�÷�)  => ȭ�� ��� (HTML) 
          = ���ڸ� ����(�ڸ���) : SUBSTR(���ڿ�,������ġ(����),����) 
                                          INSTR(���ڿ� , ã�� ���� , ������ġ , ���° ��ġ)
          INSTR('Hello Oracle','l' ,1 , 3) => 3��°�� �ִ� l�� ã�´� 
          = RPAD : IDã�� , ��й�ȣ ã�� (�̸��� => �ڹ�(JavaMail))
                        ===== ho** (����)
          = ����Ŭ���� ó�� , �ڹٿ��� ó�� 
             => ����� ==> ��û ==> �ڹ� == SQL������ ���� ����Ŭ�� ���� 
                                               =====                               =====
                                               �����α׷��� => �ڹٿ��� ó�� 
                                               DBA => ����Ŭ���� ó�� 
       ���� ���� �Լ�
          = ROUND() �ݿø� => ��� , ��õ (����)
          = TRUNC() ���� 
          = CEIL() => �������� ���ϱ� 
       ��¥ ���� �Լ� 
          = SYSDATE : �ý����� �ð�,��¥ => ����ڰ� �Է����� �ʰ� ��ü ó��
                            ����ڰ� ��¥ ���� (ȣ�� ����, ��ȭ ����...)
          = MONTHS_BETWEEN : ���� ~ ���ݱ����� �������� ��� 
                                           ȣ�� , ���� , ������ 
                                           => �ǹ��� �������α׷� (��õ)
       ��ȯ ���� �Լ� 
         = TO_CHAR : ��¥�� ���ڸ� ���ڿ��� ��ȯ ==> �ڹٿ����� String
                            => ���� 
                                 ��¥ ���� 
                                    YYYY(RRRR) : �⵵  => 2�ڸ� (YY,RR)
                                    MM : �� 
                                    DD  : �� 
                                    DY  :  ���� 
                                    HH/HH24 : �ð� (�������� , ���,���α�)
                                    MI : �� 
                                    SS : ��
                                 ���� ���� 
                                    999,999 => ,��� 
                                    L999,999
                                    $999,999

       ��Ÿ �Լ� : 
           = NVL : NULL�� ��쿡 �ٸ� ������ ��ü�ؼ� ��� (���� ����)
     �����Լ�(�����Լ�) : ������ �Լ�,�÷����� ���ÿ� ����� �Ұ��� 
           SELECT SUM(sal) ,ename  ==> ��� ==> GROUP BY 
           FROM emp; (X)
           ==> ���̺� ��ü�� ������� ��� (����)
           = COUNT : ���� ��� (�ο��� , �����ο�...)
                           �α��� , ���̵��ߺ�üũ , �˻� ��� Ȯ�� 
                           ��� ��� (����=> ������)
               = COUNT(�÷���) => �÷����߿� NULL�� �ִ� ���� ���� 
               = ***COUNT(*) => NULL�� �����ؼ� �����
           = MAX : �ִ밪 (emp�� ��ϵ� ����� ���� ���� �޴� �޿�) 
                        => �ڵ�������ȣ (MAX+1) => ROW���� ���� 
           = MIN : �ּҰ� 
           = SUM : ��(����) ==> ���� (�ѱݾ�)
           = AVG : ��� 
            
     ����� ���� �Լ� (���� ���� => PL/SQL) , JDBC (�ڹٿ���) => 5�� 
           ***SELECT *  | column1,column2...
           ***FROM table_name
           [
                ***WHERE ���ǹ� : ������ 
                =============================
                GROUP BY  �׷캰�� ������ ó�� (�б�...)
                HAVING �׷캰 ���� 
                =============================
                ***ORDER BY : �����ؼ� ��� 
           ] 
*/
-- 14
SELECT COUNT(*) FROM emp;
-- 13
SELECT COUNT(mgr) FROM emp;
-- 4
SELECT COUNT(comm) FROM emp;
/*
     JOIN: ���̺� �������� ���ļ� ȭ�鿡 ����� ������ ���� 
     SubQuery : SQL���� �������� ���ļ� �ѹ��� ���� 
     157page => �����Լ� , GROUP BY 
                      =======
                         ***1. COUNT 
                         2. ***MAX,MIN 
                         3. SUM,AVG 
                         ***4. RANK   ==> ROLLUP , CUBE
     = DDL (���̺� ���� => ��������) 
     = DML (INSERT , UPDATE, DELETE) 
     = ���̺��� ������ �϶� => �������� (�����ͺ��̽� �𵨸�) => ������Ʈ
     ====================== �� ����Ʈ ���� ==============
     HTML / CSS / JavaScript  ==> JSP (HTML+Java) ==> MVC ==> Spring 
                                               ============================
                                                       �ڹ� + ����Ŭ ���� 
     JavaScript : Jquery,Ajax ,VueJs , ReactJS 
     ����Ŭ ���� : MyBatis (XML) 
     AI : ê�� 
     =====> ���� (AWS) (������ ���) => ����� (XWindow)

    COUNT(�÷���)
     ��) COUNT(deptno) => 14 (10,20,30)
    COUNT(�÷��� => �ߺ��� ���� ������ ����)
     ��) COUNT(DISTINCT deptno) => 3
    ======== �÷��� (NULL�� ����)
    ��ü ���� 
    COUNT(*) ==> ��ϵǾ� �ִ� Row�� ���� (�����) 
                          NULL���� �����ؼ� ������ �´� 
     
*/
-- emp�� ��ϵ� ��� ����� ���� ��� 
SELECT COUNT(*) "�ѻ����" 
FROM emp;
-- emp�� ��ϵ� 10�� �μ����� �ٹ��ϴ� �����
SELECT COUNT(*) "10���μ�" 
FROM emp
WHERE deptno=10;
-- emp�� ��ϵ� 20�� �μ����� �ٹ��ϴ� �����
SELECT COUNT(*) "20���μ�" 
FROM emp
WHERE deptno=20;
-- emp�� ��ϵ� 30�� �μ����� �ٹ��ϴ� �����
SELECT COUNT(*) "30���μ�" 
FROM emp
WHERE deptno=30;
-- emp�� ��ϵ� �μ��� � �ִ��� Ȯ�� ==> �ߺ��� ���� 
SELECT COUNT(DISTINCT deptno)
FROM emp;
/*
     MAX => �ִ밪 (�޿��� �ִ밪�� �޴� ���) , ��� ��� => ����� �޶�� �ϱ� ������
                                                                    MAX(empno)+1 (*******)
     MIN  => �ּҰ� 
*/
SELECT TO_CHAR(MAX(sal),'$999,999') "�ִ�޿�" , 
           TO_CHAR(MIN(sal),'$999,999') "�ּұ޿�"
FROM emp;

/*
     SUM(�÷���) : ����  
     AVG(�÷���) : ��� ==> ROUND() 
*/
SELECT SUM(sal) "�޿�����", AVG(sal) "�޿����"
FROM emp;
-- ����ڰ� ���� ���ϰ� ����� (��� ���α׷� => �ѹ��� ����ڸ� �߽�����)
-- ������ ���� 
SELECT TO_CHAR(SUM(sal),'$999,999') "�޿�����", 
           ROUND(AVG(sal),0) "�޿����"
FROM emp;
-- 2073
-- emp����߿� ��� �޿����� ���� �޴� ����� ��� ������ ��� 
set linesize 300
SELECT *
FROM emp
WHERE sal<2073;
/*
     �м��Լ� => ROW������ ó�� => �Ϲ� �÷��� ���ÿ� ����� ���� 
     RANK() => ���� ��� 
     DENSE_RANK() => ���� ���

     RANK()
     98  => 1
     95  => 2
     95  => 2
     78  => 4
     60  => 5

     DENSE_RANK()
     98  => 1
     95  => 2
     95  => 2
     78  => 3
     60  => 4

    ==> ���� (�α� �Խù� , �α� ��ǰ , �α� ��ȭ) ==> hit(����� �湮)
    RANK() OVER(ORDER BY �÷�|�Լ� ASC|DESC)
    DENSE_RANK() OVER(ORDER BY �÷�|�Լ� ASC|DESC)                  
*/
-- �޿��� ���� �޴� ������ ��ŷ�� ����Ѵ�  ORDER BY sal DESC
SELECT ename,sal , RANK() OVER(ORDER BY sal DESC) "rank"
FROM emp;

SELECT ename,sal , DENSE_RANK() OVER(ORDER BY sal DESC) "rank"
FROM emp;
-- 159page => �����Լ��� ���� 
SELECT COUNT(*) "�����",
           TO_CHAR(MAX(sal),'$999,999') "�ִ�޿�",
           TO_CHAR(MIN(sal),'$999,999') "�ּұ޿�",
           TO_CHAR(SUM(sal),'$999,999') "�޿�����",
           ROUND(AVG(sal),0) "�޿����"
FROM emp;
-- WHERE ,SELECT => �Լ� ==> ���� �ʿ��� �����͸� ���� (����Ŭ => SELECT)




