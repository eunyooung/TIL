package sist.com.problems;

import java.util.Scanner;

// 문제
/*
	1) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
 */

public class Question1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int n = scan.nextInt();

        // 0일 경우는 0
        System.out.println(n + "는(은) " + (n == 0 ? "0" : n > 0 ? "양수" : "음수") + "입니다");
    }
}
