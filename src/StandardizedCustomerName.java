import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StandardizedCustomerName {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String customerName = sc.nextLine();
        String cusName = customerName.trim().replaceAll(" +", " ");
        String[] arrName = cusName.split(" ");
        String customerNewName = "";
        for (String i : arrName){
            customerNewName = customerNewName + i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase();
            customerNewName = customerNewName + " ";
        }
        System.out.println("Format Customer Name: " + customerNewName.trim());
    }
}
