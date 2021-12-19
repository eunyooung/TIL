package sist.com.problems;

// 문제
/*
	13) 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
 */

public class Question13 {

    public static void main(String[] args) {

        int result = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                result += i;
            else
                result -= i;
        }
        System.out.print("1-2+3..-10까지의 합= " + result);
    }
}
