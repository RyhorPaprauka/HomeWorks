package HW3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введите число дней");
        int days = d.nextInt();
        double sumFalls = 0;
        double maxFalls = 0;
        double falls = 0;

        for (int i = 1; i <= days; ++i) {
            Scanner r = new Scanner(System.in);
            System.out.println("Введите количество осадков в " + i + " день");
            falls = r.nextDouble();
            sumFalls += falls;
            if (falls > maxFalls) {
                maxFalls = falls;
            }
        }
        double meanFalls = sumFalls / days;
        System.out.println("Количество дней:" + days + " Сумма осадков:" + sumFalls + " Среднее кол-во осадков:" + meanFalls + " Максимальное кол-во осадков:" + maxFalls);
    }
}
