package sist.com.array;

public class MainClass {

    public void arrayEx1() {
        int[] m1 = new int[6];//[10][20][30][40][50]
        m1[0] = 10;
        m1[1] = 20;
        m1[2] = 30;
        m1[3] = 40;
        m1[4] = 50;
        /*
         * System.out.println(m1[0]); System.out.println(m1[1]);
         * System.out.println(m1[2]); System.out.println(m1[3]);
         * System.out.println(m1[4]);
         */

        for (int i = 0; i < m1.length; i++) {
            System.out.printf("m[%d]=%-3d", i, m1[i]);
        }
    }

    public void arrayEx2() {
        int[] m = { 10, 20, 30, 40, 50, 60, 70, 80 };
        for (int i = 0; i < m.length; i++) {
            System.out.printf("%5d", m[i]);
        }
        System.out.println();
        int j = 0;
        while (j < m.length) {
            System.out.printf("%5d", m[j++]);
        }
        System.out.println();
        int k = 0;
        do {
            System.out.printf("%5d", m[k++]);
        } while (k < m.length);
    }

    public void arrayEx3() {
        /*
         * int a=100; int []m;//STACK m=new int[5];//HEAP m[0]=10; m[1]=20;
         * System.out.println(m[0]+" "+m[1]);
         */

        /*
         * (new int[5])[0]=10; (new int[5])[1]=20; System.out.println((new int[5])[0]);
         */
        int[] m = new int[5];//[10][20][][][]
        m[0] = 10;
        m[1] = 20;
    }

    public int[] arrayEx4() {
        /*
         * double []dm=new double[5];//[][][][][] dm[0]='a'; System.out.println(dm[0]);
         */
        int[] a = new int[10];
        a[0] = 10;
        a[1] = 20;
        return a;
    }

    public static void main(String[] args) {
        MainClass a = new MainClass();
        System.out.println(a.arrayEx4()[0] + a.arrayEx4()[1]);
    }
}
