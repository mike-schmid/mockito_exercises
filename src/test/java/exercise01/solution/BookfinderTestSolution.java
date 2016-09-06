package exercise01.solution;

import exercise01.Bookfinder;
import exercise01.SlowDatabase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import shared.Book;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise 01 - A simple Mock
 *
 * @author Mike Schmid
 */
@RunWith(MockitoJUnitRunner.class)
public class BookfinderTestSolution {

    @Mock
    public SlowDatabase slowDatabase;

    @Before
    public void setUp() {
        final List<Book> fakeDatabaseResponse = Arrays.asList(new Book(7, "The Hobbit"), new Book(17, "20,000 Leagues under the Sea"));
        Mockito.when(slowDatabase.getAllBooks()).thenReturn(fakeDatabaseResponse);
    }

    @Test
    public void testGetBookTitle() throws Exception {
        final Bookfinder bookfinder = new Bookfinder(slowDatabase);

        Assert.assertEquals("Book [The Hobbit] found!", bookfinder.findBookTitleById(7));
        Assert.assertEquals("Book [20,000 Leagues under the Sea] found!", bookfinder.findBookTitleById(17));
        Assert.assertEquals("Book not found", bookfinder.findBookTitleById(999));
    }

}