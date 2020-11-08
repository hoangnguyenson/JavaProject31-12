package Bai3;

public class UnitB extends Candidates{

    private static final String OBJECT_MATH = "OBJECT_MATH";
    private static final String OBJECT_BIOLOGICAL = "OBJECT_PBIOLOGICAL";
    private static final String OBJECT_CHEMISTRY = "OBJECT_CHEMISTRY";

    public UnitB(){
    }

    public UnitB(String id, String name, String address, int priorityLevel) {
        super(id, name, address, priorityLevel);
    }

    @Override
    public String toString() {
        return "UnitB{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPriorityLevel() + ", Subject: " + OBJECT_MATH + " - " + OBJECT_CHEMISTRY + " - " + OBJECT_BIOLOGICAL +
                '}';
    }
}
