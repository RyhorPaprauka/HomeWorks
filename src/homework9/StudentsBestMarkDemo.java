package homework9;

import java.util.*;

public class StudentsBestMarkDemo {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Андрей", "Чернов", 19, 7),
                new Student("Петр", "Петров", 18, 9.7),
                new Student("Иван", "Иванов", 21, 8.3),
                new Student("Владимир", "Краснов", 20, 9.7),
                new Student("Алексей", "Серов", 18, 6.1));

        System.out.println(getBestStudents(students));
    }

    public static List<Student> getBestStudents(List<Student> students) {

        int bestStudentIndex = 0;

        List<Student> bestStudents = new ArrayList<>();

        ListIterator<Student> iterator = students.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next().getMeanMark() == getBestMark(students)) {
                bestStudents.add(students.get(iterator.previousIndex()));
                iterator.next();
            }
        }
        return bestStudents;
    }

    public static double getBestMark(List<Student> students) {

        double bestMark = 0;

        ListIterator<Student> iterator = students.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next().getMeanMark() > bestMark) {
                bestMark = iterator.previous().getMeanMark();
                iterator.next();
            }
        }
        return bestMark;
    }
}

