package sist.com.problems;

import java.util.Scanner;

// 문제
/*
    정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
    -> 정수 입력 
    -> 이진법 처리
    -> 출력 
 */

public class Question2 {

    // 정수 입력
    public int input() {

        Scanner scan = new Scanner(System.in);

        int n = 0;
        try {
            do {
                System.out.println("0~32767까지의 정수 입력:");
                n = scan.nextInt();
            } while (n < 0 || n > 32767); // 범위 안의 숫자가 아니면 다시 입력

        } catch (Exception e) {
            System.out.println("문자열이 아닌 숫자를 입력해주세요");
        }
        return n;
    }

    // 이전법 처리
    public String binary(int num) {

        return String.format("%16s", Integer.toBinaryString(num)).replace(" ", "0");
    }

    // 출력
    public void dispBinary(String ss) {
        for (int i = 0; i < ss.length(); i++) {
            if (i != 0 && i % 4 == 0)
                System.out.print(" ");
            System.out.print(ss.charAt(i));
        }
    }

    public static void main(String[] args) {

        Question2 q = new Question2();
        q.dispBinary(q.binary(q.input()));
    }
}
