package exercise02;

import shared.Book;

import java.util.ArrayList;

/**
 * @author Mike Schmid
 */
public class BestSellerDatabase{

    // this list is private. so there is no way to check its content from outside...
    private final ArrayList<Book> books = new ArrayList<Book>();

    public void add(final Book book) {
        books.add(book);
    }

}
