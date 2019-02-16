package homework9;

import homework9.comporators.StudentAgeComparator;
import homework9.comporators.StudentFullNameComparator;
import homework9.comporators.StudentMeanMarkComparator;

import java.util.Arrays;
import java.util.List;

public class StudentComparatorDemo {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Андрей", "Иванов", 19, 7),
                new Student("Петр", "Иванов", 18, 9.7),
                new Student("Иван", "Петров", 21, 8.3),
                new Student("Владимир", "Краснов", 20, 9.7),
                new Student("Владимир", "Краснов", 21, 9.7),
                new Student("Алексей", "Серов", 18, 6.1),
                new Student("Георгий", "Белов", 18, 6.1),
                new Student("Георгий", "Белов", 21, 7),
                new Student("Георгий", "Белов", 20, 9));


        students.sort(new StudentFullNameComparator()
                .thenComparing(new StudentMeanMarkComparator().reversed())
                .thenComparing(new StudentAgeComparator()));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
