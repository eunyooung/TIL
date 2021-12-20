package sist.com.operator;

public class MainClass2 {
    
    public int unaryOperator(int x) {
        System.out.println("unaryOperator(int x)");
        return !(x > 10) ? - x : + x;
    }
    
    public int unaryOperator(byte x) {
        System.out.println("unaryOperator(byte x)");
        return !(x > 10) ? - x : + x;
    }
    
    public void unaryOperator(String x,int y) {
        System.out.println("unaryOperator(String x)");
        int rs = !x.equals("Action") ? ++y : y++;      
        System.out.println("rs=" + rs++);
        System.out.println("rs=" + ++rs);   
    }
    
    public boolean unaryOperator(int x,int y,int z,int k) {
        return ((!(!!!(x < y) && z++ == 3) || (x + y) < z) ? "Java" : "Oracle").equals("Java");
    }
    
    public static void main(String[] args) {
         MainClass2 o = new MainClass2();
        System.out.println(o.unaryOperator(1, 2, 3, 4));
        //o.unaryOperator("Action",10);
        //System.out.println(o.unaryOperator(11));
     }
}

