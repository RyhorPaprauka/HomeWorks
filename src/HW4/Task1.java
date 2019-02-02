package HW4;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int value = 0;
        System.out.println("Массив: " + Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == array.length - 1) {
                value = array[0];
                array[0] = array[i];
                array[i] = array[i - 1];
            } else if (i > 1) {
                array[i] = array[i - 1];
            } else {
                array[1] = value;
            }
        }
        System.out.println("Смещенный массив:" + Arrays.toString(array));
    }
}
