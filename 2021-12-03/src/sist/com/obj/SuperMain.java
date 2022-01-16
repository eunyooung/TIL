package sist.com.obj;

public class SuperMain {
    
    private Super s;

    public SuperMain(Super s) {
        super();
        this.s = s;
        message();
    }

    public void message() {
        if (s instanceof Child1) {
            ((Child1) s).childAction();
        } else if (s instanceof Child2) {
            ((Child2) s).childAction();
        } else if (s instanceof Child3) {
            ((Child3) s).childAction();
        }
    }

    public static void main(String[] args) {
        SuperMain s = new SuperMain(new Child3());

        /*
         * s.say();
         * s.superMethod();
         * ((Child2)s).child2Action();
         * //downCast
         */
    }
}