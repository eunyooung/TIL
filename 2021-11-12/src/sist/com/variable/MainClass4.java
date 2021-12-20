package sist.com.variable;

public class MainClass4 {
    public void localValueEx1() {
        int a = 5;
        a = a + 1;
        System.out.println(a);
    }
    
    int x = 5;
    
    public void localValueEx2() {
        x = x + 5;
        System.out.println("x = " + x);
    }        
    public void localValueEx3() {
        int a = 10;
        {
            int b = 50;
            {
                int c = 99;
                c = 100;
            }
            b = 88;
        }
        a = 55;
    }
    
    public void localValueEx4() {
       System.out.println((int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
       /*
        *   for(int i = (int)Character.MIN_VALUE; i <= (int)Character.MAX_VALUE; i++) { 
        *   try {
        *       Thread.sleep(100); 
        *   } catch (Exception e) { 
        *       // TODO: handle exception 
        *   }
        *   if(i%7==0)
        *       System.out.println(); 
        *   System.out.print(i+":"+(char)i+"\t"); 
        *   }
        */
        System.out.print(65);
        System.out.print((char)65);
        System.out.print((char)10);
        System.out.print((char)66);
       
    }   
    public static void main(String[] args) {      
        MainClass4 v = new MainClass4();
       v.localValueEx4();
       v.localValueEx2();//10                      
       v.localValueEx2();//15                       
       v.localValueEx2();//20                       
    }
 }

