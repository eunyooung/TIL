package sist.com.variable.core;

// 변수(데이터를 담는공간) 숫자

public class MainClass2 {
 
    public int variableEx1() {
        double dValue = 25.6789;
        return (int)dValue;
    }
    
    public char variableEx2() {
        return 97;
    }
    
    public int variableEx3() {
        //return 97;
        return 'A';
    }
    
    public double variableEx4(int x,int y,int z) {      
        return (x + y * z) / (double)(x - y);
    }
    
    public int variableEx5(int x,int y,int z) {
        //return ++x == y++;// 2==2      
        return x++ + --y + z++ ;    
    }
    
    public static void main(String[] args) {
        MainClass2 v = new MainClass2();
        System.out.println(v.variableEx5(1, 2, 3));
        //System.out.println(v.variableEx4(5,7, 6));
        /*
         * int rs = v.variableEx1() + v.variableEx1(); System.out.println(v.variableEx3());
         */
    }
}