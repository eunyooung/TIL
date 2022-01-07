package sist.com.obj;

public class MainClass5 { // scope
    
    private String value;
    private static String maker = "Oralce";

    public MainClass5(String value) {
        this.value = value;
        //this.maker="Sun";
    }

    public void setMaker(String maker) {
        MainClass5.maker = maker;
    }

    public static String getMaker() {
        return MainClass5.maker;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        MainClass5 o1 = new MainClass5("A"); // value(A)
        MainClass5 o2 = new MainClass5("B"); // value(Xml)
        o1.setMaker("Ms");
        System.out.println(o2.getMaker());
    }
}