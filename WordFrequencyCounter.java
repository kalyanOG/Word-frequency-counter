import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String sentence = "The quick brown fox jumps over the lazy dog";

        String[] words = sentence.toLowerCase().split("\\W+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }

        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}

WORD FREQUENCY COUNTR OUTPUT:

Word Frequency:
the: 2
over: 1
quick: 1
lazy: 1
jumps: 1
brown: 1
dog: 1
fox: 1