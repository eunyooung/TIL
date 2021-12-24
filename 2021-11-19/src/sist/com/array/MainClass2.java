package sist.com.array;

public class MainClass2 {

    public void randomEx() {
        System.out.println((int) (Math.random() * 100) % 45 + 1);
    }

    public void arrayAction1() {
        int[] m = new int[10];//[int][][][][][][][][][]
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) ((Math.random() * 100));
        }
        disp(m);
    }

    public void disp(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%3d", data[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MainClass2 a = new MainClass2();
        a.randomEx();
        //a.arrayAction1();
    }
}
