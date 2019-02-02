package HW4;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {13, 20, 13, 33, 20, 5, 4, 20};
        int[] newArray;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i] == array[j] && j == i) {
                    counter++;
                } else if (array[i] == array[j]) {
                    break;
                }
            }
        }
        newArray = new int[counter];
        counter = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j <= i; j++) {
                if (array[i] == array[j] && j == i) {
                    newArray[counter] = array[i];
                    counter++;
                } else if (array[i] == array[j]) {
                    break;
                }
            }
        System.out.println(Arrays.toString(newArray));
    }
}
