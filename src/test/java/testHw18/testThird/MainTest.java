package testHw18.testThird;

import org.example.hw18.third.Product;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.hw18.third.Main.minBook;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    @Test
    public void testMinBook() {
        List<Product> products = Arrays.asList(
                new Product("Book", 350, true),
                new Product("Pencil", 200, false),
                new Product("Pen", 150, true),
                new Product("Book", 500, false)
        );

        Product minBook = minBook(products);

        assertEquals("Book", minBook.getType());
        assertEquals(315, minBook.getPrice());
    }

    @Test
    public void testMinBook_NoBooks() {
        List<Product> products = Arrays.asList(
                new Product("Pencil", 200, false),
                new Product("Pen", 150, true)
        );

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            minBook(products);
        });
    }
}

