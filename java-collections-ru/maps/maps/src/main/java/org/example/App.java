package org.example;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        var words = sentence.split(" ");
        for (String word: words) {

            if (map.containsKey(word)) {
                var newValue = map.get(word) + 1;
                map.put(word, newValue);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }

    public static String toString(Map<String, Integer> map) {

        var result = new StringBuilder();
        result.append("{\n");
        for (String key: map.keySet()) {
            result.append("  ")
                    .append(key)
                    .append(map.get(key))
                    .append("\n");
        }
        result.append("}");

        return result.toString();
    }
}
