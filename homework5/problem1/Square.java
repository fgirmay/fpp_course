package problem1;

/**
 * Created by fissehaye on 6/4/18.
 */
public class Square extends Rectangle {

    double side;

    public Square(String color, double side) {
        super(color, side, side);
        this.side = side;
        this.height = side;
        this.width = side;
    }
}
