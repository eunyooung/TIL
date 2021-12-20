package sist.com.variable.basic;

// 변수는 DATA를 담는공간 

public class MainClass2 {
    // 자료형 변수;   instance변수 Heap
    
    public void methodEx1(int x, int y, int z) {//int x,int y,int z Paramter ,인자 (매개변수),지역변수
        //지역변수 auto변수  Stack
        //int x; 같은 공간에서 같은이름 할당 불가
        x = x + 1;
        y = y + 1;
        z = z + 1;
        System.out.println("x=" + x + " y=" + y + " z=" + z);//10 20  30
    }
    
    public int method2(byte x, byte y) {
        byte rs = (byte)(x + y);
        System.out.println("rs=" + rs);
        return rs + rs;
    }
    
    public void method3(double x) {
        int h = 20;
        double d = h;
        //h = d;
    }
    
    public double method4(int x, int y) {
        return  x > y ? x + y : x * y;
    }
    
    public static void main(String[] args) {
        MainClass2 v = new MainClass2();
        System.out.println(v.method4(7,5));
        //v.method3(10);
        
        //short s = (short)v.method2((byte)10, (byte)20);
        //v.methodEx1(1,2,3);//1,2,3 Arguments(전달인자)
        /*
         * int x = 10,y = 20,z = 30; v.methodEx1(x, y, z);
         */
    }
}