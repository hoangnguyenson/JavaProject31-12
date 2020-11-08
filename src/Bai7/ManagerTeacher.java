package Bai7;

import java.util.ArrayList;
import java.util.List;

public class ManagerTeacher {

    private final List<Teacher> teachers;

    public ManagerTeacher() {
        this.teachers = new ArrayList<>();
    }

    public void add(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void deleteById(String id) {
        Teacher teacher = this.teachers.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher == null) {
            return;
        }
        this.teachers.remove(teacher);
    }

    public double getSalary(String id) {
        Teacher teacher = this.teachers.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher == null) {
            return 0;
        }
        return teacher.getSalary() + teacher.getBonus() + teacher.getPenaty();
    }
}
