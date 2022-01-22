package sist.com.obj;

public class LoginAction extends Action {

    private String path;
    private boolean redirect;
    private Dao dao;

    public LoginAction(Dao dao, String path, boolean redirect) {
        super();
        this.path = path;
        this.redirect = redirect;
        this.dao = dao;
    }

    @Override
    public ActionForWard execute() {
        // TODO Auto-generated method stub
        
        System.out.println("LoginAction Process");
        dao.select();
        return new ActionForWard(path, redirect);
    }
}