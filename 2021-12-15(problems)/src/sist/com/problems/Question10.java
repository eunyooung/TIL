package sist.com.problems;

// 문제
/*
    10.	10~99까지 정수중에 같은 자리의 정수를 출력하시오
    결과)
 */

public class Question10 {

    public static void main(String[] args) {

        for (int i = 10; i <= 99; i++) {
            String temp = String.valueOf(i);
            if (temp.charAt(0) == temp.charAt(1)) {
                System.out.print(i + " ");
            }
        }
    }
}

// 강사님 풀이
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 10; i <= 99; i++) {
			if(i%11 == 0) {
				System.out.print(i + " ");
			}
		}
	}
*/