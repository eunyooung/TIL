package sist.com.problems;

import java.util.Scanner;

// 문제
/*
	3) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라
 */

public class Question3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int a = scan.nextInt();
        System.out.println("a=" + Math.abs(a));
    }
}
