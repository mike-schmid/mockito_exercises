package exercise03;

import org.junit.Test;
import shared.Book;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mike Schmid
 */
public class BookloggerTest {

    // TODO: check that the method "Booklogger.logASingleBook(...)" was called exactly 2 times. Also check that the parameter of both calls were correct!
    // Hint: you cannot mock "Booklogger" because that's the class we want to test....

    @Test
    public void testLogBooks() throws Exception {
        final List<Book> booksToLog = Arrays.asList(new Book(1, "Harry Potter"), new Book(2, "Lord of the Rings"));
        new Booklogger().logBooks(booksToLog);
    }

}