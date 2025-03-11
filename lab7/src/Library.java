import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.title.equalsIgnoreCase(title));
    }

    public List<Book> searchByGenre(String genre) {
        return books.stream().filter(b -> b.genre.equalsIgnoreCase(genre)).toList();
    }
}
