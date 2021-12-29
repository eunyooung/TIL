package sist.com.problems;

import java.util.Scanner;

// 문제
/*
    1.	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
    십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.

    결과)
    2자리수 정수 입력(10~99) >> 77 
    10의 자리와 1의 자리가 같습니다.
*/

public class Question1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99): ");
        int num = scan.nextInt();
        System.out.println("입력된 번호: " + num);
        if (num < 10 || num > 99) {
            System.out.println("2자리 수의 번호를 입력하세요.");
            return;
        }
        String a = String.valueOf(num);

        if (a.charAt(0) == a.charAt(1)) {
            System.out.println("10의자리와 1의자리가 같습니다.");
        } else {
            System.out.println("10의자리와 1의자리가 같지 않습니다.");
        }
    }
}

// 강사님 풀이
/*
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 입력값을 받는다 
        Scanner scan = new Scanner(System.in);
        int num = 0; // 지역변수는 반드시 사용전에 초기화 
        while(true) {
            System.out.print("2자리수 정수 입력(10~99) >> ");
            num = scan.nextInt();
            if (num < 10 || num > 99) {
            System.out.println("10~99까지만 입력하세요");
                continue;
            }
            break; // 10~99까지만 입력이 가능하게 만든다 
        }
        
        // 입력을 받으면 처리 
        if(num % 11 == 0) {
            System.out.println("10의 자리와 1의 자리가 같습니다.");
        }
        else {
            System.out.println("10의 자리와 1의 자리가 같지 않습니다."); 
        }
    }
*/