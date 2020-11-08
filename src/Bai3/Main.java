package Bai3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdmissionsManager admissionsManager = new AdmissionsManager();
        while (true) {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert candidate");
            System.out.println("Enter 2: To show information of candidate: ");
            System.out.println("Enter 3: To search candidate by id");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    insertCandicate(admissionsManager, scanner);
                    break;
                }
                case "2": {
                    admissionsManager.showListInfoCandicates();
                    break;
                }
                case "3": {
                    searchCandidateById(admissionsManager, scanner);
                    break;
                }
                case "4": {
                    System.exit(1);
                    return;
                }
                default:
                    System.out.println("Invalid");
            }


        }
    }

    public static Candidates createCadidate(Scanner scanner, String cate) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Priotity > 0: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if (cate.equals("a")) {
            return new UnitA(id, name, address, priority);
        } else if (cate.equals("b")) {
            return new UnitB(id, name, address, priority);
        } else {
            return new UnitC(id, name, address, priority);
        }

    }

    public static void searchCandidateById(AdmissionsManager admissionsManager, Scanner scanner) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        Candidates candidate = admissionsManager.searchById(id);
        if (candidate == null) {
            System.out.println("Not found");
        } else {
            System.out.println(candidate.toString());
        }
    }

    public static void insertCandicate(AdmissionsManager admissionsManager, Scanner scanner) {
        System.out.println("Enter a: to insert Candidate A");
        System.out.println("Enter b: to insert Candidate B");
        System.out.println("Enter c: to insert Candidate C");
        String type = scanner.nextLine();
        switch (type) {
            case "a": {
                admissionsManager.addNewCandicates(createCadidate(scanner, "a"));
                break;

            }
            case "b": {
                admissionsManager.addNewCandicates(createCadidate(scanner, "b"));
                break;
            }
            case "c": {
                admissionsManager.addNewCandicates(createCadidate(scanner, "c"));
                break;
            }
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
