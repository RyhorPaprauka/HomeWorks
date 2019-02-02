package HW3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число");
        int number = n.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
