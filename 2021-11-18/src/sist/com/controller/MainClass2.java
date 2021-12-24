package sist.com.controller;

// looping, for, while

public class MainClass2 {

    public void loopingEx1(int count) {
        for (int i = 1; i <= count; i++) {
            if (i % 6 == 0)
                System.out.println();
            if (!(i % 2 == 0))
                continue;
            //System.out.print(i+"\t");
            System.out.printf("%-5d", i);
        }
    }

    public void loopingEx2(int count) {
        int i = 0;
        while (i < count) {
            i++;
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }

    public void loopingEx3() {
        /*
         * System.out.print(2+"  *"+1+"="+(2  *1)+"\t");
         * System.out.print(3+"  *"+1+"="+(3  *1)+"\t");
         * System.out.print(4+"  *"+1+"="+(4  *1)+"\t");
         * System.out.print(5+"  *"+1+"="+(5  *1)+"\t");
         * System.out.print(6+"  *"+1+"="+(6  *1)+"\t");
         * System.out.print(7+"  *"+1+"="+(7  *1)+"\t");
         * System.out.print(8+"  *"+1+"="+(8  *1)+"\t");
         * System.out.print(9+"  *"+1+"="+(9  *1)+"\t");
         * 
         * System.out.println(); System.out.print(2+"  *"+2+"="+(2  *2)+"\t");
         * System.out.print(3+"  *"+2+"="+(3  *2)+"\t");
         * System.out.print(4+"  *"+2+"="+(4  *2)+"\t");
         * System.out.print(5+"  *"+2+"="+(5  *2)+"\t");
         * System.out.print(6+"  *"+2+"="+(6  *2)+"\t");
         * System.out.print(7+"  *"+2+"="+(7  *2)+"\t");
         * System.out.print(8+"  *"+2+"="+(8  *2)+"\t");
         * System.out.print(9+"  *"+2+"="+(9  *2)+"\t");
         * 
         * System.out.println(); System.out.print(2+"  *"+3+"="+(2  *3)+"\t");
         * System.out.print(3+"  *"+3+"="+(3  *3)+"\t");
         * System.out.print(4+"  *"+3+"="+(4  *3)+"\t");
         * System.out.print(5+"  *"+3+"="+(5  *3)+"\t");
         * System.out.print(6+"  *"+3+"="+(6  *3)+"\t");
         * System.out.print(7+"  *"+3+"="+(7  *3)+"\t");
         * System.out.print(8+"  *"+3+"="+(8  *3)+"\t");
         * System.out.print(9+"  *"+3+"="+(9  *3)+"\t"); System.out.println();
         * System.out.print(2+"  *"+3+"="+(2  *3)+"\t");
         * System.out.print(3+"  *"+3+"="+(3  *3)+"\t");
         * System.out.print(4+"  *"+3+"="+(4  *3)+"\t");
         * System.out.print(5+"  *"+3+"="+(5  *3)+"\t");
         * System.out.print(6+"  *"+3+"="+(6  *3)+"\t");
         * System.out.print(7+"  *"+3+"="+(7  *3)+"\t");
         * System.out.print(8+"  *"+3+"="+(8  *3)+"\t");
         * System.out.print(9+"  *"+3+"="+(9  *3)+"\t"); System.out.println();
         * System.out.print(2+"  *"+3+"="+(2  *3)+"\t");
         * System.out.print(3+"  *"+3+"="+(3  *3)+"\t");
         * System.out.print(4+"  *"+3+"="+(4  *3)+"\t");
         * System.out.print(5+"  *"+3+"="+(5  *3)+"\t");
         * System.out.print(6+"  *"+3+"="+(6  *3)+"\t");
         * System.out.print(7+"  *"+3+"="+(7  *3)+"\t");
         * System.out.print(8+"  *"+3+"="+(8  *3)+"\t");
         * System.out.print(9+"  *"+3+"="+(9  *3)+"\t"); System.out.println();
         * System.out.print(2+"  *"+3+"="+(2  *3)+"\t");
         * System.out.print(3+"  *"+3+"="+(3  *3)+"\t");
         * System.out.print(4+"  *"+3+"="+(4  *3)+"\t");
         * System.out.print(5+"  *"+3+"="+(5  *3)+"\t");
         * System.out.print(6+"  *"+3+"="+(6  *3)+"\t");
         * System.out.print(7+"  *"+3+"="+(7  *3)+"\t");
         * System.out.print(8+"  *"+3+"="+(8  *3)+"\t");
         * System.out.print(9+"  *"+3+"="+(9  *3)+"\t"); System.out.println();
         * System.out.print(2+"  *"+3+"="+(2  *3)+"\t");
         * System.out.print(3+"  *"+3+"="+(3  *3)+"\t");
         * System.out.print(4+"  *"+3+"="+(4  *3)+"\t");
         * System.out.print(5+"  *"+3+"="+(5  *3)+"\t");
         * System.out.print(6+"  *"+3+"="+(6  *3)+"\t");
         * System.out.print(7+"  *"+3+"="+(7  *3)+"\t");
         * System.out.print(8+"  *"+3+"="+(8  *3)+"\t");
         * System.out.print(9+"  *"+3+"="+(9  *3)+"\t"); System.out.println();
         * System.out.print(2+"  *"+3+"="+(2  *3)+"\t");
         * System.out.print(3+"  *"+3+"="+(3  *3)+"\t");
         * System.out.print(4+"  *"+3+"="+(4  *3)+"\t");
         * System.out.print(5+"  *"+3+"="+(5  *3)+"\t");
         * System.out.print(6+"  *"+3+"="+(6  *3)+"\t");
         * System.out.print(7+"  *"+3+"="+(7  *3)+"\t");
         * System.out.print(8+"  *"+3+"="+(8  *3)+"\t");
         * System.out.print(9+"  *"+3+"="+(9  *3)+"\t"); System.out.println();
         * System.out.print(2+"  *"+3+"="+(2  *3)+"\t");
         * System.out.print(3+"  *"+3+"="+(3  *3)+"\t");
         * System.out.print(4+"  *"+3+"="+(4  *3)+"\t");
         * System.out.print(5+"  *"+3+"="+(5  *3)+"\t");
         * System.out.print(6+"  *"+3+"="+(6  *3)+"\t");
         * System.out.print(7+"  *"+3+"="+(7  *3)+"\t");
         * System.out.print(8+"  *"+3+"="+(8  *3)+"\t");
         * System.out.print(9+"  *"+3+"="+(9  *3)+"\t");
         */
        /*
         * for(int i = 1; i <= 9; i++) { 
         *      for(int j = 2; j <= 9; j++) {
         *          //System.out.println("i=" + i + " j=" + j); 
         *          try { 
         *              Thread.sleep(100);
         *              System.out.print(j + "  *" + i + "=" + (i * j) + "\t");
         *          } catch(Exception e) {
         *          }
         *      }
         *      System.out.println();
         * }
         */
        int k = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                k++;
            }
            System.out.println();
        }
    }

    public void loopingEx4() {
        int i = 1;
        int j = 1;
        while (i <= 9) {
            while (j <= 9) {
                System.out.printf("%d * %d = %d\t", i, j, i * j);
                j++;
            }
            System.out.println();
            j = 1;
            i++;
        }
    }

    public void loopingEx5() {
        int i = 1;
        int j = 1;

        do {
            do {
                System.out.printf("%d * %d = %d\t", i, j, i * j);
                j++;
            } while (j <= 9);
            System.out.println();
            i++;
        } while (i <= 5);
    }

    public static void main(String[] args) {
        MainClass2 c = new MainClass2();
        c.loopingEx3();
    }
}