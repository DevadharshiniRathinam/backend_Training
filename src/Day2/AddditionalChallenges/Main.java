package Day2.AddditionalChallenges;
class Book {
    String bookName;
    String authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }
    public String toString() {
        return bookName + " by " + authorName;
    }
}
class Librarian {
    String librarianId;
    String name;

    public Librarian(String librarianId, String name) {
        this.librarianId = librarianId;
        this.name = name;
    }
}
class Member {
    String memberId;
    String name;
    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
    void borrowBook(Book book) {
        System.out.println(name + " borrowed " + book.bookName + ".");
    }
    void returnBook(Book book) {
        System.out.println(name + " returned " + book.bookName + ".");
    }
}
public class main {
    public static void main(String[] args) {
        Librarian lib = new Librarian("L001", "Alice");
        System.out.println("Librarian: " + lib.name + " (ID: " + lib.librarianId + ")");
        Book book1 = new Book("The java program", "james");
        System.out.println(book1);
        Member member = new Member("01", "Kavi");
        System.out.println("\nMember: " + member.name + " (ID: " + member.memberId + ")");
        member.borrowBook(book1);
        member.returnBook(book1);
        System.out.println("\nBook List:");
        System.out.println(book1);
    }
}

