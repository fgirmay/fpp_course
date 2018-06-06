package problem1;

/**
 * Created by fissehaye on 6/4/18.
 */
public abstract class Shape {

    String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
