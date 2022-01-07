package sist.com.obj;

// class, object(instance), classArray, overloading, constructor, this, this(),
// Object(사물 그자체, this, instance), static, final

public class MainClass {
    
    // 자료형 변수명; 자료형(기본,참조), class영역, heap영역
    private int data; // iv heap
    private static int classVariable; // class영역 

    public void instanceMethod(MainClass this) {
        System.out.println("instanceMethod");
        int local = 10; // lv stack
        this.data = 500;
    }

    public static void staticMethod() {
        System.out.println("staticMethod1");
        //data = 99;
        //this.data = 100;
    }

    public static void main(String[] args) {
        //staticMethod();
        //MainClass o1 = new MainClass(); // data
        //MainClass o2 = new MainClass(); // data
        //o1.instanceMethod();
        staticMethod();
    }
}