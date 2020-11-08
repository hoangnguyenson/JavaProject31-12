package Bai5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private final List<Renter> renterList;

    public Hotel() {
        renterList = new ArrayList<>();
    }

    public void add(Renter renter) {
        this.renterList.add(renter);
    }

    public boolean delete(String passport) {
        Renter renter = this.renterList.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (renter == null) {
            return false;
        } else {
            this.renterList.remove(renter);
            return true;
        }
    }

    public int calculator(String idNumber) {
        Renter renter = this.renterList.stream().filter(p -> p.getPassport().equals(idNumber)).findFirst().orElse(null);
        if (renter == null) {
            return 0;
        }
        return renter.getRoom().getPrice() * renter.getNumberRent();
    }

    public void show() {
        this.renterList.forEach(p -> System.out.println(p.toString()));
    }

}
