package sist.com.problems;

// 문제
/*
    8.	1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성
 */

public class Question8 {

    public static void main(String[] args) {

        // 한번 while문으로 써봄
        int num = 1;
        while (num <= 100) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }

        /*
        for(int i = 1; i < 100; i++) {
            if(i % 3 == 0 && i % 5 == 0 ) {
                System.out.print(i + " ");
            }
        }
         */
    }
}

// 강사님 풀이
// 같음