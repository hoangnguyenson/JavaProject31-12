package Bai6;

import java.util.ArrayList;
import java.util.List;

public class School {

    private final List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public void getStudent20YearOld() {
        this.students.stream().filter(student -> student.getAge() == 20).forEach(student -> System.out.println(student.toString()));
    }

    public void countStudent23YearOldInDN() {
        this.students.stream().filter(student -> student.getAge() == 23 && student.getAddress().equals("DN")).forEach(student -> System.out.println(student.toString()));
    }

}
