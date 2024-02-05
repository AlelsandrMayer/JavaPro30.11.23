package testHw18.testSixth;

import org.example.hw18.sixth.Product;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.example.hw18.sixth.Main.groupByType;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testGroupByType() {
        List<Product> products = Arrays.asList(
                new Product(1, "Toy", 30, true, LocalDateTime.now().minusMonths(4)),
                new Product(2, "Book", 80, false, LocalDateTime.now().minusDays(3)),
                new Product(3, "Toy", 150, true, LocalDateTime.now().minusMinutes(300)),
                new Product(4, "Toy", 40, false, LocalDateTime.now().minusSeconds(2000)),
                new Product(5, "Book", 50, false, LocalDateTime.now().minusWeeks(2))
        );

        Map<String, List<Product>> groupedProducts = groupByType(products);

        assertEquals(2, groupedProducts.size());
        assertEquals(3, groupedProducts.get("Toy").size());
        assertEquals(2, groupedProducts.get("Book").size());

    }
}
