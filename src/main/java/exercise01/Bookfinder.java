package exercise01;

import shared.Book;

import java.util.List;

/**
 * Mike Schmid (Namics AG).
 */
public class Bookfinder {

    private final SlowDatabase slowDatabase;

    public Bookfinder(final SlowDatabase slowDatabase) {
        this.slowDatabase = slowDatabase;
    }

    public String findBookTitleById(int id) {

        final List<Book> allBooks = slowDatabase.getAllBooks();
        for (Book book : allBooks) {
            if(book.getId() == id){
                return "Book [" + book.getTitle() + "] found!";
            }
        }

        return "Book not found";
    }

}
