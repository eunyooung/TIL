package sist.com.obj;

public class NodeMain {

    public static void main(String[] args) {
        Node.getInstance().setDataValue(50);
        System.out.println(Node.getInstance().getDataValue());
    }
}