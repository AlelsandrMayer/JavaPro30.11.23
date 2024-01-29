package org.example.HW17;

import java.util.ArrayList;
import java.util.List;

import static org.example.HW17.MethodsStreamApi.*;

public class Main {
    public static void main(String[] args) {
        //1 - Имеется коллекция из Integes, использую стримы посчитать среденее значения всех чисел
        System.out.println("Среднее значение: " + averageValue(new ArrayList<>(List.of(1, 6, 2, 8, 4, 3, 9, 0, 2, 4, 6, 8))));
        System.out.println("\n-------------------------------------------------\n");

        //2 - Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>

        pairWords(new ArrayList<>(List.of("Ваня", "СтанислаВ", "вася", "коля", "Витя", "петр", "александр"))).forEach(System.out::println);
        System.out.println("\n-------------------------------------------------\n");

        //   3 - Имеется коллекция из String, отфильтровать и вывести на экран все значения, которые написаны в loverCase and length = 4

        lowerCaseWords(List.of("Ваня", "СтанислаВ", "вася", "коля", "Витя", "петр", "александр")).forEach(System.out::println);
    }
}
