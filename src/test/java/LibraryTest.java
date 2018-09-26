import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(3);
        book = new Book("Northern Lights", "Philip Pullman", "Fantasy");
    }

    @Test
    public void hasCapacity() {
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void cantAddBookIfAtMaxCapacity() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.stockCount());
    }

    @Test
    public void canGetStockCount() {
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }
}