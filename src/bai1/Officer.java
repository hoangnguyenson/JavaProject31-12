package bai1;

public class Officer {

    private String name;
    private Integer age;
    private String sex;
    private String address;

    public Officer() {  // No arg constructor,  default constructor, Note: always use
    }

    public Officer(String name, Integer age, String sex, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
