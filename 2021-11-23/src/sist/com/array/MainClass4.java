package sist.com.array;

public class MainClass4 {
    public void add(int[] m) {
        int[] imsi = new int[m.length * 2];//[][][][][][][][][][]

        m = imsi;
        System.out.println(m.length);
    }

    public void reverse(char[] c) {
        char[] imsi = new char[c.length];
        for (int i = 0; i < imsi.length; i++) {
            imsi[i] = c[c.length - (i + 1)];
        }
        //c = imsi;
        System.arraycopy(imsi, 0, c, 0, imsi.length);
    }

    public static void main(String[] args) {

        MainClass4 a = new MainClass4();
        char[] c = { 'A', 'J', 'a', 'x' };//A|J|a|x
        a.reverse(c);
        System.out.println(c);

        /*
         * int []m = new int[5];//[][][][][]
         * System.out.println("main.m.length=" + m.length);
         * a.add(m);
         */
    }
}