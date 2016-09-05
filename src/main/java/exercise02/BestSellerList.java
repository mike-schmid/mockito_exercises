package exercise02;

import shared.Book;

/**
 * @author Mike Schmid.
 */
public class BestSellerList {

    private final BestSellerDatabase database;

    public BestSellerList(final BestSellerDatabase database) {
        this.database = database;
    }

    public void addBookIfBestSeller(final Book book, int unitsSold){
        if(unitsSold > 100000){
            database.add(book);
        }
    }

}
