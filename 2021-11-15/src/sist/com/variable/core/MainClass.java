package sist.com.variable.core;

// 변수(기본형,형변환)Method param,return,operator,controller
// byte~ double,char,boolean,String

public class MainClass {
    
    public void binaryMethod() {
        //0~9 abcdef 16
        //0~7 
        int vx = 0xf;//16
        int vo = 010;//8
        int vb = 100;
        System.out.println(Integer.toBinaryString(vb));
        //System.out.println(vo);
     }

    public void byteMethod1() {
        //byte byteValue1 = (10 + 20) > Byte.MAX_VALUE ? Byte.MAX_VALUE : (10 + 20);
        byte byteValue1 = (Byte.MAX_VALUE + 1) > Byte.MAX_VALUE ? Byte.MAX_VALUE : 0;//지역변수
        System.out.print(byteValue1);
    }
    
    public float byteMethod2() {
        byte byteValue1 = 100;
        byte byteValue2 = 100;      
        return byteValue1 + byteValue2;
    }
    
    public void intMethod(int v1) {
        int v2 = Integer.MAX_VALUE;//2147483647
        long rs = v1 + (long)v2;
        System.out.println(rs);//2147483648
    }
    
    public short shortMethod(short x,short y) {
        short sValue1 = 120;
        short sValue2 = 520;      
        return (short)(sValue1 + 5);
    }
    
    public float doubleMethod() {      
        return 100 / (float)3;
    }
    
    public void formatPrint() {
        //System.out.printf("오늘은%d일입니다", 15);
        int c = 65;
        //System.out.printf("c는 정수=%d 이고 문자는 %c이다 ", c, c);
        //System.out.printf("%s", "Action Data");
        //System.out.printf("%b", 5 > 3);
        /*
         * System.out.printf("정수 %d= 8진수%o", 8, 8);
         * System.out.printf("정수 %d= 16진수%x", 10, 10);
         */
        System.out.printf("%.2f", 95.678124);
    }
    
    public static void main(String[] args) {
        MainClass v = new MainClass();
        System.out.println(v.doubleMethod());
        //System.out.println(v.shortMethod((short)120,(short)520));
        //v.byteMethod1();
        //v.intMethod(1);
    }
}