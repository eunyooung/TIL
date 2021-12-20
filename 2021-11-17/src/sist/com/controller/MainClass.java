package sist.com.controller;

public class MainClass {
    
    public void controllerEx1() {
        int x = 1, y = 2, z = 3;
        //System.out.println(x++ == 1);
        /*
         * if(x++ == 1) { System.out.println("if x++ == 1 1");
         * System.out.println("if x++ == 1 2"); } else {
         * System.out.println("else x++ == 1 1"); } System.out.println("else x++ == 1 2" );
         */
        //System.out.println(x++ == 1 && ++x == 3);

        /*
         *  if(++x == 2 && x++ == 3 || ++x == 4) { 
         *      System.out.println("True");
         *  }else {
         *      System.out.println("False");
         *  }
         */
       
        if(++x == 2) {
            if(y-- == 2) {
                if(++z == 4) {

                } else {
                    
                }
            } else {
            
            }
        } else {
            
        }
        if(++x == 2 && y-- == 2 && ++z == 4) {
        
        }else {
            
        }
    }
    
    public void controlEx1(double avg) {
        if(avg >= 90)
            System.out.println("A");
        else if(avg >= 80)
            System.out.println("B");
        else if(avg >= 70)
            System.out.println("C");      
    }
    
    public void controlEx2(int value) {
        switch(value) {
            case 5:
               System.out.println("5");
               break;
            case 6:
            case 7:
            case 8:
               System.out.println("6");
               break;
            default:
               System.out.println("기타");
        }
    }
    
    public static void main(String[] args) {
        MainClass c = new MainClass();
        c.controllerEx1();
    }
}