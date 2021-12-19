package sist.com.lib;

/*
 *   자바 
 *   1) 문법 
 *      =========> 1~8장 (변수 , 배열 , 클래스 , 연산자 , 제어문,메소드)
 *   2) 용도 
 *      =========> 클래스,메소드 , 변수 (인스턴스 , static)
 *                 ===== 언제 인터페이스 , 메소드 (리턴형,매개변수)
 *                 ===== 예외처리 (try~catch , throws)
 *   3) 조립 
 *      사용자 정의 클래스 + 라이브러리 
 *   4) 순서 (알고리즘) 
 *      => 소스를 암기 => 순서 
 *      => 자바에서 가장 쉬운 프로그램 
 *         =====================
 *          네트워크 / 데이터베이스 =====> 모든 개발자가 동일 코딩 (표준화)
 *      => 구구단 / 페이지 (쉽다)
 *         2차 for   1차 for 
 *   ==> 반복 / 위치 확인 / CV ==> 분석 
 *   450page 
 *   java.lang    java.util   java.io    java.net  java.sql  java.text
 *   javax.xml    org.w3c.dom  org.w3c.sax 
 *   javax.http(JSP)
 *   
 *   1. java.lang ==> import를 생략할 수 있다 
 *      =========
 *      1) Object : 모든 클래스(사용자정의,라이브러리)의 상속을 내리는 클래스 
 *         class A (extends Object) 생략이 된다 
 *         = toString(객체를 문자열화)
 *         = finalize() : 소멸자 메소드 (객체가 메모리에서 해제 자동 호출되는 메소드)
 *         = clone() : 복제 ==> 스프링 (prototype)
 *      2) String / StringBuffer / StringBuilder
 *         라이브러리 : 원형 , 용도 
 *           원형 
 *           public int length()
 *         = String (문자열 제어하는 메소드)
 *           = length() : 문자 갯수 => ...
 *             원형) public int length()
 *           = equals() : 문자열을 비교 (==(X)) => 로그인 , id중복체크
 *             (대소문자 구분) 
 *             원형) public boolean equals(String s)
 *           = equalsIgnoreCase() : 문자열 비교 (대소문자 구분 없이)
 *             검색기 
 *             원형) public boolean equalsIgnoreCase(String s)
 *           = substring() : 원하는 부분만 문자열를 자르는 역할 
 *             원형)
 *                  public String substring(int start)
 *                  public String substring(int start,int end)
 *           = trim() : 좌우 공백을 제거할때 사용 
 *             => 사용자가 실수로 space를 사용 => 왼쪽에 공백이 있어서 
 *                찾기가 어렵다 
 *             => public String trim() => 공백문자 제거후 다시 리턴
 *           = indexOf ==> 문자를 찾기 (앞에서)
 *             => public int indexOf(String s)
 *                public int indexOf(char c)
 *           = lastIndexOf ==> 문자를 찾기 (뒤에서)
 *             => public int lastIndexOf(String s)
 *                public int lastIndexOf(char c)
 *           = split() ==> 문자열을 분리 
 *             => public String[] split(String regex) 
 *           = replace() ==> 문자한개 변경 
 *             => public String replace(char c1,char c2)
 *                public String replace(String c1,String c2)
 *           = replaceAll() ==> 문자 전체 변경(정규식)
 *             => public String replaceAll(String s1,String s2)
 *                한글 [가-R]
 *                영문 [A-Za-z]
 *                숫자 [0-9]
 *           = charAt() => 문자열중에 문자한개 자르는 경우
 *             => public char charAt(int index) 
 *           ======================================
 *           = startsWith : 시작문자열
 *             => public boolean startsWith(String s)
 *           = endsWith : 끝나는 문자열 
 *             => public boolean endsWith(String s)
 *           자동완성기 (서제스트) ==> 검색기 , Cookie구분 
 *           ======================================
 *           = toUpperCase : 대문자 변환
 *             => public String toUpperCase()
 *           = toLowerCase : 소문자 변환 
 *           => public String toLowerCase()
 *           = valueOf() :모든 데이터형을 문자열로 변환 
 *           => valueOf(3) ==> "3"
 *              valueOf(true) ==> "true"
 *              public static String valueOf(int a)
 *              public static String valueOf(boolean a)
 *              public static String valueOf(char a)
 *              public static String valueOf(float a)
 *              ..
 *              ..
 *              ..
 *      3) Math 
 *          => ceil : 올림 
 *          => random : 난수 
 *      4) Wrapper : 모든 데이터형을 클래스 
 *         =========
 *          byte ==> Byte 
 *          short ==> Short 
 *          int  ==> Integer
 *          double ==> Double 
 *          float  ==> Float 
 *          boolean ==> Boolean
 *      5) System 
 *         =========
 *           System.in
 *           System.out
 *           System.gc() => 멀티미디어 , 화상 ...
 */
/*
 *   Object : 모든 클래스의 최상위 클래스 (모든 클래스는 Object로 부터 상속)
 *   => Object가 가지고 있는 모든 메소드를 사용할 수 있다 
 *   => 자바 클래스 
 *      class A extends Object
 *              =============== 자동 생성이 가능하게 제작 
 *      = toString()
 *      = finalize() 
 *      = clone() 
 *      = 객체 사용 방법 
 *        = 참조
 *        = 복제 
 */

class Sawon /* extends Object */ {

    private String name;

    public Sawon(String name) {
        // 생성자 => 변수의 초기화 
        System.out.println("Sawon 객체 메모리에 저장");
        this.name = name;
    }

    //출력 
    public void print() {
        // 객체 기능 활용
        System.out.println("이름:" + name);
    }

    //메모리에 해제 
    //객체의 메모리에서 사라질때 자동호출되는 메소드 (소멸자)
    /*
     *   A()  ==> new 
     *   ~A() ==> 메모리 해제 delete (GC) => 자동 메모리 해제 
     */
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Sawon 객체 메모리 해제...");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Sawon이 가지고 있는 이름은 " + name + "입니다";
    }

    // Object에서 재정의 (오버라이딩) => toString()

}

public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 사원 기능 사용 

        // 1. 메모리에 저장 
        Sawon s = new Sawon("홍길동");
        // com.sist.lib.Sawon@5e91993f
        System.out.println(s.toString());// 주소값을 출력
        System.out.println(s);

        // 2. 활용 
        s.print();

        // 3. 메모리 해제 => s=null (GC)
        s = null; // 사용하지 않는다 

        // 4. 직접 해제 
        System.gc(); // 가비지컬렉션 호출 (메모리에서 사용하지 않거나 , null일때 회수)
        // finalize()가 호출되면 메모리에서 제거
    }
}
