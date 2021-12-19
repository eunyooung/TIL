package sist.com.problems;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// 문제
/*
    사용자로부터 아이디를 받아서 중복체크하는 메소드 원형을 작성하시오
    우편번호를 검색하는 메소드 원형을 작성하시오
    2단에서 9단까지 구구단을 출력하는 메소드 원형을 작성하시오
 */

public class Question1 {

    Scanner scan = new Scanner(System.in);

    /*   사용자로부터 아이디를 받아서 중복체크하는 메소드 원형을 작성하시오   */
    ArrayList<String> accs = new ArrayList<>();

    // 중복체크
    public boolean isDup(String id) {

        if (accs.contains(id)) {
            return true;
        }
        return false;
    }

    public void insertID() {

        while (true) {
            // 1. 아이디 받기
            System.out.print("아이디 입력:");
            String id = scan.next();

            // 2. 중복체크
            if (isDup(id))
                System.err.println("중복된 아이디 입니다");
            else
                accs.add(id);

            // 입력된 아이디들 전부 출력
            for (String i : accs)
                System.out.print(i + " ");
            System.out.println();

            // 아이디를 더 추가할지 말지 확인
            while (true) {
                System.out.println("더 추가하시겠습니까? 1.네 2.아니오:");
                try {
                    int n = scan.nextInt();

                    switch (n) {
                    case 1:
                        break;
                    case 2:
                        return;
                    default:
                        System.err.println("1과 2중에서 골라주세요");
                        continue;
                    }
                    break;
                } catch (InputMismatchException ime) {
                    scan = new Scanner(System.in);
                    System.err.println("숫자를 입력해 주세요");
                }
            }
        }
    }

    /*    우편번호를 검색하는 메소드 원형을 작성하시오   */
    public void searchPostcode() {

        System.out.println("주소를 아래의 형식처럼 입력하여주세요 (도로명 주소)");
        System.out.println("예) 경기도 구리시 건원대로34번길 77");
        System.out.print("주소 입력:");
        String address = scan.nextLine();
        String[] addr = address.split(" ");

        // 일단은 경기도만
        if (addr[0].contains("경기도")) {
            // 출저: https://www.epost.go.kr/search/zipcode/areacdAddressDown.jsp
            try (FileReader fr = new FileReader("c:\\javaDev\\postcode\\경기도.txt")) {
                StringBuffer sb = new StringBuffer();
                int i = 0;
                // 'A' => 65 , 'a' => 97
                while ((i = fr.read()) != -1) { // -1 (EOF => end of file)
                    sb.append(String.valueOf((char) i));
                }
                String addr2 = sb.toString();
                String[] m = addr2.split("\n");

                for (int j = 1; j < m.length; j++) {
                    String[] rm = m[j].split("\\|");

                    if (addr.length > 2 && (addr[2].contains("읍") || addr[2].contains("면"))) {
                        if (addr.length == 3) {
                            if (rm[1].equals(addr[0]) && rm[3].equals(addr[1]) && rm[5].equals(addr[2])) {
                                System.out.println("우편번호:" + rm[0] + ", 주소:" + rm[1] + " " + rm[3] + " " + rm[5] + " "
                                        + rm[8] + " " + rm[11] + " " + rm[15]);
                            }

                        } else if (addr.length == 4) {
                            if (rm[1].equals(addr[0]) && rm[3].equals(addr[1]) && rm[5].equals(addr[2])
                                    && rm[11].equals(addr[3])) {
                                System.out.println("우편번호:" + rm[0] + ", 주소:" + rm[1] + " " + rm[3] + " " + rm[5] + " "
                                        + rm[8] + " " + rm[11] + " " + rm[15]);
                            }
                        } else if (addr.length == 5) {
                            if (rm[1].equals(addr[0]) && rm[3].equals(addr[1]) && rm[8].equals(addr[2])
                                    && rm[11].equals(addr[3]) && rm[15].contains(addr[4])) {
                                System.out.println("우편번호:" + rm[0] + ", 주소:" + rm[1] + " " + rm[3] + " " + rm[5] + " "
                                        + rm[8] + " " + rm[11] + " " + rm[15]);
                            }
                        }
                    } else {
                        if (addr.length == 2) {
                            if (rm[1].equals(addr[0]) && rm[3].equals(addr[1])) {
                                System.out.println("우편번호:" + rm[0] + ", 주소:" + rm[1] + " " + rm[3] + " " + rm[8] + " "
                                        + rm[11] + " " + rm[15]);
                            }
                        } else if (addr.length == 3) {
                            if (rm[1].equals(addr[0]) && rm[3].equals(addr[1]) && rm[8].equals(addr[2])) {
                                System.out.println("우편번호:" + rm[0] + ", 주소:" + rm[1] + " " + rm[3] + " " + rm[8] + " "
                                        + rm[11] + " " + rm[15]);
                            }
                        } else if (addr.length == 4) {
                            if (rm[1].equals(addr[0]) && rm[3].equals(addr[1]) && rm[8].equals(addr[2])
                                    && rm[11].equals(addr[3])) {
                                System.out.println("우편번호:" + rm[0] + ", 주소:" + rm[1] + " " + rm[3] + " " + rm[8] + " "
                                        + rm[11] + " " + rm[15]);
                            }
                        } else if (addr.length == 5) {
                            if (rm[1].equals(addr[0]) && rm[3].equals(addr[1]) && rm[8].equals(addr[2])
                                    && rm[11].equals(addr[3]) && rm[15].contains(addr[4])) {
                                System.out.println("우편번호:" + rm[0] + ", 주소:" + rm[1] + " " + rm[3] + " " + rm[8] + " "
                                        + rm[11] + " " + rm[15]);
                            }
                        }
                    }
                } //for
            } //try
            catch (FileNotFoundException e) {
            } catch (IOException e) {
            }
        }
    }

    /*   2단에서 9단까지 구구단을 출력하는 메소드 원형을 작성하시오   */
    public void gugudan() {
        System.out.println("구구단 2~9단");
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 9; j++)
                System.out.printf("%d x %2d = %2d    ", j, i, i * j);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Question1 q = new Question1();

        // ***사용할 메소드의 주석을 풀어주세요***

        // 1. 사용자 아이디를 받아서 중복 체크하고 없으면 list에 추가
        //q.insertID();

        // 2. 우편번호 찾기 (첨부된 경기도.txt 사용)
        //q.searchPostcode();

        // 3. 구구단표
        q.gugudan();
    }
}
