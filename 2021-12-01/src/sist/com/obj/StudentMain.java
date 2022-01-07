package sist.com.obj;

import java.util.Scanner;

/*
private String name;
private int age;
private String stdID;
private String schoolName;
*/

public class StudentMain {
    
    private Scanner scanner;
    private Student[] studArray;
    private int index;

    public StudentMain() {
        scanner = new Scanner(System.in);
        System.out.println("StudentCount:");
        studArray = new Student[scanner.nextInt()];
        System.out.println(studArray.length + "명 입력가능");
    }

    public boolean isFull() {
        return index == studArray.length - 1;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public void increment() {
        Student[] imsi = new Student[studArray.length * 2];
        System.arraycopy(studArray, 0, imsi, 0, studArray.length);
        studArray = imsi;
    }

    public void inputStudent() {
        if (isFull()) {
            increment();
        }
        Student s = new Student(new Score());
        System.out.println("Name:");
        s.setName(scanner.next());
        System.out.println("Age:");
        s.setAge(scanner.nextInt());
        String id = null;
        do {
            System.out.println("StdId:");
            id = scanner.next();
        } while (idCheck(id));
        s.setStdID(id);
        System.out.println("SchoolName:");
        s.setSchoolName(scanner.next());
        System.out.println("Kor:");
        s.getScore().setKor(scanner.nextInt());

        System.out.println("Eng");
        s.getScore().setEng(scanner.nextInt());

        System.out.println("Mat");
        s.getScore().setMat(scanner.nextInt());
        s.getScore().averageProcess();
        scoreRank();
        studArray[index++] = s;
    }

    public void scoreRank() {
        for (int i = 0; i < index; i++) {
            studArray[i].getScore().setRank(1);
            for (int j = 0; j < index; j++) {
                if (studArray[i].getScore().getAvg() < studArray[j].getScore().getAvg()) {
                    studArray[i].getScore().setRank(studArray[i].getScore().getRank() + 1);
                }
            }
        }
    }

    public boolean idCheck(String id) {
        for (int i = 0; i < index; i++) {
            if (studArray[i].getStdID().equals(id))
                return true;
        }
        return false;
    }

    public void studList() {
        System.out.println("1. Age Desc 2.Age Asc");
        sort(scanner.nextInt());
        System.out.printf("%7s%7s%7s%10s%10s%10s\n", "Name", "Age", "Sid", "ScName", "Avg", "Rank");
        for (int i = 0; i < index; i++) {
            System.out.printf("%7s%7d%7s%10s%10.2f%10d\n", studArray[i].getName(), studArray[i].getAge(),
                    studArray[i].getStdID(), studArray[i].getSchoolName(), studArray[i].getScore().getAvg(),
                    studArray[i].getScore().getRank());
        }
    }

    public int search(String id) {
        for (int i = 0; i < index; i++) {
            if (studArray[i].getStdID().equals(id))
                return i;
        }
        return -1;
    }

    public void studentInfo() {
        System.out.println("StudID:");
        int index = search(scanner.next());
        if (index == -1)
            return;
        System.out.println(studArray[index].toString());
    }

    public void menu() {
        while (true) {
            System.out.println("1.StudAdd 2.StudInfo 3.StudList 4.StudDelete 5.StudUpdate");
            switch (scanner.nextInt()) {
            case 1:
                inputStudent();
                break;
            case 2:
                studentInfo();
                break;
            case 3:
                studList();
                break;
            case 4:
                deleteStudent();
                break;
            default:
                break;
            }
        }
    }

    public void deleteStudent() {
        System.out.println("SearchID:");
        int ix = search(scanner.next());
        if (ix == -1)
            return;
        for (int i = ix; i < index; i++) {
            if (i == index - 1) {
                studArray[i] = null;
                break;
            }
            studArray[i] = studArray[i + 1];
        }
        index--;
    }

    public void swap(int i, int j) {
        Student imsi;
        imsi = studArray[i];
        studArray[i] = studArray[j];
        studArray[j] = imsi;
    }

    public void sort(int order) {

        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (order == 1) {
                    if (studArray[i].getAge() < studArray[j].getAge()) {
                        swap(i, j);
                    }
                } else {
                    if (studArray[i].getAge() > studArray[j].getAge()) {
                        swap(i, j);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        StudentMain s = new StudentMain();
        s.menu();
    }
}