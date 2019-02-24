package homework12.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class LetterCounterDemo {

    public static void main(String[] args) throws IOException {
        File verse = Paths.get("resources", "anchar.txt").toFile();
        LetterCounter letterCounter = new LetterCounter();

        System.out.println(letterCounter.count(verse));
        letterCounter.countInFile(verse);
    }
}
