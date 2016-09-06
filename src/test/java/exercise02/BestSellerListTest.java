package exercise02;

import org.junit.Before;
import org.junit.Test;
import shared.Book;

/**
 * Exercise 02 - Verify method calls
 *
 * @author Mike Schmid
 */
public class BestSellerListTest {

    private BestSellerDatabase database;

    @Before
    public void setUp() throws Exception {
        database = new BestSellerDatabase();
    }

    @Test
    public void testAddBookIfBestSeller() throws Exception {
        final BestSellerList bestSellerList = new BestSellerList(database);

        bestSellerList.addBookIfBestSeller(new Book(1, "Harry Potter"), 200000);
        bestSellerList.addBookIfBestSeller(new Book(2, "50 Shades of Yellow"), 70000);

        //TODO: Check that only the first book (Harry Potter) is added to the database. You may use mockitos veryfiy() methods

    }

}