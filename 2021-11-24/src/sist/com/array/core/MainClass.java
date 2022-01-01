package sist.com.array.core;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

    /*
    * public int[] add(int ...x) {
    *     for (int i = 0; i < x.length; i++) {
    *         x[i] += 50;
    *     }
    *     return x;
    * }
    */

    public int[] add(int[] x) {
        int i = 0;
        while (i < x.length) {
            x[i++] += 100;
        }
        return x;
    }

    /*
     * public void add(int ...x) {
     * 
     * }
     */
    public double[] doubleAdd() {
        Scanner scanner = new Scanner(System.in);
        double[] value = new double[5];
        for (int i = 0; i < value.length; i++) {
            System.out.println("Data:");
            value[i] = scanner.nextDouble();
        }
        Arrays.sort(value);
        return value;
    }

    public String[] add(String... str) {
        return new String[] { str[0], str[2] };
    }

    public static void main(String[] args) {
        MainClass a = new MainClass();
        for (double d : a.doubleAdd()) {
            System.out.println(d);
        }
        String s1 = a.add("Java", "Xml", "React", "10.5")[0];
        String s2 = a.add("Java", "Xml", "React", "10.5")[1];
        System.out.println(s1 + " " + s2);

        /*
         * a.add(new int [] {50, 60});
         * a.add(new int [] {10,20,30,40,50});
         */
        /*
         * for( int i : a.add(10,20,30,40,50)) {
         *     System.out.println(i);
         * }
         */
    }
}