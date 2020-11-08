package Bai7;

public class Teacher {

    private double salary;
    private double bonus;
    private double penaty;
    private String name;
    private int age;
    private String id;

    public Teacher() {
    }

    public Teacher(double salary, double bonus, double penaty, double realSalary, String name, int age, String hometown, String id) {
        this.salary = salary;
        this.bonus = bonus;
        this.penaty = penaty;
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getPenaty() {
        return penaty;
    }

}
