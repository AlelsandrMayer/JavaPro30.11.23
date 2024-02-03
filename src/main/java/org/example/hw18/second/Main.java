package org.example.hw18.second;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1.1 - 1.2
        sortByDiscount(Arrays.asList(
                new Product("Book", 255, true),
                new Product("Pen", 200, false),
                new Product("Pen", 25, true),
                new Product("Book", 300, false)))
                .forEach(System.out::println);

    }

    public static List<Product> sortByDiscount(List<Product> products) {
        return products.stream()
                .filter(b -> b.getType().equals("Book"))
                .filter(Product::isDiscount)
                .peek(Product::applyDiscount)
                .collect(Collectors.toList());
    }
}
