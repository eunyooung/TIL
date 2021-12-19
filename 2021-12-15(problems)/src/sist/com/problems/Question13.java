package sist.com.problems;

// 문제
/*
    13.	정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 
    배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
    예) 랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 
    평균은 5.4
    [Hint] 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라.
    int i  = (int)(Math.random()*10)+1;
 */

public class Question13 {

    public static void main(String[] args) {

        int[] m = new int[10];
        int sum = 0;

        // 1~10 랜덤 정수 생성 후 배열 저장
        for (int j = 0; j < m.length; j++) {
            int i = (int) (Math.random() * 10) + 1;
            m[j] = i;
            sum += i;
        }

        //출력
        System.out.print("랜덤한 정수들: ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        double avg = (double) sum / m.length;
        System.out.println("평균: " + avg);
    }
}

// 강사님 풀이
// 같음