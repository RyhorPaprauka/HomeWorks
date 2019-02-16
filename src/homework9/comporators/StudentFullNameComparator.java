package homework9.comporators;

import homework9.Student;

import java.util.Comparator;

public class StudentFullNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getLastName().compareTo(o2.getLastName());
        if (result == 0) {
            result = o1.getFirstName().compareTo(o2.getFirstName());
        }
        return result;
    }
}
