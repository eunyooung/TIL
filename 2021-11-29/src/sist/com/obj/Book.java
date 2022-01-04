package sist.com.obj;

// class는 설계도 (속성(data(상태)) + 기능(function(행동))), 사용자정의 자료형, 묶음

public class Book {
    
    private String bookName;
    private String author;
    private String publisher;
    private int price;
    private String isbn;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String setIsbn(String isbn) {
        return this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public static void main(String[] args) {
        /*
        Book book = new Book();
        book.bookName = "민섭의정석";
        System.out.println(book.bookName);
        */
    }
}