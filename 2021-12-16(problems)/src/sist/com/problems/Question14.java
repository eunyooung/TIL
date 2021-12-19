package sist.com.problems;

// 문제
/*
	14) 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)
 */

public class Question14 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
