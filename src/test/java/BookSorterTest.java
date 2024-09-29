import org.example.Book;
import org.example.BookSorter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BookSorterTest {

    @Test
    public void testSortByTitle() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("The Hobbit", "J.R.R. Tolkien", 1937, 15.99),
                new Book("A Tale of Two Cities", "Charles Dickens", 1859, 12.50),
                new Book("Moby Dick", "Herman Melville", 1851, 17.00)
        ));

        List<Book> sortedBooks = BookSorter.sortByTitle(books);

        List<Book> expectedBooks = new ArrayList<>(List.of(
                new Book("A Tale of Two Cities", "Charles Dickens", 1859, 12.50),
                new Book("Moby Dick", "Herman Melville", 1851, 17.00),
                new Book("The Hobbit", "J.R.R. Tolkien", 1937, 15.99)
        ));

        for (int i = 0; i < expectedBooks.size(); i++) {
            assertEquals(expectedBooks.get(i).getTitle(), sortedBooks.get(i).getTitle());
        }
    }

    @Test
    public void testSortByAuthor() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Book A", "Author C", 2000, 10.00),
                new Book("Book B", "Author A", 1999, 15.00),
                new Book("Book C", "Author B", 2001, 20.00)
        ));

        List<Book> sortedBooks = BookSorter.sortByAuthor(books);

        List<Book> expectedBooks = new ArrayList<>(List.of(
                new Book("Book B", "Author A", 1999, 15.00),
                new Book("Book C", "Author B", 2001, 20.00),
                new Book("Book A", "Author C", 2000, 10.00)
        ));

        for (int i = 0; i < expectedBooks.size(); i++) {
            assertEquals(expectedBooks.get(i).getAuthor(), sortedBooks.get(i).getAuthor());
        }
    }

    @Test
    public void testSortByYear() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Book A", "Author A", 2000, 10.00),
                new Book("Book B", "Author B", 1999, 15.00),
                new Book("Book C", "Author C", 2001, 20.00)
        ));

        List<Book> sortedBooks = BookSorter.sortByYear(books);

        List<Book> expectedBooks = new ArrayList<>(List.of(
                new Book("Book B", "Author B", 1999, 15.00),
                new Book("Book A", "Author A", 2000, 10.00),
                new Book("Book C", "Author C", 2001, 20.00)
        ));


        for (int i = 0; i < expectedBooks.size(); i++) {
            assertEquals(expectedBooks.get(i).getYear(), sortedBooks.get(i).getYear());
        }

    }

    @Test
    public void testSortByPrice() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Book A", "Author A", 2000, 20.00),
                new Book("Book B", "Author B", 1999, 15.50),
                new Book("Book C", "Author C", 2001, 10.38)
        ));

        List<Book> sortedBooks = BookSorter.sortByPrice(books);

        List<Book> expectedBooks = new ArrayList<>(List.of(
                new Book("Book C", "Author C", 2001, 10.38),
                new Book("Book B", "Author B", 1999, 15.50),
                new Book("Book A", "Author A", 2000, 20.00)
        ));

        for (int i = 0; i < expectedBooks.size(); i++) {
            assertEquals(expectedBooks.get(i).getPrice(), sortedBooks.get(i).getPrice());
        }
    }

    @Test
    public void testSortByTitle_EmptyList() {
        List<Book> books = new ArrayList<>(List.of());
        List<Book> sortedBooks = BookSorter.sortByTitle(books);
        assertTrue(sortedBooks.isEmpty());
    }

    @Test
    public void testSortByTitle_SingleBook() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("The Hobbit", "J.R.R. Tolkien", 1937, 15.99)
        ));

        List<Book> sortedBooks = BookSorter.sortByTitle(books);

        assertEquals(1, sortedBooks.size());
        assertEquals("The Hobbit", sortedBooks.get(0).getTitle());
    }
}
