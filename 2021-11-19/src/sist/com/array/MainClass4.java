package sist.com.array;

public class MainClass4 {

    public void add(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%5d", x[i]);
        }
    }

    public double totalValue(double[] value) {
        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }
        return sum;
    }

    public double getAvg(double[] value) {
        return totalValue(value) / value.length;
    }

    public int getCount(double[] value, double avg) {
        int cnt = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] > avg)
                cnt++;
        }
        return cnt;
    }

    public void add() {
        double[] height = { 180.5, 176.9, 188.2, 152.9, 145.9 };
        double[] weight = { 80.5, 76.9, 88.2, 52.9, 45.9 };
        System.out.println("heightAvg:" + getAvg(height));
        System.out.println("weightAvg:" + getAvg(weight));

        System.out.println("heightAvgMoreCount:" + getCount(height, getAvg(height)));
        System.out.println("weightAvgMoreCount:" + getCount(weight, getAvg(weight)));
    }

    /*
     * public void add(int x,int y) { }
     * public void add(int x, int y, int z) { }
     * public void add(int x, int y, int z, int k) { }
     * public void add(int x, int y, int z, int k, int g) { }
     * public void add(int x, int y, int z, int k, int g, int a) { }
     */

    public static void main(String[] args) {
        MainClass4 a = new MainClass4();
        a.add();
        //a.add(new int[] {10,20,30,40,50,60,70,80,90,100});//[10][20][30][40]
        /*
         * a.add(10);
         * a.add(10,20);
         * a.add(10,20,30);
         * a.add(10,20,30,40);
         * a.add(10,20,30,40,50);
         * a.add(10,20,30,40,50,60);
         */
    }
}