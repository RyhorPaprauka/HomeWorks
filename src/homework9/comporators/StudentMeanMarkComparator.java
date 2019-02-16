package homework9.comporators;

import homework9.Student;

import java.util.Comparator;

public class StudentMeanMarkComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getMeanMark(), o2.getMeanMark());
    }
}
