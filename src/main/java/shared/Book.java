package shared;

/**
 * Mike Schmid (Namics AG).
 */
public class Book {

    private final int id;
    private final String title;

    public Book(final int id, final String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
