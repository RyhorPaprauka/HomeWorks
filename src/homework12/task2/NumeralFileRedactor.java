package homework12.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NumeralFileRedactor {

    public File createRandomNumberFile(String fileName) throws IOException {

        File file = Paths.get("resources", fileName).toFile();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 20; i++) {
                String randomNumber = Integer.toString(RandomUtil.next());
                bufferedWriter.write(randomNumber);
                bufferedWriter.newLine();
            }
        }
        return file;
    }

    private List<Integer> sortNumbersFromFile(File file) throws FileNotFoundException {

        List<Integer> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            while (scanner.hasNext()) {
                numbers.add(scanner.nextInt());
            }
        }
        Collections.sort(numbers);
        return numbers;
    }

    public void sortNumbersInFile(File file) throws IOException {

        Iterator<Integer> iterator = sortNumbersFromFile(file).iterator();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            while (iterator.hasNext()) {
                String sortedNumber = Integer.toString(iterator.next());
                bufferedWriter.write(sortedNumber);
                bufferedWriter.newLine();
            }
        }
    }
}
