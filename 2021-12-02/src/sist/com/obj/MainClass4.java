package sist.com.obj;

public class MainClass4 {
    
    public void add(int x, long y) {
        System.out.println("add(int x,long y)");
    }

    public void add(long x, int y) {
        System.out.println("add(long x,int y)");
    }

    public void makerOverLoad1() {
        byte b = 20;
        short s = 25;
        int i = 100;
        System.out.print(i);
        System.out.print(5 > 3);
        System.out.println(new char[] { 'a', 'b', 'c' });
        System.out.println(10.5F);
        System.out.println("abc");
    }

    public void array(int... x) {
        System.out.println("array(int ...x)");
    }

    public void array(long... x) {
        System.out.println("array(long ...x)");
    }

    public void array(double... x) {
        System.out.println("array(double ...x)");
    }

    public static void main(String[] args) {
        MainClass4 o = new MainClass4();
        o.array(new double[] { 10, 20, 30 });
        //o.makerOverLoad1();
        //o.add(10, 10L);
    }
}