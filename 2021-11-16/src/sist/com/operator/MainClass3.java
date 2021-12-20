package sist.com.operator;

public class MainClass3 {
    
    public int unaryOperator(int x,int y,int z,int k,int q) { 
        return ++x + --y + z++ + --q; // 2 + 1 + 3 + 4
    }
    
    public void unaryOperator(int data) {
        //System.out.println(!(data == 5));
        System.out.println(~data);
    }
    
    //최우선,단항,산술 +,-, *,/,% 
    public double calcOperator(int x,int y,int z,int k) {
        return (x + y * z / k) % 10;
    }
    
    public String calcOperator(int x) {
        //return x % 2 == 0 ? "Even" : "Odd";
        return x % 2 != 0 ? "홀" : "짝";
    }
    
    public void calcOper(int x) {
        if(x != 0 && x % 3 == 0) {
            System.out.println("3의배수 ");
        }
        else if(x != 0 && x % 5 == 0) {
            System.out.println("5의배수 ");
        }
        else if(x != 0 && x % 7 == 0) {
            System.out.println("7의배수 ");
        }
        else {
            System.out.println("기타 배수...");
        }
    }
    
   public static void main(String[] args) {
       MainClass3 o = new MainClass3();
       o.calcOper(25);
       //System.out.println(o.calcOperator(11));

       //o.unaryOperator(-11);
       //System.out.println(o.unaryOperator(1,2,3,4,5));//9
   }
}









