package sist.com.obj;

// overload(메서드이름이 같아야 한다, 인자 개수 또는 타입이 달라야 한다) 

public class MainClass3 {
    
    public void add() {
        System.out.println("add()");
    }

    /*
     * public void add(byte value) {
     *     System.out.println("public void add(byte value)");
     * }
     */
    
    public void add(short value) {
        System.out.println("public void add(short value)");
    }

    /*
     * public void add(int value) {
     *     System.out.println("public void add(int value)");
     * }
     */
    
    public void add(String s, int value) {
        System.out.println("add(String s,int value)");
    }

    public void add(int value, String s) {
        System.out.println("add(int value,String s)");
    }

    public void add(int... a) {
        System.out.println("add(int ...a)");
    }
    
    /*
     * public void add(int []a) {
     *     System.out.println("add(int ...a)");
     * }
     * 
     * public int add(int value) {
     *     System.out.println("public void add(int value)");
     *     return 0;
     * }
     * 
     * public void add(long x,long y) { 
     *     System.out.println("add(long x,long y)");
     * }
     * 
     * public void add(int x,int y) {
     *     System.out.println("add(int x,int y)");
     * }
     */
    
    public static void main(String[] args) {
        MainClass3 o = new MainClass3();
        //o.add(10, 20L);
        o.add(10); // byType
    }
}