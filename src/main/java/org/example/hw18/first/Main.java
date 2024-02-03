package org.example.hw18.first;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1.1 - 1.2
        sortByBooks(Arrays.asList(
                new Product("Book", 250),
                new Product("Pen", 200),
                new Product("Pen", 25),
                new Product("Book", 300)))
                .forEach(System.out::println);

    }

    public static List<Product> sortByBooks(List<Product> products) {
        return products.stream()
                .filter(b -> b.getPrice() > 250)
                .filter(b -> b.getType().equals("Book"))
                .collect(Collectors.toList());
    }
}
