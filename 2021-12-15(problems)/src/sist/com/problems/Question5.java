package sist.com.problems;

// 문제
/*
    5.	100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
 */

public class Question5 {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for (int i = 100; i <= 999; i++) {
            if (i % 7 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("7의 배수 개수: " + count);
        System.out.println("7의 배수 합: " + sum);
    }
}

// 강사님 풀이
// 같음