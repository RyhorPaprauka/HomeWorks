package homework12.task2;

import java.util.Random;

public final class RandomUtil {

    public static final Random RANDOM = new Random();

    public static int value;

    private RandomUtil() {
    }

    public static int next() {
        return RANDOM.nextInt(100);
    }
}
