package sist.com.obj;

public class ActionFactory {

    private static ActionFactory actionFactory;

    public static ActionFactory getInstacne() {

        if (actionFactory == null) {
            actionFactory = new ActionFactory();
        }

        return actionFactory;
    }

    public Action getAction(String command) {
        if (command.equalsIgnoreCase("login")) {
            return new LoginAction(new OracleDao(), "loginView", true);
        } else if (command.equalsIgnoreCase("delete")) {
            return new DeleteAction(new MySqlDao(), "listView", false);
        } else if (command.equalsIgnoreCase("update")) {
            return new UpdateAction(new OracleDao(), "upDateView", false);
        } else if (command.equalsIgnoreCase("info")) {
            return new InfoAction(new MsSqlDao(), "infoView", true);
        }
        return null;
    }
}