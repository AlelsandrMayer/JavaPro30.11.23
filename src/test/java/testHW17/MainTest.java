package testHW17;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testAverage() {
        List<Integer> numbers = List.of(1, 6, 2, 8, 4, 3, 9, 0, 2, 4, 6, 8);

        double expectedAverage = 4.416666666666667;

        double actualAverage = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        assertEquals(expectedAverage, actualAverage, 0.001);
    }

    @Test
    public void testUpperCase() {
        List<String> words = List.of("Ваня", "СтанислаВ", "вася");

        List<Pair<String, String>> actualPairs = words.stream().map(word -> new Pair<>(word, word.toUpperCase())).collect(Collectors.toList());

        List<Pair<String, String>> expectedPairs = new ArrayList<>();
        expectedPairs.add(new Pair<>("Ваня", "ВАНЯ"));
        expectedPairs.add(new Pair<>("СтанислаВ", "СТАНИСЛАВ"));
        expectedPairs.add(new Pair<>("вася", "ВАСЯ"));

        assertEquals(expectedPairs, actualPairs);
    }

    @Test
    public void testLowerCaseWords() {
        List<String> words = List.of("Ваня", "СтанислаВ", "вася", "коля", "витя", "петр", "александр");

        List<String> expectedWords = List.of("вася", "коля", "витя", "петр");

        List<String> actualWords = words.stream().filter(w -> w.length() == 4 && w.equals(w.toLowerCase())).collect(Collectors.toList());


        assertEquals(expectedWords, actualWords);
    }
}

