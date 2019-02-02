package HW2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner length = new Scanner(System.in);
        System.out.print("Введите длинну первого дома: ");
        double a = length.nextDouble();

        System.out.print("Введите ширину первого дома: ");
        double b = length.nextDouble();

        System.out.print("Введите длинну второго дома: ");
        double c = length.nextDouble();

        System.out.print("Введите ширину второго дома: ");
        double d = length.nextDouble();

        System.out.print("Введите длинну участка: ");
        double e = length.nextDouble();

        System.out.print("Введите ширину участка: ");
        double f = length.nextDouble();

        if ((a + c) <= e) {
            if (b <= f && d <= f) {
                System.out.println("Дома помещаются");
            }
        } else if ((a + d) <= e) {
            if (b <= f && c <= f) {
                System.out.println("Дома помещаются");
            }
        } else if ((b + c) <= e) {
            if (a <= f && d <= f) {
                System.out.println("Дома помещаются");
            }
        } else if ((b + d) <= e) {
            if (a <= f && c <= f) {
                System.out.println("Дома помещаются");
            }
        } else if ((a + c) <= f) {
            if (b <= e && d <= e) {
                System.out.println("Дома помещаются");
            }
        } else if ((a + d) <= f) {
            if (b <= e && c <= e) {
                System.out.println("Дома помещаются");
            }
        } else if ((b + c) <= f) {
            if (a <= e && d <= e) {
                System.out.println("Дома помещаются");
            }
        } else if ((b + d) <= f) {
            if (a <= e && c <= e) {
                System.out.println("Дома помещаются");
            }
        } else {
            System.out.println("Дома не помещаются");
        }
    }
}
