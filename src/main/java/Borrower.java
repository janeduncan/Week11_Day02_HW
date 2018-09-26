import java.util.ArrayList;

public class Borrower {

    public ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void borrowBook(Library library, Book book) {
        this.books.add(book);
        library.loanBook(book);
    }
}