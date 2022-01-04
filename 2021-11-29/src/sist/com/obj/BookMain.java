package sist.com.obj;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setPrice(2000);
        book1.setBookName("자바의 정석");
        book1.setAuthor("누군가");
        book1.setPublisher("어떤출판사");
        book1.setIsbn("132213123");
        System.out.println(book1.getPrice());
        System.out.println(book1.getBookName());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPublisher());
        System.out.println(book1.getIsbn());
    }
}