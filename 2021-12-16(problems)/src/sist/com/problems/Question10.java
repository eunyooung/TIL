package sist.com.problems;

// 문제
/*
	10) B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
 */

public class Question10 {

    public static void main(String[] args) {

        for (int i = 'B'; i <= 'N'; i += 2) {
            System.out.print((char) i + " ");
        }
    }
}
