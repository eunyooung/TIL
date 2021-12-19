package sist.com.main;

// try~catch, Exception

public class MainClass2 {
    //static String s;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.out.println("1");
        System.out.println("2");
        try {
            //s.replace("a", "b");
            System.out.println("3");
            System.out.println(10 / 0);
            System.out.println("5");
        } catch (ArrayIndexOutOfBoundsException e) { // 배열 범위 초과 
            System.out.println("6");
        } catch (ArithmeticException e) {
            System.out.println("7");
        } catch (NullPointerException e) {
            // 주소값이 없는 경우 
            /*
             *    A a;
             *    a.name = ""
             */
            System.out.println("8");
        } catch (ClassCastException e) {
            // 형변환이 틀린 경우 
            /*
             *    class A => 컴퓨터
             *    class B => 냉장고
             *    
             *    A a = new A()
             *    B b = new B();
             *    
             *    B c = a;
             */
            System.out.println("9");
        }
        /*
         * finally // 생략이 가능 { System.out.println("10"); }
         */
        System.out.println("11");
    }
}