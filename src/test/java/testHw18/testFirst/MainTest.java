package testHw18.testFirst;

import org.example.hw18.first.Product;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.hw18.first.Main.sortByBooks;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSortByBooks() {
        List<Product> products = Arrays.asList(
                new Product("Book", 250),
                new Product("Pen", 200),
                new Product("Pen", 25),
                new Product("Book", 300)
        );

        List<Product> sortedBooks = sortByBooks(products);

        assertEquals(1, sortedBooks.size());
        assertEquals("Book", sortedBooks.get(0).getType());
        assertEquals(300, sortedBooks.get(0).getPrice());
    }
}
