package sist.com.obj;

public class Alphabet {

    public static void main(String[] args) {
        A a = new A(10);
        B b = new B(20, a);
        System.out.println(b.getA().getA());
    }
}