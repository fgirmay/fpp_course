package lesson3.labs.prob3.badway;

/**
 * Created by fissehaye on 6/28/18.
 */
public class Cylinder {

    private double radius;
    public double height;

    public double getRadius() {
        return radius;
    }

    public double computeVolume() {
        return Math.PI * radius * radius * height;
    }
}
