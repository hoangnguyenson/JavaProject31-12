package Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Town town = new Town();
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter address:");
            scanner.nextLine();
            String address = scanner.nextLine();
            List<People> people = new ArrayList<>();
            System.out.println("Enter number person");
            int number = scanner.nextInt();
            for (int j = 0; j < number; j++) {
                System.out.println("Enter name people " + j);
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Enter age people " + j);
                int age = scanner.nextInt();
                System.out.println("Enter idNumber people " + j);
                scanner.nextLine();
                String idNumber = scanner.nextLine();
                System.out.println("Enter job people " + j);
                String job = scanner.nextLine();
                people.add(new People(name, age, job, idNumber));
            }
            town.addFamily(new Family(number, address, people));
            System.out.println(town.getFamilyList().get(i));
        }
    }
}
