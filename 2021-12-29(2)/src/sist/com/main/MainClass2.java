package sist.com.main;

/*
 *    2장(변수,형변환),
 *    3장(연산자:증감,산술,논리,비교,대입),
 *    4장(조건문,반복문),
 *    6장(객체지향의 개념),
 *    7장(상속,포함,클래스 종류(인터페이스),
 *    8장(예외처리(try~catch,throws),
 *    9장(Object,String,Stringbuffer,Wrapper,Math),
 *    10장(Date,Calendar),
 *    11장(컬렉션:ArrayList,HashSet,HashMap),
 *    12장(제네릭스),
 *    15장(File , FileInputStream,FileOutputStream,FileReader,FileWriter)
 *    
 *    ==> 2차 자바 
 *        =>오라클 연결 
 *        =>브라우저 연결
 *    ==> 3차 자바
 *        => Spring 
 *        => MyBatis 
 *        
 *    =========================================
 *    
 *    3장 : 연산자 
 *    단항연산자 (데이터 한개를 대상으로 연산)
 *       ++ , -- : 반복문 
 *          => 전위 , 후위 
 *             ++a   a++ => 다른 연산 수행 나중에 증가 
 *             ===
 *             먼저 증가 => 다른 연산 수행 
 *             
 *             예)
 *                 int a = 10;
 *                 int b = ++a;
 *                     = 대입연산자(2)
 *                     = ++ (1)
 *                     a값을 증가후에 b에 대입 
 *                 int b = a++
 *                     = 대입연산자(1)
 *                     = ++(2)
 *                     a값을 b에 먼저 대입하고 나중에 증가한다 
 *       !       : 조건문 , 반복문 조건 (부정 연산자 => boolean만 사용이 가능)
 *                 true ==> !true => false
 *                 => 같지 않는 데이터를 찾는다 
 *                 => 예약 날짜가 아닌 날 
 *                 => 컴퓨터와 게임을 할 경우 
 *                 
 *                 boolean bCheck = false; //턴 => 3명 %3 012
 *                 while(true) {
 *                    bCheck=!bCheck;
 *                    if(bCheck==true) {
 *                       // 사용자 
 *                    }
 *                    else {
 *                       // 컴퓨터 
 *                    }
 *                 }
 *       (데이터형, 클래스) => 형변환 연산자 
 *         데이터형 : 수 표현 갯수 (크기 결정)
 *         클래스 : 상속(is-a), 포함(has-a)
 *                 상속 => 상속을 내리는 클래스가 크다 
 *                        *** Object는 모든 클래스에 상속을 내리는 클래스
 *                            자바의 최상위 클래스  
 *    이항연산자 (데이터 두개)
 *      = 산술연산자 (가장 많이 사용되는 연산자)
 *        + , - , * , / , %
 *        = 문자열 결합 , 일반 산술 => 왼쪽부터 계산 
 *          "a" + 1 + 2 + 3
 *          =====
 *            1  "a1"
 *          =======
 *            2  "a12"
 *          =========
 *            3  "a123"
 *          
 *          1 + 2 + 3 + "a"
 *          ===
 *           3
 *            ===
 *              6
 *              ====
 *               "6a"
 *          "a" + 1 + 4 * 5
 *                    =====
 *                20
 *           "a" + 1 => "a1" + 20 ==> "a120"
 *          "a" + 1 + (4 - 5) => "a14" - 5 => 오류 
 *          
 *         / => 0으로 나눌 수 없다 , 정수/정수=정수 
 *         % => 부호 (왼쪽부호가 동일하게 남는다)
 *         - % - => -
 *         - % + => -
 *         + % - => +
 *         + % + => +
 *         
 *      비교연산자 : 결과값 => boolean : 조건문을 만들때 많이 사용 
 *                 == , != , < , > , <= , >=
 *      논리연산자 : 결과값 => boolean : 조건문을 만들때 많이 사용 
 *                 &&  , || 
 *                 
 *                 && => 범위안에 포함 
 *                 대문자 c>='A' && c<='Z'
 *                       c>=1 && c<=100
 *                 || => 범위밖에 있는 경우 
 *                       c<1 || c>100 ==> 오류 처리 
 *                 *** 효율적인 연산 
 *                 true ||   ==> 뒤에 있는 연산은 하지 않는다 
 *                 false &&  ==> 뒤에 있는 연산은 하지 않는다 
 *       대입연산자 : (저장)=()   오른쪽 => 왼쪽에 값 대입
 *       복합대입연산자 : op= 
 *                    ====   += , -= => 반복문 (1개씩 증가는 하는 것이 아니라
 *                                            2,3,4,5....)
 *        
 *          
 *    삼항연산자 (데이터 3개) => if~else => true/false일때 처리를 나눠서 작업
 *    ==================
 *     조건문?값1:값2
 *     ====
 *      true => 값1
 *      false=> 값2
 *     웹이나 게임 => 삼항연산자를 주로 사용 
 *     
 *     
 *     ==> 일반적인 연산 : 산술연산자 ==> 대입연산자  
 *         제어문 : 비교연산자,논리연산자 
 *         
 *     ============================= 데이터 가공하는 방법 
 *     오라클 
 *     ===== 산술연산자 (형변환(X)) / => 정수/정수=실수
 *     ===== 비교연산자 : <> (!=)
 *     ===== 논리연산자 : and(&&) , or(||) , not(!)
 *                     && => Scanner (입력값을 받을 경우)
 *                     || => 문자열 결합
 *     =============================
 *     
 *     = 형변환
 *       = 자동형변환 => 큰값에 작은 값을 대입 
 *                    큰값과 작은 값을 연산 
 *         int a = 'A';
 *                 ===
 *                  65  자동으로 변경 
 *         long a = 100;
 *                  ===
 *                   100L
 *         double a = 10;
 *                    ==
 *                    10.0
 *                  
 *         ==>연산처리 : 같은 크기의 데이터형만이 연산 처리가 된다 
 *            10 + 10.5
 *            ====
 *            10.0 
 *            10.0 + 10.5
 *           
 *            'A' + 10
 *            ===
 *             65
 *             
 *             65 + 10 => 75
 *       = 강제형변환 => 직접 변경해서 사용 ==> 형변환 연산자 사용
 *                    int이하(byte, short, char)는 연산결과가 int
 *           int a = (int)10.7;
 *           
 *       = Object obj = new A();
 *       = A a = (A)new Object();
 *       =========================================================
 *       *** 자바에서 제공하는 라이브러리의 리턴값은 특별한 경우가 아니면 Object
 *           *** 데이터형을 통일화 (프로그램에 맞는 데이터형으로 변경 => 사용)
 *               ============= 제네릭스  <변경할 클래스명> 
 */

public class MainClass2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}