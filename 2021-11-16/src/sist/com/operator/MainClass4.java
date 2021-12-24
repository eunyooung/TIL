package sist.com.operator;

//연산자 논리logic
public class MainClass4 {

    public void logicOperator(int x, int y) {
        System.out.println(x ^ y);
        System.out.println(x & y);
        System.out.println(x | y);
    }

    public void logicOperator(int x, int y, int z, int k) {
        boolean state = ++x != 1 & --y == 2 & z++ == 4 & --k == 3;
        System.out.printf("state=%b x=%d y=%d z=%d k=%d", state, x, y, z, k);
    }

    public void logicOperator(int x, int y, int z, int k, int u) {
        boolean state = ++x == 2 || y-- == 2 && --z == 2;
        System.out.printf("state=%b x=%d y=%d z=%d k=%d", state, x, y, z, k);
        //false 2 1 3
    }

    public double getAvg(int kor, int eng, int mat) {
        return (kor + eng + mat) / 3.0;
    }

    public boolean logicPass(int kor, int eng, int mat) {//평균이 60이상이면 pass
        //return kor >= 40 && eng >= 40 && mat >= 40 && getAvg(kor, eng, mat) >= 60;
        return kor < 40 || eng < 40 || mat < 40 || getAvg(kor, eng, mat) < 60;
    }

    public static void main(String[] args) {
        MainClass4 o = new MainClass4();
        System.out.println(o.logicPass(100, 95, 40) ? "불합격" : "합격");
    }
}