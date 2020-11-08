package bai1;

import java.util.ArrayList;
import java.util.List;

public class OfficeManager {

    private final List<Officer> listOfficer;

    public OfficeManager() {
        this.listOfficer = new ArrayList<>();
    }

    public void addNewOfficer(Officer newOfficer) {
        listOfficer.add(newOfficer);
    }

    public List<Officer> searchOfficerByName(String nameOfficer) {
        List<Officer> listSearch = new ArrayList<>();
        for (Officer officer : listOfficer) {
            if (officer.getName().equals(nameOfficer)) {
                listSearch.add(officer);
            }
        }
        return listSearch;
    }

    public void showListInfoOfficer() {
        listOfficer.forEach(officer -> {
            System.out.println("Name: "     + officer.getName());
            System.out.println("Age: "      + officer.getAge());
            System.out.println("Sex: "      + officer.getSex());
            System.out.println("Address: "  + officer.getAddress());
        });
    }

    public void exit() {
        System.exit(1);
    }
}
