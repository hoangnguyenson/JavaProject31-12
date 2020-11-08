package Bai4;

public class People {

   private String name;
   private int age;
   private String job;
   private String idNumber;

    public People() {
    }

    public People(String name, int age, String job, String idNumber) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.idNumber = idNumber;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
