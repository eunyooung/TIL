package sist.com.problems;

import java.util.Scanner;

// 문제
/*
	5) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
	60점 이하면 F를 출력하라 (다중 if 사용)

 */

public class Question5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int score = 0;
        while (true) {
            System.out.print("점수 입력: ");
            score = scan.nextInt();
            if (score < 0 || score > 100)
                System.out.println("점수는 0~100점 사이여야 합니다");
            else
                break;
        }

        if (score >= 90)
            System.out.println("A학점입니다");
        else if (score >= 80)
            System.out.println("B학점입니다");
        else if (score >= 70)
            System.out.println("C학점입니다");
        else if (score >= 60)
            System.out.println("D학점입니다");
        else
            System.out.println("F학점입니다");

    }
}
