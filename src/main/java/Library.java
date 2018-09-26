import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int stockCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (stockCount() < getCapacity())
            this.collection.add(book);
    }

    public void loanBook(Book book) {
        this.collection.remove(book);
    }
}