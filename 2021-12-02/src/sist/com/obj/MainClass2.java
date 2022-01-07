package sist.com.obj;

public class MainClass2 {
    
    private static int classVariable; // class영역

    public static void staticMethod() {
        System.out.println("staticMethod2");
    }

    public static void main(String[] args) {
        MainClass.staticMethod();
    }
}