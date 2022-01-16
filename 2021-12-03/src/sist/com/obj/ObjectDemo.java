package sist.com.obj;

public class ObjectDemo extends Object {
    
    public void inheritanceEx1() {
        String s = new String();
        Object o = (Object) s; // UPCAST
        s = (String) o; // DOWNCAST
        System.out.println(s.concat("test"));
    }

    public void inheritanceEx2(Object obj) {
        if (obj instanceof String) {
            System.out.println(((String) obj).charAt(0));
        }
        if (obj instanceof ObjectDemo) {
            ((ObjectDemo) obj).inheritanceEx1();
        }
    }

    public Object inheritanceEx3() {
        //String s = (String)new Object();
        //System.out.println(s.charAt(0));
        return "25.5";

    }

    public static void main(String[] args) {
        ObjectDemo o = new ObjectDemo();

        System.out.println(o.inheritanceEx3() instanceof String);

        //o.inheritanceEx2(new String("abc"));
        //o.inheritanceEx2(o);
    }
}