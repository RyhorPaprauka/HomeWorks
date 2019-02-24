package homework12.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LetterCounter {

    /* Использовал Scanner п.ч. со строкой, мне показалось, более удобно работать чем с символом */
    public TreeMap<Character, Integer> count(File file) throws FileNotFoundException {
        TreeMap<Character, Integer> letterCount = new TreeMap<>();

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            while (scanner.hasNext()) {
                String word = getClearString(scanner.next());
                word.chars()
                        .mapToObj(letter -> (char) letter)
                        .forEach(character ->
                                letterCount.merge(character, 1,
                                        (oldValue, newValue) -> oldValue + newValue));
            }
        }
        return letterCount;
    }

    public void countInFile(File file) throws IOException {
        File newFile = Paths.get(file.getParent(), file.getName() + "-letterCount.txt").toFile();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile))) {
            for (Map.Entry entry : count(file).entrySet()) {
                bufferedWriter.write(entry.getKey() + " - " + entry.getValue());
                bufferedWriter.newLine();
            }
        }
    }

    private String getClearString(String string) {

        return string
                .replace(".", "")
                .replace(",", "")
                .replace("!", "")
                .replace("?", "")
                .replace(":", "")
                .replace(";", "")
                .replace("—", "")
                .toLowerCase();
    }
}
