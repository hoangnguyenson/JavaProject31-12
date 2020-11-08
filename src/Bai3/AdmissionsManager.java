package Bai3;

import java.util.ArrayList;
import java.util.List;

public class AdmissionsManager {

    private List<Candidates> candidatesList;

    public AdmissionsManager() {
        this.candidatesList = new ArrayList<>();
    }

    public void addNewCandicates(Candidates candidates) {
        candidatesList.add(candidates);
    }

    public void showListInfoCandicates() {
        this.candidatesList.forEach(candidate -> System.out.println(candidate.toString()));
    }

    public Candidates searchById(String id) {
        return this.candidatesList.stream().filter(candidate -> candidate.getId().equals(id)).findFirst().orElse(null);
    }
}
