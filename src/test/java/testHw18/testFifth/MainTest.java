package testHw18.testFifth;

import org.example.hw18.fifth.Product;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.example.hw18.fifth.Main.sumBooksPrice;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSumBooksPrice() {
        List<Product> products = Arrays.asList(
                new Product("Book", 30, true, LocalDateTime.now().minusMonths(4)),
                new Product("Book", 80, false, LocalDateTime.now().minusDays(3)),
                new Product("Pen", 150, true, LocalDateTime.now().minusMinutes(300)),
                new Product("Book", 40, false, LocalDateTime.now().minusSeconds(2000)),
                new Product("Book", 50, false, LocalDateTime.now().minusWeeks(2))
        );

        double sum = sumBooksPrice(products);

        assertEquals(90, sum);
    }
}
