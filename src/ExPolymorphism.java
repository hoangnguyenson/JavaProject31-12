public class ExPolymorphism extends Bike {

    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String[] args) {
        Bike b = new ExPolymorphism();// upcasting
        b.run();
    }
}

class Bike {
    void run() {
        System.out.println("running");
    }
}