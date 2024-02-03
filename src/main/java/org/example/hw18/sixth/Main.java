package org.example.hw18.sixth;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(groupByType(Arrays.asList(
                new Product(1, "Toy", 30, true, LocalDateTime.now().minusMonths(4)),
                new Product(2, "Book", 80, false, LocalDateTime.now().minusDays(3)),
                new Product(3, "Toy", 150, true, LocalDateTime.now().minusMinutes(300)),
                new Product(4, "Toy", 40, false, LocalDateTime.now().minusSeconds(2000)),
                new Product(5, "Book", 50, false, LocalDateTime.now().minusWeeks(2)))));
    }

    public static Map<String, List<Product>> groupByType(List<Product> products) {

        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
