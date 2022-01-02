package sist.com.array.core;

// 1차원,다차원, 가변배열

public class MainClass3 {

    public void arrayEx1(char[] x, char[] y, char[] z) {
        System.out.println(x[0]);
    }

    public void arrayEx1(char[][] x) {
        //System.out.println(x[0][0]);
        for (char[] i : x) {
            System.out.println(i.length);
        }
    }

    public void arrayEx2() {
        int[] m1 = new int[5];
        int[] m2 = new int[2];
        int[] m3 = new int[7];
        int[] m4 = new int[9];
        int[][] m = new int[4][];
        m[0] = m1; // [][][][][]
        m[1] = m2; // [][]
        m[2] = m3; // [][][][][][][]
        m[3] = m4; // [][][][][][][][][]

        for (int[] i : m) {
            for (int j : i) {
                System.out.printf("%5d", j);
            }
            System.out.println();
        }
    }

    public void arrayEx3() {
        int[][] m = { new int[9], new int[2], new int[8], new int[1] };

        for (int[] i : m) {
            for (int j : i) {
                System.out.printf("%5d", j);
            }
            System.out.println();
        }
    }

    public int[][] arrayEx4(int[][] x) {
        return x;
    }

    public static void main(String[] args) {
        MainClass3 a = new MainClass3();
        a.arrayEx4(new int[][] { { 10, 20, 30, 40 }, { 50, 60, 70, 80 } });
        /*
        String s1 = "Ajax"; // [A][j][a][x]
        String s2 = "SpringData";
        String s3 = "HtmlReAct";
        a.arrayEx3();
        */
        //a.arrayEx1(s1.toCharArray(), s2.toCharArray(), s3.toCharArray());
        //a.arrayEx1(new char[][] { s1.toCharArray(), s2.toCharArray(), s3.toCharArray() });
        //a.arrayEx1(new char[] { 'v', 'a', 'l', 'u' });
    }
}