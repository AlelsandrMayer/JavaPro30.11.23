package org.example.HW17;

import javafx.util.Pair;

import java.util.List;
import java.util.stream.Collectors;

public class MethodsStreamApi {
    public static double averageValue(List<Integer> ints) {
        return ints.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }


    public static List<Pair<String, String>> pairWords(List<String> words) {
        return words.stream()
                .map(word -> new Pair<>(word, word.toUpperCase()))
                .collect(Collectors.toList());
    }

    public static List<String> lowerCaseWords(List<String> words) {
        return words.stream()
                .filter(w -> w.length() == 4 && w.equals(w.toLowerCase()))
                .collect(Collectors.toList());
    }
}
