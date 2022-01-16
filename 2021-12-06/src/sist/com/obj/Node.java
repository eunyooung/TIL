package sist.com.obj;

public class Node {
    
    static Node node = null;
    private int dataValue;

    public void setDataValue(int dataValue) {
        this.dataValue = dataValue;
    }

    public int getDataValue() {
        return this.dataValue;
    }

    public static Node getInstance() {
        if (node == null) {
            node = new Node();
        }
        return node;
    }

    private Node() {
        dataValue = 0;
    }
}