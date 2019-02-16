package test;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        String text = new String("I have got a family. It is small. We are a family of four." +
                " I have got a father, a mother and a brother. I haven’t got a sister. " +
                "My father is an engineer. He works in a plant. My mother is a teacher. " +
                "She works at school. My brother is little. He doesn’t go to school." +
                " He goes to a kindergarten. He is four.");

        for (Map.Entry entry : getWordFrequency(text).entrySet()) {
            System.out.println("Слово: " + entry.getKey() + " - " + entry.getValue() + " шт.");
        }
    }

    public static Map<String, Integer> getWordFrequency(String string) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] splitText = getClearString(string).split(" ");
        for (String i : splitText) {
            wordFrequency.put(i, wordFrequency.containsKey(i) ? wordFrequency.get(i) + 1 : 1);
        }
        return wordFrequency;
    }

    public static String getClearString(String string) {

        return string
                .replace(".", "")
                .replace(",", "")
                .replace("!", "")
                .replace("?", "")
                .replace("-", "");
    }
}
