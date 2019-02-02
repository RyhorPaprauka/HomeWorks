package HW4;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        int[][] nums = {{0, 1,}, {3, 8, 5}, {1, 1, 1, 1}};
        System.out.println(Arrays.toString(linearize(nums)));
    }

    public static int[] linearize(int[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                counter++;
            }
        }
        int[] lineNums = new int[counter];
        counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                lineNums[counter] = array[i][j];
                counter++;
            }
        }
        return lineNums;
    }
}
