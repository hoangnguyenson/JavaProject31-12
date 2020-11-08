package Bai7;

import Bai2.Magazine;
import Bai6.School;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerTeacher managerTeacher = new ManagerTeacher();
        while (true) {
            System.out.println("Enter 1 to insert new teacher:");
            System.out.println("Enter 2 to remove teacher:");
            System.out.println("Enter 3 to get Salary teacher by id:");
            System.out.println("Enter 4 to exit:");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1": {
                    insertNewTeacher(scanner, managerTeacher);
                    break;
                }
                case "2": {
                    System.out.println("Enter Id teacher:");
                    String id = scanner.nextLine();
                    managerTeacher.deleteById(id);
                    break;
                }
                case "3": {
                    System.out.println("Enter Id");
                    String id = scanner.nextLine();
                    System.out.println("Real Salary " + managerTeacher.getSalary(id));
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }

    private static void insertNewTeacher(Scanner scanner, ManagerTeacher managerTeacher){
        System.out.print("Enter Name Teacher: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age:");
        int age = scanner.nextInt();
        System.out.print("Enter HomeTown: ");
        scanner.nextLine();

        String homeTown = scanner.nextLine();
        System.out.print("Enter Id: ");
        String id = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter Bonus:");
        double bonus = scanner.nextDouble();
        System.out.println("Enter Penaty");
        double panaty = scanner.nextDouble();
        double realSalary = salary + bonus - panaty;
        Teacher teacher = new Teacher(salary, bonus, panaty, realSalary, name, age, homeTown, id);
        managerTeacher.add(teacher);
    }
}
