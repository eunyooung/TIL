## **Q1 다음 중 인터페이스의 장점이 아닌 것은? (390page 참조)**
- a. 표준화를 가능하게 해준다.
- b. 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.
- c. 독립적인 프로그래밍이 가능하다.
- d. 다중상속을 가능하게 해준다.
- e. 패키지간의 연결을 도와준다.  

**정답:**
```
e
```

<br>

## **Q2 다음 중 틀린 것은?**
- a. 필드는 초기화하지 않아도 된다.
- b. 클래스에 생성자가 없어도 된다.
- c. 생성자는 일반적으로 필드를 초기화한다.
- d. 필드는 생성자보다 먼저 선언해야 한다.  

**정답:**
```
d. 언제하든 상관없음
```

<br>

## **Q3 상속을 설명한 것이다. 틀린 것은?**
- a. 모든 클래스의 최상위 클래스는 Object이다.
- b. 부모 객체를 자식 클래스 타입의 변수에 대입할 수 있다.
- c. 부모 클래스의 private 메소드를 자식 클래스가 오버라이딩할 수 없다.
- d. 부모 클래스를 상속하려면 extends 키워드가 필요하다.  

**정답:**
```
b
```

<br>

## **Q4 다음 코드가 있다. 밑줄 그은 곳에 적절하지 않은 코드는?**
``` java
class Car {
    public String name;
    protected String color;
    private  int model;
}
 
class SportsCar extends Car {
    boolean turbo;
}
 
public class CarTest {
    public static void main(String[] args) {
        SportsCar s = new SportsCar();
        ______________________
    }
}
```
- a. s.name = "ferrari";
- b. s.color = "red";
- c. s.model = 105;
- d. s.turbo = true;  

**정답:**  
```
c
```

<br>

## **Q5 다음 빈칸에 O,X를 채우시오**
|접근 지정자|동일 클래스|다른 패키지|자식 클래스|전체|
|:---:|:---:|:---:|:---:|:---:|
|public|||||
|protected|||||
|(default)|||||
|private|||||

**정답:**  

|접근 지정자|동일 클래스|다른 패키지|자식 클래스|전체|
|:---:|:---:|:---:|:---:|:---:|
|public|o|o|o|o|
|protected|o|o|o|x|
|package|o|o|x|x|
|private|o|x|x|x|


<br>

## **Q6. 다음과 같은 부모 클래스와 자식 클래스가 있다 틀린 곳을 찾으시오**
``` java
class Person {
    void name() { }
    protected void number() { }
    private void secret() { }
}
 
class Student extends Person {
    public void name() { }
    void number() { }
    private void secret() { }
}
```

**정답:**
```
number() 오버라이딩시 부모 클래스의 메소드의 접근 제한자보다 좁아질 수 없음
```

<br>

## **Q7. 인터페이스를 설명한 것이다. 틀린 것은?**
- a. 인터페이스는 인스턴스 변수를 포함할 수 없다.
- b. 인터페이스는 생성자를 포함할 수 없다.
- c. 인터페이스는 상수를 포함할 수 없다.
- d. 인터페이스의 모든 멤버는 public으로 공개된다.

**정답:**  
```
b
```

<br>

## **Q8. 다음은 인터페이스와 구현 클래스를 정의한 코드이다. 빈칸에 적절한 내용은?**
``` java
interface A{
    void isPrint();
}
 
class B __________ {
    public void isPrint() {
        System.out.println(“OK");
    }
}
```

**정답:**  
```
implements A
```

<br>

## **Q9. Printable는 인터페이스이다. 다음 코드에서 잘못된 행을 모두 찾으시오**
``` java
interface Printable {
    String toner;
    abstract void print();
}
 
public class PrintableTest extends Printable {
    public static void main(String[] args) {
        new Printable();
        new PrintableTest();
    }
 
    void print() {}
}
```

**정답:**  
```
String toner -> 초기화가 필요
extends Printable -> implements Printable
new Printable() -> 인스턴스화 불가능
void print() {} -> public void print() {}

```