package sist.com.variable;

public class MainClass2 {

    public void methodAction1() {
        methodAction2();
        System.out.println("methodAction1");
    }

    public void methodAction2() {
        methodAction3();
        System.out.println("methodAction2");
    }

    public void methodAction3() {
        methodAction4();
        System.out.println("methodAction3");
    }

    public void methodAction4() {
        System.out.println("methodAction4");
        return;
    }

    // methodAction4
    public static void main(String[] args) { //main
        MainClass2 v = new MainClass2();
        v.methodAction1();
    }
}