package sist.com.problems;

import java.util.Scanner;

// 문제
/*
	11) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
 */

public class Question11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = scan.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("1~" + n + "까지의 합: " + sum);
    }
}
