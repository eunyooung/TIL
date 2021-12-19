package sist.com.problems;

// 문제
/*
    임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성 
    -> 임의의 정수 입력 (배열 생성후)
    -> 정렬 처리
    -> 출력 
 */

public class Question3 {

    int[] m = new int[5];

    // 임의 정수 입력 (배열 생성 후)
    public void random() {
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 100 + 1);
        }
    }

    // 정렬처리 (ASC, DESC)
    public void selectionSort(String order) {

        int n = m.length;

        if (order.equals("ASC")) {
            for (int i = 0; i < n; i++) {
                int min = i;
                for (int j = i + 1; j < n; j++) {
                    if (m[j] < m[min])
                        min = j;
                }
                int temp = m[min];
                m[min] = m[i];
                m[i] = temp;
            }
        } else {
            for (int i = 0; i < n; i++) {
                int max = i;
                for (int j = i + 1; j < n; j++) {
                    if (m[j] > m[max])
                        max = j;
                }
                int temp = m[max];
                m[max] = m[i];
                m[i] = temp;
            }
        }
    }

    // 출력
    public void print() {
        for (int i : m)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Question3 q = new Question3();
        q.random();

        System.out.println("정렬 전:");
        q.print();

        q.selectionSort("ASC");

        System.out.println("오름차순 정렬:");
        q.print();

        q.selectionSort("DESC");

        System.out.println("내림차순 정렬:");
        q.print();
    }
}
