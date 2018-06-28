package lesson3.labs.prob2;

import java.util.List;

/**
 * Created by fissehaye on 6/28/18.
 */
public class Building {

    private double totalRent;
    private double maintenanceCost;
    private List<Apartment> apartments;

    public Building(List<Apartment> apartments, double maintenanceCost) {
        this.apartments = apartments;
        this.maintenanceCost = maintenanceCost;
    }


    public double calculateProfit() {

        for (Apartment apartment : apartments) {
            totalRent += apartment.getRent();
        }

        return totalRent - maintenanceCost;
    }
}
