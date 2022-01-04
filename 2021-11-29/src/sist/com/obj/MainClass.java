package sist.com.obj;

// 클래스는 설계도

public class MainClass {
    
    /* ====== 멤버변수라 부름 (자바는 글로벌 변수란게 없음) ===== */
    // 인스턴스 변수 or 객체 변수- 힙 영역 (추상화된 것을 실제로 구현한 것)
    int data;
    // 클래스 변수 or 스태틱 변수- 스태틱 영역
    static int staticValue;
    // 종단 변수
    final int b = 10;

    public void method() {
        // 지역변수 - 스택 영역
        int value = 0;

        value++;
        this.data++;
        staticValue++;
        System.out.println("value=" + value + " data=" + data + " staticValue=" + staticValue + " b=" + b);
    }

    public static void main(String[] args) { // main
        MainClass o1 = new MainClass(); // data
        MainClass o2 = new MainClass(); // data
        o1.method(); // value 1 data 1 staticValue 1
        o1.method(); // value 1 data 2 staticValue 2
        o1.method(); // value 1 data 3 staticValue 3
        o1.method(); // value 1 data 4 staticValue 4
        o2.method(); // value 1 data 1 staticValue 5
        //System.out.println("HelloMain");
        //new MainClass().data = 90; // data(90)
        //System.out.println(new MainClass().data); // data
        //value = 500;
    }
}