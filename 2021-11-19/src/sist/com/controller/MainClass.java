package sist.com.controller;

//나이 ,띠, 요일

import java.util.Calendar;

public class MainClass {

    public int getAge(int year) {
        System.out.println();
        return Calendar.getInstance().get(Calendar.YEAR) - year + 1;
    }

    public String getDdi(int year) {
        switch (year % 12) {
        case 0:
            return "원숭이";
        case 1:
            return "닭";
        case 2:
            return "개";
        case 3:
            return "돼지";
        case 4:
            return "쥐";
        case 5:
            return "소";
        case 6:
            return "호랑이";
        case 7:
            return "토끼";
        case 8:
            return "용";
        case 9:
            return "뱀";
        case 10:
            return "말";
        default:
            return "양";
        }
    }

    public boolean isYunDal(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public int getCount(int year, int month, int day) {
        int cnt = 0;
        cnt = (year - 1) * 365;
        for (int i = 1; i < year; i++) {
            if (isYunDal(i))
                cnt++;
        }

        for (int i = 1; i < month; i++) {
            switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                cnt += 31;
                break;
            case 2:
                if (isYunDal(year))
                    cnt += 29;
                else
                    cnt += 28;
                break;
            default:
                cnt += 30;
            }
        }
        cnt += day;
        return cnt;
    }

    public String getWeek(int year, int month, int day) {
        switch (getCount(year, month, day) % 7) {
        case 0:
            return "일요일";
        case 1:
            return "월요일";
        case 2:
            return "화요일";
        case 3:
            return "수요일";
        case 4:
            return "목요일";
        case 5:
            return "금요일";
        default:
            return "토요일";
        }
    }

    public void input(int year, int month, int day) {
        int age = getAge(year);
        String ddi = getDdi(year);
        String week = getWeek(year, month, day);
        disp(year, age, ddi, week);
    }

    public void disp(int year, int age, String ddi, String week) {
        System.out.println(year + "년도에 태어난님 은 " + age + "살");
        System.out.println(year + "년도에 태어난님 은 " + ddi + "띠입니다");
        System.out.println(year + "년도에 태어난님 은 " + week + "에 태어남");
    }

    public static void main(String[] args) {
        MainClass c = new MainClass();
        c.input(2019, 1, 16);
    }
}