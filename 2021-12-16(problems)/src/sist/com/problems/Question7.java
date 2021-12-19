package sist.com.problems;

import java.util.InputMismatchException;
import java.util.Scanner;

// 문제
/*
	7) 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 
 */

public class Question7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("정수 입력:");
            int num = scan.nextInt();

            System.out.print("+,-,*,/ 입력:");
            String oper = scan.next();

            System.out.print("정수 입력:");
            int num1 = scan.nextInt();

            switch (oper) {
            case "+":
                System.out.println(num + " + " + num1 + " = " + (num + num1));
                break;
            case "-":
                System.out.println(num + " - " + num1 + " = " + (num - num1));
                break;
            case "*":
                System.out.println(num + " * " + num1 + " = " + (num * num1));
                break;
            case "/":
                System.out.println(num + " / " + num1 + " = " + (num / num1));
            default:
                System.out.println("올바르지 않은 연산자 입니다");
            }
        } catch (ArithmeticException e) {
            System.err.println("0으로 나눌 수 없습니다.");
        } catch (InputMismatchException ime) {
            System.err.println("올바른 입력값이 아닙니다");
        }
    }
}