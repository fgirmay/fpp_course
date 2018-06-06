package problem1;

/**
 * Created by fissehaye on 6/4/18.
 */
public class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
