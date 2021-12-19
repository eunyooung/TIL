package sist.com.problems;

// 문제
/*
	12) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
 */

public class Question12 {

    public static void main(String[] args) {

        for (int i = 1, count = 0; i <= 30; i += 2, count++) {
            if (count != 0 && count % 3 == 0)
                System.out.println();
            System.out.print((i + 1) + " ");
        }
    }
}
