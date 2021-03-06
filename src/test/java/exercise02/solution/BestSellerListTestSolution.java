package exercise02.solution;

import exercise02.BestSellerDatabase;
import exercise02.BestSellerList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import shared.Book;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Exercise 02 - Verify method calls
 *
 * @author Mike Schmid
 */
@RunWith(MockitoJUnitRunner.class)
public class BestSellerListTestSolution {

    @Mock
    private BestSellerDatabase database;

    @Test
    public void testAddBookIfBestSeller() throws Exception {
        final BestSellerList bestSellerList = new BestSellerList(database);

        final Book potterBook = new Book(1, "Harry Potter");
        final Book yellowBook = new Book(2, "50 Shades of Yellow");

        bestSellerList.addBookIfBestSeller(potterBook, 200000);
        bestSellerList.addBookIfBestSeller(yellowBook, 70000);

        verify(database, times(1)).add(potterBook);
        verify(database, times(0)).add(yellowBook);
    }

}