package sist.com.problems;

// 문제
/*
    9.	1~1000까지에서 7의 배수의 합 ,9의 배수의 합
 */

public class Question9 {

    public static void main(String[] args) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 7 == 0)
                sum1 += i;
            if (i % 9 == 0)
                sum2 += i;
        }

        System.out.println("7의 배수: " + sum1);
        System.out.println("9의 배수: " + sum2);
        System.out.println("7의 배수 + 9의 배수 = " + (sum1 + sum2));
    }

}

// 강사님 풀이
// 같음