package sist.com.obj2;

public abstract class AbstractSuper {

    private int abstractSuper;

    public AbstractSuper() {

    }

    public AbstractSuper(int supervalue) {
        super();
        this.abstractSuper = supervalue;
    }

    public abstract void abstractSuperMethod();

    private final void superInstanceMethod() {

    }
}