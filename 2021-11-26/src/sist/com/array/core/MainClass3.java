package sist.com.array.core;

import java.util.Arrays;

public class MainClass3 {
    
    int[][] m = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

    public void increment() {
        //int[][] imsi = new int[m.length + 2][m[0].length]; // 2행3열--->4행3열
        //System.arraycopy(m, 0, imsi, 0, m.length);
        //m = imsi;
    }

    public void incre1() {
        int[][] imsi = new int[m.length + 2][m[0].length];
        //System.arraycopy(m, 0, imsi, 0, m.length);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                imsi[i][j] = m[i][j];
            }
        }

        m = imsi;
        for (int[] i : m) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void main(String[] args) {
        MainClass3 d = new MainClass3();
        d.incre1();
    }
}