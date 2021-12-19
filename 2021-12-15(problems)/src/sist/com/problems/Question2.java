package sist.com.problems;

import java.util.Scanner;

// 문제
/*
    2.	숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.

    결과)
    달을 입력하세요(1~12) >> 9
    가을
 */

public class Question2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("달을 입력 하세요 (1~12): ");
        int num = scan.nextInt();

        switch (num) {
        case 3:
        case 4:
        case 5:
            System.out.println("봄");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("여름");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("가을");
            break;
        case 1:
        case 2:
        case 12:
            System.out.println("겨울");
            break;
        default:
            System.out.println("잘못된 월입니다"); // 오류처리
        }
    }
}

// 강사님 풀이
/*
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //1. 입력값 (사용자 요청)
        Scanner scan = new Scanner(System.in);
        System.out.print("1~12 정수입력:");
        int no = scan.nextInt();

        //2. 요청처리 => 오류처리 
        if(no>=9 && no<=11) { // && 범위이 있는 경우 , || 범위를 벗어난 경우
            System.out.println("가을");
        }
        else if(no>=3 && no<=5) {
            System.out.println("봄");
        }
        else if(no>=6 && no<=8) {
            System.out.println("여름");
        }
        else {
            // 12,1,2
            System.out.println("겨울");
        }
    }
*/