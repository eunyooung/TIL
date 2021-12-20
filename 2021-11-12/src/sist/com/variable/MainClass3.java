package sist.com.variable;

// class (설계도,사용자정의 자료형)

public class MainClass3 {

    public void byteValueMethod() {
        System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        //return 45.7;
    }

    public void shortValueMethod() {
        System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);
        //return 45.7;
    }

    public void intValueMethod() {
        shortValueMethod();
        System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
        //return Integer.MAX_VALUE;
    }

    public void longValueMethod() {
        intValueMethod();
        System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);
        //return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        MainClass3 vv = new MainClass3();
        vv.longValueMethod();
        //System.out.println("rs = " + rs);
        //vv.methodAction1();
    }
}