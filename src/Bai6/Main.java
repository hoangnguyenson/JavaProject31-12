package Bai6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        School school = new School();
        while (true) {
            System.out.println("Press 1 for insert new student:");
            System.out.println("Press 2 for show students 20 years old:");
            System.out.println("Press 3 for show students 23 years old and address DN:");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1": {
                    insertNewStudent(scanner, school);
                    break;
                }
                case "2": {
                    school.getStudent20YearOld();
                    break;
                }
                case "3": {
                    school.countStudent23YearOldInDN();
                    break;
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }

    public static void insertNewStudent(Scanner scanner, School school){
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter Adress");
        String adress = scanner.nextLine();
        Student student = new Student(name, age, adress);
        school.add(student);
    }
}
