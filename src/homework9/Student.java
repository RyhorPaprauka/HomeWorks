package homework9;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private double meanMark;

    public Student(String firstName, String lastName, int age, double meanMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.meanMark = meanMark;
    }

    @Override
    public String toString() {
        return "Студент: " + firstName + " " + lastName + " " + " возраст: " + age + " средний балл: " + meanMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getMeanMark() {
        return meanMark;
    }
}
