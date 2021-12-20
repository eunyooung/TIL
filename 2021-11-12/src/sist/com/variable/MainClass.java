package sist.com.variable;

public class MainClass {

    public static void main(String[] args) {
        /*
         * final boolean booleanValue = 10 < 90; 
         * booleanValue = 5 == 3;
         * System.out.println("booleanValue=" + booleanValue);
         */

        byte byteValue = 127;//[0][1][1][1][1][1][1][1]
        //64 32 16  8  4  2  1
        short shortValue = 32767;//-32768~32767
        int intValue = 2147483647;
        System.out.print(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);
        char charValue = 'A';
        String str = "abcdefg";
    }
}
