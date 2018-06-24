package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by fissehaye on 6/19/18.
 */
public class TopCity {

    private String name;
    private double population;

    public double getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public TopCity(String name, double population) {

        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {

        String temp = String.format("%10.0f", this.population);
        return name + "Population:" + temp + "million";

    }

}


class DataClass {

    public final static List<TopCity> USACITY = new ArrayList();

    public static void main(String[] args) {
        USACITY.add(new TopCity("New York", 8_174_159));
        USACITY.add(new TopCity("Los Angeles", 3_174_159));
        USACITY.add(new TopCity("Chicago", 2_174_159));
        USACITY.add(new TopCity("Housten", 9_174_159));
        USACITY.add(new TopCity("Philadelphia", 1_174_159));
        USACITY.add(new TopCity("Phoenix", 7_174_159));
        USACITY.add(new TopCity("San Antonio", 5_174_159));

        sort(USACITY, Type.BYNAME);
        sort(USACITY, Type.BYPOP);
    }

    public static void sort(List<TopCity> list, Type type) {

        Collections.sort(list, new CityComparator(type));
        System.out.println(list);
    }

}


