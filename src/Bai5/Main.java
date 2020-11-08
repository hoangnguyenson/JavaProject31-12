package Bai5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true) {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert person for rent");
            System.out.println("Enter 2: To remove person by idNumber");
            System.out.println("Enter 3: To calculator price by idNumber");
            System.out.println("Enter 4: To show infor");
            System.out.println("Enter 5: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    insertPersonFroRent(scanner, hotel);
                    break;
                }
                case "2": {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    hotel.delete(passport);
                    break;
                }
                case "3": {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    System.out.println("Price: " + hotel.calculator(passport));
                    break;
                }
                case "4": {
                    hotel.show();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }

    public static void insertPersonFroRent(Scanner scanner, Hotel hotel) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter passport: ");
        String passport = scanner.nextLine();
        System.out.println("Choise a to rent room type A");
        System.out.println("Choise b to rent room type B");
        System.out.println("Choise c to rent room type C");
        String choise = scanner.nextLine();
        Room room;
        switch (choise) {
            case "a":
                room = new TypeA();
                break;
            case "b":
                room = new TypeB();
                break;
            case "c":
                room = new TypeC();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choise);
        }
        System.out.print("Enter number day for rent: ");
        int numberRent = scanner.nextInt();
        Renter renter = new Renter(name, age, passport, room, numberRent);
        hotel.add(renter);
        scanner.nextLine();
    }
}
