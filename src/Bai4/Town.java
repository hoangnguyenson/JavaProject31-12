package Bai4;

import java.util.ArrayList;
import java.util.List;

public class Town {

    private final List<Family> familyList = new ArrayList<>();

    public Town() {
    }

    @Override
    public String toString() {
        return "Town{" +
                "familyList=" + familyList +
                '}';
    }

    public void addFamily(Family family) {
        this.familyList.add(family);
    }

    public List<Family> getFamilyList() {
        return familyList;
    }
}
