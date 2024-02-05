package testHw18.testSecond;

import org.example.hw18.second.Product;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.hw18.second.Main.sortByDiscount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSortByDiscount() {
        List<Product> products = Arrays.asList(
                new Product("Book", 255, true),
                new Product("Pen", 200, false),
                new Product("Pen", 25, true),
                new Product("Book", 300, false)
        );

        List<Product> sortedDiscountedBooks = sortByDiscount(products);

        assertEquals(1, sortedDiscountedBooks.size());
        assertEquals("Book", sortedDiscountedBooks.get(0).getType());
        assertEquals(229.5, sortedDiscountedBooks.get(0).getPrice());
    }
}

