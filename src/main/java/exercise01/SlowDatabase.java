package exercise01;

import shared.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Mike Schmid (Namics AG).
 */
public class SlowDatabase {

    private List<Book> books = new ArrayList<Book>(40);

    public SlowDatabase() {
        books.add(new Book(1, "Don Quixote"));
        books.add(new Book(2, "Tale of Two Cities"));
        books.add(new Book(3, "O Alquimista (The Alchemist)"));
        books.add(new Book(4, "Le Petit Prince (The Little Prince)"));
        books.add(new Book(5, "Harry Potter and the Philosopher's Stone"));
        books.add(new Book(6, "Dream of the Red Chamber"));
        books.add(new Book(7, "The Hobbit"));
        books.add(new Book(8, "Alice in Wonderland"));
        books.add(new Book(9, "And Then There Were None"));
        books.add(new Book(10, "The Lion, the Witch and the Wardrobe"));
        books.add(new Book(11, "She: A History of Adventure"));
        books.add(new Book(12, "The Da Vinci Code"));
        books.add(new Book(13, "Think and Grow Rich"));
        books.add(new Book(14, "Harry Potter and the Half-Blood Prince"));
        books.add(new Book(15, "The Catcher in the Rye"));
        books.add(new Book(16, "The Adventures of Sherlock Holmes"));
        books.add(new Book(17, "20,000 Leagues under the Sea"));
        books.add(new Book(18, "Harry Potter and the Chamber of Secrets"));
        books.add(new Book(19, "Harry Potter and the Prisoner of Azkaban"));
        books.add(new Book(20, "Harry Potter and the Goblet of Fire"));
        books.add(new Book(21, "Harry Potter and the Order of the Phoenix"));
        books.add(new Book(22, "Harry Potter and the Deathly Hallows"));
        books.add(new Book(23, "Cien años de soledad (One Hundred Years of Solitude)"));
        books.add(new Book(24, "Lolita"));
        books.add(new Book(25, "Heidis Lehr- und Wanderjahre (Heidi's Years of Learning and Travel)"));
        books.add(new Book(26, "The Common Sense Book of Baby and Child Care"));
        books.add(new Book(27, "Anne of Green Gables"));
        books.add(new Book(28, "Black Beauty"));
        books.add(new Book(29, "Il Nome della Rosa (The Name of the Rose)"));
        books.add(new Book(30, "The Eagle Has Landed"));
        books.add(new Book(31, "Watership Down"));
        books.add(new Book(32, "The Hite Report"));
        books.add(new Book(33, "Charlotte's Web"));
        books.add(new Book(34, "The Ginger Man"));
        books.add(new Book(35, "The Bridges of Madison County"));
        books.add(new Book(36, "Ben-Hur: A Tale of the Christ"));
        books.add(new Book(37, "The Mark of Zorro"));
    }

    public List<Book> getAllBooks() {
        try {
            TimeUnit.SECONDS.sleep(5); // Simulate slow database access
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return books;
    }

}
