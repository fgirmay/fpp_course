package lesson3.labs.prob3.betterway;

/**
 * Created by fissehaye on 6/28/18.
 */
public class Circle {

    private Cylinder cylinder;

    public double computeArea() {
        return Math.PI * cylinder.radius * cylinder.radius;
    }
}
