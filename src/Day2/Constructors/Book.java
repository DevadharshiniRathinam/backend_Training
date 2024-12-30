package Day2.Constructors;

public class Book {
    String title;
    String author;
    public Book()
    {
        this.title="JAVA BOOK";
        this.author="JAMES";
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
    public static void main(String[] args) {
        Book book = new Book();

    }
}
