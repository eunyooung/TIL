package sist.com.variable.basic;

public class MainClass {
    
    public void varibaleMethod1() {
        int i = 10;
        System.out.println(i);                  
    }
    
    public void varibaleMethod2() {
        //int i = 10;
        //System.out.println(i);                  
    }
    
    public void varibaleMethod3(float value) {

    }
    
    public static void main(String[] args) {          
        MainClass v = new MainClass();        
        v.varibaleMethod3((float)10.5);
    }
}