package sist.com.array;

// 배열(선형) 같은 기억 장소의 모임(일괄처리)
// 선언,초기화,출력  

import java.util.Arrays;

public class MainClass {

    public void inject(int state, int[] m) {
        for (int i = 0; i < m.length; i++) {
            /*
             * if(state == 1) {
             *     m[i] = (int)(Math.random() * 100);
             * }
             * else {
             *     m[i] = (i + 1) * 10;
             * }
             */
            m[i] = state == 1 ? (int) (Math.random() * 100) : (i + 1) * 10;
        }
        disp(m);
    }

    public void disp(int[] m) {
        //System.out.println(Arrays.toString(m));
        /*
         * for(int i = 0; i < m.length; i++) {
         *     System.out.printf("%3d", m[i]);
         * }
         * System.out.println();
         */
        for (int i : m) {
            System.out.printf("%3d", i);
        }
        System.out.println();
    }

    public void arrayPro1(int[] m, int state) {
        inject(state, m);
    }

    public static void main(String[] args) {

        MainClass a = new MainClass();
        int[] m1 = new int[5];//[][][][][]난수 
        int[] m2 = new int[5];//[][][][][] 10 ,20 30 40 50
        a.arrayPro1(m1, 1);
        a.arrayPro1(m2, 2);
    }
}