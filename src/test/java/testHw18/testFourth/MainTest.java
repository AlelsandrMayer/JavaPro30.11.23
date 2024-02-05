package testHw18.testFourth;

import org.example.hw18.fourth.Product;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.example.hw18.fourth.Main.lastAdded;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testLastAdded() {
        LocalDateTime now = LocalDateTime.now();

        List<Product> products = Arrays.asList(
                new Product("Book", 350, true, now.minusHours(10)),
                new Product("Pencil", 200, false, now.minusDays(3)),
                new Product("Pen", 150, true, now.minusMinutes(300)),
                new Product("Book", 500, false, now.minusSeconds(2000))
        );

        List<Product> lastAddedProducts = lastAdded(products);

        assertEquals(3, lastAddedProducts.size());

        assertEquals("Book", lastAddedProducts.get(0).getType());

        assertEquals("Pen", lastAddedProducts.get(1).getType());

        assertEquals("Book", lastAddedProducts.get(2).getType());
    }
}



