package org.example.HW17;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1 - Имеется коллекция из Integes, использую стримы посчитать среденее значения всех чисел

        List<Integer> numbers = new ArrayList<>(List.of(1, 6, 2, 8, 4, 3, 9, 0, 2, 4, 6, 8));

        double averageValue = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Среднее значение: " + averageValue);


        //2 - Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>
        System.out.println("\n-------------------------------------------------\n");

        List<String> words = new ArrayList<>(List.of("Ваня", "СтанислаВ", "вася", "коля", "Витя", "петр", "александр"));

        List<Pair<String, String>> pairWorlds = words.stream()
                .map(word -> new Pair<>(word, word.toUpperCase()))
                .collect(Collectors.toList());


        pairWorlds.forEach(System.out::println);

        //   3 - Имеется коллекция из String, отфильтровать и вывести на экран все значения, которые написаны в loverCase and length = 4
        System.out.println("\n-------------------------------------------------\n");


        words.stream()
                .filter(w -> w.length() == 4 && w.equals(w.toLowerCase()))
                .forEach(System.out::println);

    }
}
