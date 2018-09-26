import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book1;
    Book book2;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(2);
        book1 = new Book("Northern Lights", "Philip Pullman", "Fantasy");
        book2 = new Book("The Subtle Knife", "Philip Pullman", "Fantasy");
    }

    @Test
    public void hasNoBooksAtStart() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.stockCount());
        assertEquals(0, borrower.bookCount());
        borrower.borrowBook(library, book1);
        assertEquals(1, library.stockCount());
        assertEquals(1, borrower.bookCount());
    }
}