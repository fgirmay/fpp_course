package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fissehaye on 6/28/18.
 */
public class Main {

    public static void main(String[] args) {

        List<Apartment> apartments1 = new ArrayList<>();
        List<Apartment> apartments2 = new ArrayList<>();
        List<Building> buildings = new ArrayList<>();


        Apartment apartment1 = new Apartment(600);
        Apartment apartment2 = new Apartment(700);
        apartments1.add(apartment1);
        apartments1.add(apartment2);

        Apartment apartment3 = new Apartment(1300);
        Apartment apartment4 = new Apartment(900);
        apartments2.add(apartment3);
        apartments2.add(apartment4);

        Building building1 = new Building(apartments1, 200);
        Building building2 = new Building(apartments2, 350);
        buildings.add(building1);
        buildings.add(building2);

        Landlord landlord = new Landlord(buildings);

        System.out.println("The total monthly profit of the landlord is " + landlord.calculateTotalProfit());



    }

}
