package exercise01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Mike Schmid (Namics AG).
 */
public class BookfinderTest {

    //TODO: refactor this test to make it faster! use mockito to mock the actual database access!

    public SlowDatabase slowDatabase;

    @Before
    public void setUp() {
        slowDatabase = new SlowDatabase();
    }

    @Test
    public void testGetBookTitle() throws Exception {
        final Bookfinder bookfinder = new Bookfinder(slowDatabase);

        Assert.assertEquals("Book [The Hobbit] found!", bookfinder.findBookTitleById(7));
        Assert.assertEquals("Book [20,000 Leagues under the Sea] found!", bookfinder.findBookTitleById(17));
        Assert.assertEquals("Book not found", bookfinder.findBookTitleById(999));

    }

}