package sist.com.obj;

public class Doctor extends HuMan {

    @Override
    public void think() {
        // TODO Auto-generated method stub
        
        System.out.println("Doctor think");
    }

    public void treat() {
        System.out.println("treat");
    }
}