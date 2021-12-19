package sist.com.problems;

import java.util.Scanner;

// 문제
/*
	6) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
   60점 이하면 F를 출력하라 (switch~case 사용)
 */

public class Question6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int score = 0;

        do {
            System.out.print("점수 입력: ");
            score = scan.nextInt();
        } while (score < 0 || score > 100);

        switch (score / 10) {
        case 10:
        case 9:
            System.out.println("A학점입니다");
            break;
        case 8:
            System.out.println("B학점입니다");
            break;
        case 7:
            System.out.println("C학점입니다");
            break;
        case 6:
            System.out.println("D학점입니다");
            break;
        default:
            System.out.println("F학점입니다");
        }
    }
}
