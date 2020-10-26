import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pass: ");
        String passWord = sc.nextLine();

        int count = 0;
        int strLenght = 6;
        ArrayList al = new ArrayList();
        for (char c = 'a'; c <= 'z'; c++) {
            al.add(c);
        }
        ArrayList alCaps = new ArrayList();
        for (char c = 'A'; c <= 'Z'; c++) {
            alCaps.add(c);
        }

        ArrayList number = new ArrayList();
        for (char no = '0'; no <= '9'; no++){
            number.add(no);
        }
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        if (passWord.length() > 6){
            count += 1;
        }
        for (int i = 0; i < passWord.length(); i++){
           int value = passWord.charAt(i);
           if (al.indexOf(value) != -1){
               count += 1;
           }
           if (alCaps.indexOf(value) != -1){
               count+= 1;
           }
           if (specialCharactersString.indexOf(value) != -1){
               count += 1;
           }
           break;
        }
        System.out.println(count);
    }
}
