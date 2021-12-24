package sist.com.controller;

public class MainClass4 {
    int num = 0;

    public void controllEx1() {
        num++;
        controllEx2();
    }

    public void controllEx2() {
        num++;
        controllEx3();
    }

    public void controllEx3() {
        num++;
        controllEx4();
    }

    public void controllEx4() {
        num++;
    }

    public static void main(String[] args) {
        MainClass4 c = new MainClass4();
        c.controllEx1();
        System.out.println(c.num);
    }
}
