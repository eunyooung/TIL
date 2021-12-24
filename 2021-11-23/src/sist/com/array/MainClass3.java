package sist.com.array;

import java.util.Arrays;

public class MainClass3 {

    public void arrayCopyEx1() {
        int[] a = { 10, 20, 30, 40, 50 };//[10][20][30][40][50]
        int[] b = new int[a.length * 2];//[][][][][]
        System.arraycopy(a, 0, b, 2, a.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public void arrayCopyEx2(int[] x) {//[10][20][30][40][50]
        int[] imsi = new int[x.length];// [50][40][30][20][10]

        /*
        * imsi[0] = x[x.length - 1];
        * imsi[1] = x[x.length - 2];
        * imsi[2] = x[x.length - 3];
        * imsi[3] = x[x.length - 4];
        * imsi[4] = x[x.length - 5];
        */

        for (int i = 0; i < x.length; i++) {
            imsi[i] = x[x.length - (i + 1)];
        }
        //x=imsi;
        //System.out.println(Arrays.toString(imsi));
        System.arraycopy(imsi, 0, x, 0, imsi.length);
    }

    public static void main(String[] args) {

        MainClass3 a = new MainClass3();
        int[] m = { 10, 20, 30, 40, 50 };//[10][20][30][40][50]
        a.arrayCopyEx2(m);
        System.out.println(Arrays.toString(m));
    }
}