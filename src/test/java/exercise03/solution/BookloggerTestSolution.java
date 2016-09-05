package exercise03.solution;

import exercise03.Booklogger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import shared.Book;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.anyObject;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @author Mike Schmid
 */
@RunWith(MockitoJUnitRunner.class)
public class BookloggerTestSolution {

    @Test
    public void testLogBooks() throws Exception {
        final Booklogger booklogger = spy(Booklogger.class);

        final Book potterBook = new Book(1, "Harry Potter");
        final Book lotrBook = new Book(2, "Lord of the Rings");

        final List<Book> booksToLog = Arrays.asList(potterBook, lotrBook);
        booklogger.logBooks(booksToLog);

        verify(booklogger).logASingleBook(potterBook);
        verify(booklogger).logASingleBook(lotrBook);
        verify(booklogger, times(2)).logASingleBook(anyObject());

    }

}