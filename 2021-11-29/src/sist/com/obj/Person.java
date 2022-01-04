package sist.com.obj;

// Member,Instance

public class Person { // private String name; 멤버변수, field, state, attribute, data

    private String name;
    private int age;
    private double height;

    // overloading
    public void set(String name) {
        this.name = name;
    }

    public void set(String name, int age) {
        set(name);
        this.age = age;
    }

    public void set(String name, int age, double height) {
        set(name, age);
        this.height = height;
    }

    public void disp() {
        System.out.println("name=" + this.name + " age=" + this.age + " height=" + height);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        
        return "name=" + this.name + " age=" + this.age + " height=" + height;
    }

    public static void main(String[] args) {
        //System.out.println(new Person() == new Person());
        Person p1 = new Person(); // name|age|height
        //Person p2 = new Person(); // name|age|height
        p1.set("민섭", 25, 180.5);
        //p1.disp();
        System.out.println(p1);
    }
}