package lesson3.labs.prob3.betterway;

/**
 * Created by fissehaye on 6/28/18.
 */
public class Cylinder {

    public double radius;
    private double height;

    public double computeVolume() {
        return Math.PI * radius * radius * height;
    }
}
