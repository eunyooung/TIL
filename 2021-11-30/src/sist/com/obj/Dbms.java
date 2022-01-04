package sist.com.obj;

public class Dbms {
    
    private String url;
    private String account;
    private String password;
    private int connectMax;
    private boolean isStart;

    public Dbms() {
        this("");
        System.out.println("Dbms()");
    }

    public Dbms(String url) {
        this(url, "");
        System.out.println("Dbms(String url)");
    }

    public Dbms(String url, String account) {
        this(url, account, "");
        System.out.println("Dbms(String url,String account)");
    }

    public Dbms(String url, String account, String password) {
        this(url, account, password, 0);
        System.out.println("Dbms(String url,String account,String password)");
    }

    public Dbms(String url, String account, String password, int connectMax) {
        this(url, account, password, connectMax, false);
        System.out.println("Dbms(String url,String account,String password,int connectMax)");
    }

    public Dbms(String url, String account, String password, int connectMax, boolean isStart) {
        this.url = url;
        this.account = account;
        this.password = password;
        this.connectMax = connectMax;
        this.isStart = isStart;
        System.out.println("Dbms(String url,String account,String password,int connectMax,boolean isStart)");
    }

    public Dbms(Dbms db) {
        this.url = db.url;
        this.account = db.account;
        this.password = db.password;
        this.connectMax = db.connectMax;
        this.isStart = db.isStart;
    }

    public void disp(Dbms this) {
        System.out.println("url:" + this.url + " account:" + this.account + " password:" + password + "  connectMax:"
                + connectMax + " isStart:" + isStart);
    }

    public static void main(String[] args) {
        Dbms d = new Dbms();
        d.disp();
    }
}