package sist.com.array.core;

import java.util.Arrays;

// isEmpty, isFull
// Stack, Queue

public class MainClass2 {
    
    int[][] m = new int[2][3];
    int row = 0, col = -1;

    public boolean isEmpty() {
        return row == 0 && col == -1;
    }

    public boolean isFull() {
        return row == m.length - 1 && col == m[0].length - 1;
    }

    public void increment() {
        int[][] imsi = new int[m.length + 2][m[0].length]; // 2행3열--->4행3열
        System.arraycopy(m, 0, imsi, 0, m.length);
        m = imsi;
    }

    public int[] search(int data) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == data)
                    return new int[] { i, j };
            }
        }
        return null;
    }

    public int[] search(int data, int row, int col) {
        for (int i = row; i < m.length; i++) {
            for (int j = col > (m[i].length - 1) ? 0 : col; j < m[i].length; j++) {
                if (m[i][j] == data)
                    return new int[] { i, j };
            } // for
            col = 0;
        } // for
        return null;
    }

    public void add(int data) {
        if (isFull())
            increment();
        if (col < m[0].length - 1) {
            col++;
        } else {
            col = 0;
            row++;
        }
        m[row][col] = data;
    }

    public void disp() {
        for (int[] i : m) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
    }

    public void modify(int origin, int change, int row, int col, int state) {
        int[] rs = search(origin, row, col);
        if (rs == null)
            return;
        m[rs[0]][rs[1]] = change;
        if (state == 'a')
            modify(origin, change, row, col, state);
    }

    public void delete(int data) {
        int[] rs = search(data);
        if (rs == null)
            return;
        for (int i = rs[0]; i < m.length; i++) {
            for (int j = rs[1]; j < m[i].length; j++) {
                if (i == m.length - 1 && j == m[i].length - 1) { // 행끝이면서 열끝인지
                    m[i][j] = 0;
                    break;
                }
                if (j == m[i].length - 1) { // 열끝
                    m[i][j] = m[i + 1][0];
                    rs[1] = 0;
                } else {
                    m[i][j] = m[i][j + 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        MainClass2 a = new MainClass2();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);
        a.disp();

        System.out.println(Arrays.toString(a.search(50, 0, 1)));
        System.out.println(Arrays.toString(a.search(70, 0, 1)));

        a.modify(50, 200, 1, 1, 'a');
        a.delete(50);
        a.disp();
    }
}