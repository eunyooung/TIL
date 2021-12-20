package sist.com.variable.core;

// boolean
// byte <short < int < long <float < double
//       char
public class MainClass3 {

    public void castMethod1() {
        /*
         * char c = 99;
         * System.out.println((int)c);
         */
        String str = "120";
        int i = Integer.parseInt(str);
        System.out.println(i + 5);
    }
    
    public void castMethod2() {
        int i = 127;
        byte b = (i >= Byte.MIN_VALUE && i <= Byte.MAX_VALUE) ? (byte)i : 0;
        System.out.println(b);
    }
    
    public void castMethod3() {
        //a 97
        //b 98   
        /*
        * char i = 'a';
        * System.out.println((int)i);
        */
        char c = 65;
        int i = 'B';
        
        System.out.println(i);
    }
    
    public void binaryMethod(int value) {
        //System.out.println(Integer.to);
        String b = Integer.toBinaryString(value);
        String ot = Integer.toOctalString(value);
        String hx = Integer.toHexString(value);
        System.out.println(b + " " + ot + " " + hx);
        System.out.println("2진수" + b + " :" + Integer.valueOf(b, 2));
        System.out.println("8진수" +  ot + " :" + Integer.valueOf(ot, 8));
        System.out.println("16진수" + hx + " :" + Integer.valueOf(hx, 16));
    }
    
    public static void main(String[] args) {
        MainClass3 v=new MainClass3();
        v.binaryMethod(15);
        //v.castMethod3();      
    }
}