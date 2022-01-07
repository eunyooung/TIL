package sist.com.obj;

import java.util.Calendar;

public class MainClass7 {
    
    // 이름, 나이, 오늘생일, 성별, 지역, 띠, 전화번호
    String[] data = { "주석영#211203-1010547#031)457-1280", "장태훈#201202-1012947#02)457-1980",
            "최은영#950210-2010547#02)957-1280", "김인수#940510-1010547#061)657-9280" };

    Man[] people = new Man[data.length];//[][][][]

    public void stringProcess() {

        for (int i = 0; i < data.length; i++) {

            String[] res = data[i].split("#");
            people[i] = new Man();
            for (int j = 0; j < res.length; j++) {

                switch (j) {
                case 0:
                    people[i].setName(res[j]);
                    break;
                case 1:
                    int year = Integer.parseInt(res[j].substring(0, 2)) + 2000;
                    if (year > Calendar.getInstance().get(Calendar.YEAR))
                        year -= 100;
                    int month = Integer.parseInt(res[j].substring(2, 4));
                    int day = Integer.parseInt(res[j].substring(4, 6));

                    // 나이
                    int age = Calendar.getInstance().get(Calendar.YEAR) - year + 1;
                    people[i].setAge(age);

                    // 생일확인
                    if (month == Calendar.getInstance().get(Calendar.MONTH) + 1
                            && day == Calendar.getInstance().get(Calendar.DATE))
                        people[i].setBirth(true);

                    // 성별
                    if (res[j].charAt(7) == '1')
                        people[i].setGender("Male");
                    if (res[j].charAt(7) == '2')
                        people[i].setGender("Female");

                    // 띠
                    people[i].setDdi(calAnimal(year % 12));
                    break;

                case 2:
                    // 지역
                    if (res[j].startsWith("02"))
                        people[i].setLocation("서울");
                    else if (res[j].startsWith("031"))
                        people[i].setLocation("경기도");
                    else if (res[j].startsWith("033"))
                        people[i].setLocation("강원도");
                    else if (res[j].startsWith("043"))
                        people[i].setLocation("충청북도");
                    else if (res[j].startsWith("041"))
                        people[i].setLocation("충청남도");
                    else if (res[j].startsWith("054"))
                        people[i].setLocation("경상북도");
                    else if (res[j].startsWith("055"))
                        people[i].setLocation("경상남도");
                    else if (res[j].startsWith("063"))
                        people[i].setLocation("전라북도");
                    else if (res[j].startsWith("061"))
                        people[i].setLocation("전라남도");
                    else if (res[j].startsWith("064"))
                        people[i].setLocation("제주도");
                    people[i].setTel(res[j]);
                    break;
                } // switch

            } // for
        } // for
        disp();
    }

    public String calAnimal(int year) {

        String[] animal = { "원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양" };
        return animal[year];
    }

    public void disp() {
        for (Man m : people) {
            System.out.println(m.toString());
        }
    }

    public static void main(String[] args) {
        MainClass7 o = new MainClass7();
        o.stringProcess();
    }
}