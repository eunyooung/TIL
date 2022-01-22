package sist.com.obj2;

public abstract class AbstractSub extends AbstractSuper {

    private int abstractSub;

    public AbstractSub() {
        super();
    }

    public AbstractSub(int superValue, int subValue) {
        super(superValue);
    }

    public abstract void abstractSubMethod();
}