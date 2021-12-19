package sist.com.problems;

import java.util.Scanner;

// 문제
/*
    11.	정수 입력을 받아서 60이상 합격 =>불합격  if~else
 */

public class Question11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("점수입력: ");
        int score = scan.nextInt();
        if (score >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }
}

// 강사님 풀이
// 같음