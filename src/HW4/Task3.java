package HW4;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 7, 8};
        int[] secondArray = {5, 6, 7, 4, 3};
        int[] thirdArray = new int[firstArray.length + secondArray.length];
        int k = -1;
        int i = 0;

        for (i = 0; i < firstArray.length && i < secondArray.length; i++) {
            k++;
            thirdArray[k] = firstArray[i];
            k++;
            thirdArray[k] = secondArray[i];
        }
        for (int j = i; j < largerArray(firstArray, secondArray).length; j++) {
            k++;
            thirdArray[k] = largerArray(firstArray, secondArray)[j];
        }
        System.out.println(Arrays.toString(thirdArray));
    }

    public static int[] largerArray(int[] firstArray, int[] secondArray) {
        return (firstArray.length > secondArray.length ? firstArray : secondArray);
    }
}
