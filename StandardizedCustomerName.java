import java.util.Scanner;

public class StandardizedCustomerName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String customerName = sc.nextLine();
        String cusName = customerName.trim().replaceAll(" +", " ");
        String[] arrName = cusName.split(" ");
        StringBuilder customerNewName = new StringBuilder();
        for (String i : arrName) {
            customerNewName.append(i.substring(0, 1).toUpperCase()).append(i.substring(1).toLowerCase());
            customerNewName.append(" ");
        }
        System.out.println("Format Customer Name: " + customerNewName.toString().trim());
    }
}
