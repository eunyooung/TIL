package sist.com.obj;

// String, StringBufffer, StringBuilder

public class MainClass6 {
    
    public void objectPro1() {

        String s1 = new String(new byte[] { 97, 98, 99, 100 }); // value[97, 98, 99, 100]
        String s2 = new String("Ajax"); // value[A, j, a, x]   

        /*
         * for(byte b : s1.getBytes()) {
         *     System.out.println(b);
         * }
         */
        
        char[] c = new char[10]; // [][][][][][][][][][]
        s2.getChars(0, 2, c, 0);
        System.out.println(c);
    }

    public void objectPro2() {
        String s1 = "abc"; // 암시적 
        String s2 = new String("defd"); // 명시적
        System.out.println(s1.concat("입니다"));
        //System.out.println(s1);
        //System.out.println(s1.charAt(0));
        //System.out.println(s1.codePointAt(0));
        //System.out.println(s1.codePointBefore(1));
        System.out.println(s2.indexOf("d", s2.indexOf("d") + 1));
        System.out.println(s1.startsWith("abc"));
        System.out.println(s1.endsWith("abc"));
    }

    public void objectPro3() {
        String s1 = "Abc#Def#GHI";
        String[] strArray = s1.split("G");
        for (String s : strArray) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        MainClass6 o = new MainClass6();
        o.objectPro3();
    }
}