package sist.com.array;

public class MainClass3 {
    public void arrayPos1(int x, int y, int z, int k, int o) {

    }

    public void arrayPos2(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] += 50;
        }
    }

    public static void main(String[] args) {
        MainClass3 a = new MainClass3();
        int[] m = { 1, 2, 3, 4, 5 };//[1][2][3][4][5]
        a.arrayPos2(m);
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
        //a.arrayPos1(10,20,30,40,50);
    }
}