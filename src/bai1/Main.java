package bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OfficeManager officeManager = new OfficeManager();
        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name: ");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Enginner");
                    System.out.println("Enter b: to insert Worker");
                    System.out.println("Enter c: to insert Staff");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = scanner.nextInt();
                            System.out.print("Enter sex: ");
                            scanner.nextLine();
                            String sex = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter branch: ");
                            String branch = scanner.nextLine();
                            Officer engineer = new Engineer(name, age, sex, address, branch);
                            officeManager.addNewOfficer(engineer);
                            System.out.println("Name: "     + engineer.getName());
                            System.out.println("Age: "      + engineer.getAge());
                            System.out.println("Sex: "      + engineer.getSex());
                            System.out.println("Address: "  + engineer.getAddress());
                            break;
                        }
                        case "b": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = scanner.nextInt();
                            System.out.print("Enter sex: ");
                            scanner.nextLine();
                            String sex = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter level: ");
                            int level = scanner.nextInt();
                            Officer worker = new Worker(name, age, sex, address, level);
                            officeManager.addNewOfficer(worker);
                            System.out.println("Name: "     + worker.getName());
                            System.out.println("Age: "      + worker.getAge());
                            System.out.println("Sex: "      + worker.getSex());
                            System.out.println("Address: "  + worker.getAddress());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int age = scanner.nextInt();
                            System.out.print("Enter sex: ");
                            scanner.nextLine();
                            String sex = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter task: ");
                            String task = scanner.nextLine();
                            Officer employee = new Employee(name, age, sex, address, task);
                            officeManager.addNewOfficer(employee);
                            System.out.println("Name: "     + employee.getName());
                            System.out.println("Age: "      + employee.getAge());
                            System.out.println("Sex: "      + employee.getSex());
                            System.out.println("Address: "  + employee.getAddress());
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    officeManager.searchOfficerByName(name).forEach(officer -> {
                        System.out.println("Name: "     + officer.getName());
                        System.out.println("Age: "      + officer.getAge());
                        System.out.println("Sex: "      + officer.getSex());
                        System.out.println("Address: "  + officer.getAddress());

                    });
                    break;
                }
                case "3": {
                    officeManager.showListInfoOfficer();
                    break;
                }
                case "4": {
                    officeManager.exit();
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }
}

// 30-30-30
//