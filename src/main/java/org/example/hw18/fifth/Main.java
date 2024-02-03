package org.example.hw18.fifth;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Общая цена всех 'Book' - " + sumBooksPrice(Arrays.asList(
                new Product("Book", 30, true, LocalDateTime.now().minusMonths(4)),
                new Product("Book", 80, false, LocalDateTime.now().minusDays(3)),
                new Product("Pen", 150, true, LocalDateTime.now().minusMinutes(300)),
                new Product("Book", 40, false, LocalDateTime.now().minusSeconds(2000)),
                new Product("Book", 50, false, LocalDateTime.now().minusWeeks(2)))));
    }

    public static double sumBooksPrice(List<Product> products) {
        LocalDateTime currentDate = LocalDateTime.now();
        return products.stream()
                .filter(product -> product.getCreateDate().getYear() == currentDate.getYear())
                .filter(product -> product.getType().equalsIgnoreCase("book"))
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
