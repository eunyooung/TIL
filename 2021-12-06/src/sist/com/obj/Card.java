package sist.com.obj;

public class Card {
    
    private String name;

    public static Card getInstance() {
        return new Card();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private Card() {
        super();
    }
}