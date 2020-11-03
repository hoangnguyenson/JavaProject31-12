import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountStrengthFactor {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pass: ");
        String passWord = sc.nextLine();

        int count = 0;
        int strLength = 6;
        List<Character> al = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            al.add(c);
        }
        List<Character> alCaps = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            alCaps.add(c);
        }

        List<Character> number = new ArrayList<>();
        for (char no = '0'; no <= '9'; no++) {
            number.add(no);
        }
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        char[] charArray = specialCharactersString.toCharArray();
        if (passWord.length() > strLength) {
            count += 1;
        }
        A:
        for (int i = 0; i < passWord.length(); i++) {
            char value = passWord.charAt(i);
            for (Object o : al) {
                if (value == (char) o) {
                    count += 1;
                    break A;
                }
            }
        }
        B:
        for (int i = 0; i < passWord.length(); i++) {
            char value = passWord.charAt(i);
            for (Object alCap : alCaps) {
                if (value == (char) alCap) {
                    count += 1;
                    break B;
                }
            }
        }
        C:
        for (int i = 0; i < passWord.length(); i++) {
            char value = passWord.charAt(i);
            for (Object o : number) {
                if (value == (char) o) {
                    count += 1;
                    break C;
                }
            }
        }
        D:
        for (int i = 0; i < passWord.length(); i++) {
            char value = passWord.charAt(i);
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
