package sist.com.problems;

/*
    12.	int[] num = { 94, 85, 95, 88, 90 };

    다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
 */

public class Question12 {

    public static void main(String[] args) {

        int[] num = { 94, 85, 95, 88, 90 };

        int max = num[0];
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max)
                max = num[i];
            if (num[i] < min)
                min = num[i];
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}

// 강사님 풀이
// 같음