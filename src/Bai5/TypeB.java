package Bai5;

public class TypeB extends Room{
    public TypeB() {
        super("B", 300);
    }

    @Override
    public String toString() {
        return "TypeB{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
