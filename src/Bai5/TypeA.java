package Bai5;

public class TypeA extends Room {

    public TypeA() {
        super("A", 500);
    }

    @Override
    public String toString() {
        return "RoomA{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
