package sist.com.variable;

// 변수 Variable,Constant(final)
// boolean
public class MainClass5 {

    public boolean actionBoolean(int x,int y,int z) {
        return x + y < y - z;
    }
    
    public char actionChar(int x) {
        return (char)x;
    }
    
    public static void main(String[] args) {
        MainClass5 v = new MainClass5();
        System.out.println(v.actionBoolean(5, 7,8));
        System.out.println(v.actionChar(34));
    }
}