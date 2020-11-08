package bai1;

public class Employee extends Officer {

    private String work;

    public Employee() {
    }

    public Employee(String name, Integer age, String sex, String address, String work) {
        super(name, age, sex, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
