package sist.com.problems;

import java.util.Scanner;

// 문제
/*
	4) 년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else문으로 사용하라
 */

public class Question4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int year = scan.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + "년도는 윤년입니다.");
        else
            System.out.println(year + "년도는 윤년이 아닙니다.");
    }
}
