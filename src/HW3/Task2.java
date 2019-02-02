package HW3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Введите число");
        int fibonacci = f.nextInt();
        int prelastNum = 0;
        int lastNum = 1;

        while (lastNum < fibonacci) {
            lastNum += prelastNum;
            prelastNum = lastNum - prelastNum;
            System.out.print(prelastNum + " ");
        }
    }
}
