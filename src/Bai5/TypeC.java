package Bai5;

public class TypeC extends Room {

    public TypeC() {
        super("C", 100);
    }

    @Override
    public String toString() {
        return "TypeC{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
