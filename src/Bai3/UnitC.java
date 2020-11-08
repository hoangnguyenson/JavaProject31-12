package Bai3;

public class UnitC extends Candidates {

    private static final String OBJECT_LITERARY = "OBJECT_LITERARY";
    private static final String OBJECT_HISTORY = "OBJECT_HISTORY";
    private static final String OBJECT_GEOGRAPHY = "OBJECT_GEOGRAPHY";

    public UnitC(){
    }

    public UnitC(String id, String name, String address, int priorityLevel) {
        super(id, name, address, priorityLevel);
    }

    @Override
    public String toString() {
        return "UnitC{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPriorityLevel() + ", Subject: " + OBJECT_LITERARY + " - " + OBJECT_HISTORY + " - " + OBJECT_GEOGRAPHY +
                '}';

    }
}
