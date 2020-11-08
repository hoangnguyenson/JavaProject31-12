package Bai3;

public class Candidates {

    private String Id;
    private String Name;
    private String Address;
    private int priorityLevel;

    public Candidates(){
    }

    public Candidates(String id, String name, String address, int priorityLevel) {
        Id = id;
        Name = name;
        Address = address;
        this.priorityLevel = priorityLevel;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }
}
