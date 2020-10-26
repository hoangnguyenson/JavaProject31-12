import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex07 {
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
        for (char no = '0'; no <= '9'; no++) {
            number.add(no);
        }
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        char[] charArray = specialCharactersString.toCharArray();
        if (passWord.length() > strLenght) {
            count += 1;
        }
        for (int i = 0; i < passWord.length(); i++) {
            char value = passWord.charAt(i);

            A:
            for (Object o : al) {
                if (value == (char) o) {
                    count += 1;
                    break A;
                }
            }

            B:
            for (Object alCap : alCaps) {
                if (value == (char) alCap) {
                    count += 1;
                    break B;
                }
            }

            C:
            for (Object o : number) {
                if (value == (char) o) {
                    count += 1;
                    break C;
                }
            }

            D:
            for (char c : charArray) {
                if (value == c) {
                    count += 1;
                    break D;
                }
            }
        }
        System.out.println(count);
    }
}
