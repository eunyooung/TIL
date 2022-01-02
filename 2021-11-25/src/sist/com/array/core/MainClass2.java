package sist.com.array.core;

import java.util.Arrays;
import java.util.Random;

public class MainClass2 {

    public void arrayEx1() {
        int[][] m = new int[2][3]; // [][][]
                                   // [][][]      
        Random rm = new Random();
        for (int i = 0; i < m.length; i++) { // 행
            for (int j = 0; j < m[i].length; j++) { // 열 
                m[i][j] = rm.nextInt(10);
            }
        }
        disp3(m);
    }

    public void disp1(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%5d", m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void disp2(int[][] m) {
        for (int[] i : m) {
            for (int j : i) {
                System.out.printf("%5d", j);
            }
            System.out.println();
        }
    }

    public void disp3(int[][] m) {
        for (int[] i : m) {
            System.out.println(Arrays.toString(i));
        }
    }

    public void arrayEx2() {
        /*
        int []a = { 10, 20, 30, 40 }; // [][][][]
        for(int i : a) {
            System.out.println(i);
        }
         */
        int[][] b = { { 10, 20, 30, 70, 90 }, { 110, 40, 50, 60 }, { 50 } };
        disp1(b);
    }

    public static void main(String[] args) {
        MainClass2 a = new MainClass2();
        a.arrayEx2();
    }
}