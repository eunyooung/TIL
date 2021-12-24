package sist.com.array;

public class MainClass2 {

    public int abs(int data) {
        return data < 0 ? -data : data;
    }

    public int nearData(int[] data, int target) {
        int near = 0, gab = 0, mingab = data[0] - target;
        for (int i = 0; i < data.length; i++) {
            gab = data[i] - target;
            if (abs(gab) <= abs(mingab)) {
                mingab = gab;
                near = data[i];
            }
        }
        return near;
    }

    public static void main(String[] args) {
        MainClass2 m = new MainClass2();
        System.out.println(m.abs(-5));
    }
}
