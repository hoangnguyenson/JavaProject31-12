import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên n > 0: ");
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();

        System.out.println(fib(Integer.parseInt(value)));
    }

    static int fib(int n) {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
