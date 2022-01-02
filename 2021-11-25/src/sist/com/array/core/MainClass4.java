package sist.com.array.core;

public class MainClass4 {
    
    public void sum(int[][] m) {
        final int ROW = m.length;
        final int COL = m[0].length;
        for (int i = 0; i < ROW - 1; i++) {
            for (int j = 0; j < COL - 1; j++) {
                m[i][COL - 1] += m[i][j];
                //m[ROW - 1][i] += m[j][i];
                m[ROW - 1][j] += m[i][j];
            }
            m[ROW - 1][COL - 1] += m[i][i];
        }
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MainClass4 a = new MainClass4();
        int[][] m = { { 1, 2 }, { 3, 4 } };
        a.sum(m);
    }
}