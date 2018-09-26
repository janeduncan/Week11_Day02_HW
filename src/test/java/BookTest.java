import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Northern Lights", "Philip Pullman", "Fantasy");
    }

    @Test
    public void hasTitle() {
        assertEquals("Northern Lights", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Philip Pullman", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Fantasy", book.getGenre());
    }
}
