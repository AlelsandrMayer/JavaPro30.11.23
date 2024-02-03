package org.example.hw18.third;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Минимальный элемент Book - " + minBook(Arrays.asList(
                new Product("Book", 350, true),
                new Product("Pencil", 200, false),
                new Product("Pen", 150, true),
                new Product("Book", 500, false))));

    }

    public static Product minBook(List<Product> products) {

        return products.stream()
                .filter(p -> p.getType().equalsIgnoreCase("Book"))
                .min(Comparator.comparingDouble(p -> p.isDiscount() ? p.applyDiscount() : p.getPrice()))
                .orElseThrow(() -> new RuntimeException("Элементы  Book отсуствуют"));
    }
}
