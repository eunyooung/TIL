package sist.com.array.core;

import java.util.Arrays;

public class MainClass4 {
    
    int[][] m = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

    public int[] search(int data) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == data)
                    return new int[] { i, j };
            } // for         
        } // for
        return null;
    }

    public int[] search(int data, int row, int col) {
        for (int i = row; i < m.length; i++) {
            for (int j = col > (m[i].length - 1) ? 0 : col; j < m[i].length; j++) {
                System.out.println("i=" + i + " col=" + j + " =" + m[i][j]);
                if (m[i][j] == data)
                    return new int[] { i, j };
            } // for         
        } // for
        return null;
    }

    public static void main(String[] args) {
        MainClass4 d = new MainClass4();
        System.out.println(Arrays.toString(d.search(60, 1, 2)));
    }
}