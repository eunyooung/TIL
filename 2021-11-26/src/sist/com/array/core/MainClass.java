package sist.com.array.core;

public class MainClass {
    
    final int ROW = 4;
    final int COL = 3;
    int[][] aa = new int[ROW][COL]; // 4행3열
    int[][] bb = new int[COL][ROW]; // 3행4열

    public void init(int[][] data) {
        int cnt = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = ++cnt;
            }

        }
    }

    public void disp(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%5d", data[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    // 1  2  3
    // 4  5  6
    // 7  8  9
    // 10 11 12 

    // 0 0 0 0
    // 0 0 0 0
    // 0 0 0 0

    public void change(int[][] aa, int[][] bb) {
        int h = 0, y = 0;
        for (int i = 0; i < bb.length; i++) {
            for (int j = 0; j < bb[i].length; j++) {
                /*
                bb[0][0] = aa[0][0];
                bb[0][1] = aa[0][1];
                bb[0][2] = aa[0][2];
                bb[0][3] = aa[0][3];
                */
                bb[i][j] = aa[h][y];
                if (y < aa[i].length - 1) {
                    y++;
                } else {
                    y = 0;
                    h++;
                }
            }
        }
    }

    public static void main(String[] args) {
        MainClass a = new MainClass(); // ROW|COL|aa|bb
        a.init(a.aa);
        a.change(a.aa, a.bb);
        a.disp(a.aa);
        a.disp(a.bb);
    }
}