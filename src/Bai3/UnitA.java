package Bai3;

public class UnitA extends Candidates {

    private static final String OBJECT_MATH = "OBJECT_MATH";
    private static final String OBJECT_PHYSICAL = "OBJECT_PHYSICAL";
    private static final String OBJECT_CHEMISTRY = "OBJECT_CHEMISTRY";

    public UnitA(){
    }

    public UnitA(String id, String name, String address, int priorityLevel) {
        super(id, name, address, priorityLevel);
    }

    @Override
    public String toString() {
        return "UnitA{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPriorityLevel() + ", Subject: " + OBJECT_MATH + " - " + OBJECT_PHYSICAL + " - " + OBJECT_CHEMISTRY +
                '}';
    }
}
