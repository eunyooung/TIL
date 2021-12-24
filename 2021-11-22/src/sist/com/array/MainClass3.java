package sist.com.array;

// 최빈값, 석차

import java.util.Arrays;

public class MainClass3 {

    public void disp(int[] m) {
        for (int i : m) {
            System.out.printf("%3d", i);
        }
        System.out.println();
    }

    public int arrayCount(int[] m) {
        int mx = 0;
        for (int i = 0; i < m.length; i++) {
            if (mx < m[i]) {
                mx = m[i];
            }
        }
        return mx;
    }

    public void mode(int[] m) {
        int[] c = new int[m.length];
        //m[10][1][1][1][1][5][5][5][5][9]
        //c[0] [0][0][0][0][0][0][0][0][0]      
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i] == m[j]) {
                    c[i]++;
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == arrayCount(c)) {
                System.out.print(" " + m[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        MainClass3 a = new MainClass3();
        int[] m = { 10, 1, 1, 1, 1, 5, 5, 5, 5, 9 };
        a.disp(m);
        a.mode(m);
    }
}