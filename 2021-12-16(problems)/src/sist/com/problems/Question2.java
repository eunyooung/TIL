package sist.com.problems;

import java.util.Scanner;

// 문제
/*
	2) 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
 */

public class Question2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = scan.nextInt();

        String temp = n % 3 == 0 ? "입니다" : "가 아닙니다";
        System.out.println(n + "는(은) 3의 배수" + temp);
    }
}
