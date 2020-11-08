package Bai4;

import java.util.List;

public class Family {

    private int numberPeople;
    private String apartmentNumber;
    private List<People> peopleList;

    public Family() {
    }

    public Family(int numberPeople, String apartmentNumber, List<People> peopleList) {
        this.numberPeople = numberPeople;
        this.apartmentNumber = apartmentNumber;
        this.peopleList = peopleList;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    @Override
    public String toString() {
        return "Family{" +
                "numberPeople=" + numberPeople +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", peopleList=" + peopleList +
                '}';
    }
}
