package homework12.task2;

import java.io.File;
import java.io.IOException;

public class NumeralFileRedactorDemo {

    public static void main(String[] args) throws IOException {

        NumeralFileRedactor numeralFileRedactor = new NumeralFileRedactor();

        File file = numeralFileRedactor.createRandomNumberFile("numbers.txt");
        numeralFileRedactor.sortNumbersInFile(file);
    }
}
