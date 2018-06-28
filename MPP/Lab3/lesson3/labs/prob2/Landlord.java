package lesson3.labs.prob2;

import java.util.List;

/**
 * Created by fissehaye on 6/28/18.
 */
public class Landlord {

    private double monthlyProfit;
    private List<Building> buildings;

    public Landlord(List<Building> buildings) {
        this.buildings = buildings;
    }

    public double calculateTotalProfit(){

        for (Building building : buildings) {

            monthlyProfit += building.calculateProfit();
        }

        return monthlyProfit;
    }
}
