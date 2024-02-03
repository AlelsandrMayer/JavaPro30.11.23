package org.example.hw18.fourth;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Минимальный элемент Book - " + lastAdded(Arrays.asList(
                new Product("Book", 350, true, LocalDateTime.now().minusHours(10)),
                new Product("Pencil", 200, false,LocalDateTime.now().minusDays(3)),
                new Product("Pen", 150, true,LocalDateTime.now().minusMinutes(300)),
                new Product("Book", 500, false,LocalDateTime.now().minusSeconds(2000)))));

    }

    public static List<Product> lastAdded (List<Product> products){
        return products.stream()
                .sorted(Comparator.comparing(Product::getCreateDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
