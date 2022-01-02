package sist.com.array.core;

// 1차원 석차,중복검사

public class MainClass {
    
    int[] m = new int[6]; // instance 변수
    int[] rank = new int[m.length];

    public void initArray() {
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 100);
        }
    }

    public void rank() {

        for (int i = 0; i < m.length; i++) {
            rank[i] = 1;
            for (int j = 0; j < m.length; j++) {
                if (m[i] < m[j]) {
                    rank[i]++;
                }
            }
        }
        disp(m);
        disp(rank);
    }

    public void disp(int[] m) {
        for (int i : m) {
            System.out.printf("%5d", i);
        }
        System.out.println();
    }

    public int randomProcess() {
        return (int) (Math.random() * 100 % 6) + 1;
    }

    public void lottoProcess() {
        for (int i = 0; i < m.length; i++) {
            m[i] = randomProcess();
            for (int j = 0; j < i; j++) {
                if (m[i] == m[j])
                    i--;
            }
        }
        disp(m);
    }

    public static void main(String[] args) {
        MainClass a = new MainClass();
        a.lottoProcess();
        //a.initArray();      
        //a.rank();
    }
}