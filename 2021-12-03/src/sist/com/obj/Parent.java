package sist.com.obj;

public class Parent {
    
    private int parentValue;

    public Parent() {

    }

    public Parent(int parentValue) {
        this.parentValue = parentValue;
        System.out.println("Parent생성자");
    }
}