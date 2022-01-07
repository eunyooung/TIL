package sist.com.obj;

// (alt + shift + s) + r (getter,setter)
// (alt + shift + s) + o (Constructor)
// (alt + shift + s) + s  toString

public class Student {
    
    private String name;
    private int age;
    private String stdID;
    private String schoolName;
    private Score score;

    public Student() {
        super();
    }

    public Student(String name) {
        super();
        this.name = name;
    }

    public Student(Score score) {
        super();
        this.score = score;
    }

    public Student(String name, int age, String stdID, String schoolName) {
        super();
        this.name = name;
        this.age = age;
        this.stdID = stdID;
        this.schoolName = schoolName;
    }

    public Student(String name, int age, String stdID, String schoolName, Score score) {
        super();
        this.name = name;
        this.age = age;
        this.stdID = stdID;
        this.schoolName = schoolName;
        this.score = score;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student [name=" + this.name + ", age=" + this.age + ", stdID=" + stdID + ", schoolName=" + schoolName
                + "]";
    }
}