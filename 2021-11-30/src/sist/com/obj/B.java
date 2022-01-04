package sist.com.obj;

public class B {
    
    private int b;
    private A a;

    public B() {
    }

    public B(int b) {
        this.b = b;
    }

    public B(A a) {
        this.a = a;
    }

    public B(int b, A a) {
        this.b = b;
        this.a = a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public A getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }
}