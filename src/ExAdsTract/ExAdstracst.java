package ExAdsTract;

public class ExAdstracst {

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("ExAdsTract.Programmer salary is: " + p.salary);
        System.out.println("Bonus of ExAdsTract.Programmer is: " + p.bonus);
    }

    static class Employee {
        float salary = 1000;
    }

    static class Programmer extends Employee {
        int bonus = 150;
    }
}


