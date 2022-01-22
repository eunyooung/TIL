package sist.com.obj;

public class UpdateAction extends Action {

    private String path;
    private boolean redirect;
    private Dao dao;

    public UpdateAction(Dao dao, String path, boolean redirect) {
        super();
        this.path = path;
        this.redirect = redirect;
        this.dao = dao;
    }

    @Override
    public ActionForWard execute() {
        // TODO Auto-generated method stub
        
        System.out.println("UpdateAction Process");
        return new ActionForWard(path, redirect);
    }
}