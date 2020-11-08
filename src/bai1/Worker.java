package bai1;

public class Worker extends Officer {

    private Integer level;

    public Worker() {
    }

    public Worker(String name, Integer age, String sex, String address, Integer level) {
        super(name, age, sex, address);
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
