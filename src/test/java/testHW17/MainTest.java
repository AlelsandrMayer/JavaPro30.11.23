package testHW17;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.example.HW17.MethodsStreamApi.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testAverageValue() {
        double actualAverage = averageValue(new ArrayList<>(List.of(1, 6, 2, 8, 4, 3, 9, 0, 2, 4, 6, 8)));
        double expectedAverage = 4.416666666666667;

        assertEquals(expectedAverage, actualAverage, 0.001);
    }

    @Test
    public void testPairWords() {
        List<Pair<String, String>> actualPairs = pairWords(new ArrayList<>(List.of("Ваня", "СтанислаВ", "вася")));

        List<Pair<String, String>> expectedPairs = new ArrayList<>();

        expectedPairs.add(new Pair<>("Ваня", "ВАНЯ"));
        expectedPairs.add(new Pair<>("СтанислаВ", "СТАНИСЛАВ"));
        expectedPairs.add(new Pair<>("вася", "ВАСЯ"));

        assertEquals(expectedPairs, actualPairs);
    }

    @Test
    public void testLowerCaseWords() {
        List<String> actualWords = lowerCaseWords(List.of("Ваня", "СтанислаВ", "вася", "коля", "витя", "петр", "александр"));
        List<String> expectedWords = List.of("вася", "коля", "витя", "петр");

        assertEquals(expectedWords, actualWords);
    }
}