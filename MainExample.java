

public class MainExample {

    public static void main(String[] args) {

        ExampleStatic ex1 = new ExampleStatic();
        ex1.staticExample = -1;
        ex1.nonStaticExample = 10;

        System.out.println("Round 1");
        System.out.println(ex1.staticExample + "\t" + ex1.nonStaticExample);

        ExampleStatic ex2 = new ExampleStatic();
        ex2.staticExample = -2;
        ex2.nonStaticExample = 20;

        System.out.println("Round 2");
        System.out.println(ex1.staticExample + "\t" + ex1.nonStaticExample);
        System.out.println(ex2.staticExample + "\t" + ex2.nonStaticExample);

        System.out.println(ExampleStatic.staticExample);
        System.out.println();
    }
}
