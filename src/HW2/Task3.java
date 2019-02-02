package HW2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner coefficient = new Scanner(System.in);
        System.out.print("Введите старший коэффициент: ");
        double a = coefficient.nextDouble();

        System.out.print("Введите средний коэффициент: ");
        double b = coefficient.nextDouble();

        System.out.print("Введите свободный член: ");
        double c = coefficient.nextDouble();

        if (isZero(discriminant(a, b, c))) {
            double root = (0 - b) / (2 * a);
            System.out.println("Дискриминант равен 0, корень:" + root);
        } else if (isPositive(discriminant(a, b, c))) {
            double firstRoot = (((0 - b) - Math.sqrt(discriminant(a, b, c)))) / (2 * a);
            double secondRoot = (((0 - b) + Math.sqrt(discriminant(a, b, c))) / (2 * a));
            System.out.println("Дискриминант положительный, корни:" + firstRoot + "," + secondRoot);
        } else {
            System.out.println("Дискриминант отрицательный, корней нет");
        }
    }

    public static double discriminant(double qrtCoefficient, double lnrCoefficient, double constant) {
        return (lnrCoefficient * lnrCoefficient) - (4 * qrtCoefficient * constant);
    }

    public static boolean isZero(double discriminant) {
        return discriminant == 0;
    }

    public static boolean isPositive(double discriminant) {
        return discriminant > 0;
    }
}
