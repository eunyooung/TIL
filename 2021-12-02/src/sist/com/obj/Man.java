package sist.com.obj;

// 이름, 나이, 오늘생일, 성별, 지역, 띠, 전화번호

public class Man {
    
    private String name;
    private int age;
    private boolean birth;
    private String gender;
    private String location;
    private String ddi;
    private String tel;

    public Man() {
        super();
    }

    public Man(String name, int age, boolean birth, String gender, String location, String ddi, String tel) {
        super();
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.gender = gender;
        this.location = location;
        this.ddi = ddi;
        this.tel = tel;
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

    public boolean isBirth() {
        return birth;
    }

    public void setBirth(boolean birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Man [name=" + name + ", age=" + age + ", birth=" + birth + ", gender=" + gender + ", location="
                + location + ", ddi=" + ddi + ", tel=" + tel + "]";
    }
}