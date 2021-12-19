package sist.com.problems;

// 문제
/*
    7.	1~30 짝수합,홀수합을 출력하는 프로그램을 작성
 */

public class Question7 {

    public static void main(String[] args) {

        int even = 0;
        int odd = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println("짝수 합: " + even);
        System.out.println("홀수 합: " + odd);
    }
}

// 강사님 풀이
// 같음