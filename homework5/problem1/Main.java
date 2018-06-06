package problem1;

/**
 * Created by fissehaye on 6/4/18.
 */
public class Main {

    private static Shape[] shapes;

    public static void main(String[] args) {

        Main main = new Main();

        Shape cirle1 = new Circle("Black", 3); // 28.2743
        Shape rectangle1 = new Rectangle("Blue", 4, 6); // 24
        Rectangle rectangle2 = new Rectangle("Red", 3, 5); // 15
        Square square1 = new Square("Green", 4); // 16
        Circle circle2 = new Circle("White", 6); // 113.097

        main.shapes = new Shape[5];
        main.shapes[0] = cirle1;
        main.shapes[1] = rectangle1;
        main.shapes[2] = rectangle2;
        main.shapes[3] = square1;
        main.shapes[4] = circle2;

        printTotal(shapes);


    }

    public static void printTotal(Shape[] shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        System.out.println("The total area of all shapes combined is " + totalArea);
    }
}
