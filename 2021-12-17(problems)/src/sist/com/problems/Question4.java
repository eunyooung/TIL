package sist.com.problems;

import java.util.Scanner;

// 문제
/*
    년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
    -> 년도 입력 메소드
    -> 윤년 처리 
    -> 출력 
 */

public class Question4 {

    // 년도 입력 메소드
    public int input() {
        Scanner scan = new Scanner(System.in);
        int year = 0;
        try {
            System.out.print("년도 입력: ");
            year = scan.nextInt();
        } catch (Exception e) {
            System.err.println("문자열이 아닌 숫자를 입력하여주세요");
        }
        return year;
    }

    // 윤년 처리
    public boolean isYunDal(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            return true;
        else
            return false;
    }

    // 출력
    public void print(int year) {
        if (isYunDal(year))
            System.out.println(year + "년도는 윤년입니다.");
        else
            System.out.println(year + "년도는 윤년이 아닙니다.");
    }

    public static void main(String[] args) {

        Question4 q = new Question4();
        q.print(q.input());
    }
}
