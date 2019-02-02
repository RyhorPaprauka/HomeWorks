package HW2;

import java.util.Scanner;

public class Task1 {

    public static void main(String args[]) {
        Scanner date = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = date.nextInt();

        System.out.print("Введите месяц: ");
        int month = date.nextInt();

        System.out.print("Введите год: ");
        int year = date.nextInt();

        if ((day <= 0 || day >= 32) || (month <= 0 || month >= 13) || year < 0) {
            System.out.println("Дата введена некорректно");
        } else if (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("Дата введена некорректно");
        } else if (day > 29 && month == 2) {
            System.out.println("Дата введена некорректно");
        } else if (day > 28 && month == 2 && (year % 400 != 0) && (year % 4 == 0 && year % 100 == 0)) {
            System.out.println("Дата введена некорректно");
        } else if (day == 29 && month == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            day = 1;
            month++;
            System.out.println(dateFormat(day, month, year));
        } else if (day == 28 && month == 2 && (year % 400 != 0) && (year % 4 == 0 && year % 100 == 0)) {
            day = 1;
            month++;
            System.out.println(dateFormat(day, month, year));
        } else if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year++;
            System.out.println(dateFormat(day, month, year));
        } else if ((day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) || day == 31) {
            day = 1;
            month++;
            System.out.println(dateFormat(day, month, year));
        } else {
            day++;
            System.out.println(dateFormat(day, month, year));
        }
    }

    public static String dateFormat(int day, int month, int year) {
        return "Завтра: " + day + "." + month + "." + year;
    }
}
