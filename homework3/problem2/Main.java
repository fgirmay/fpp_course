import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double width;
        double length;
        double rectangleArea;

        double base;
        double height;
        double triangleArea;

        double radius = 0;
        double circleArea;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");

        String shape = in.nextLine();

        switch(shape) {
            case "R":
                in = new Scanner(System.in);
                System.out.println("Enter the width of the Rectangle");
                width = Double.parseDouble(in.nextLine());

                in = new Scanner(System.in);
                System.out.println("Enter the length of the Rectangle");
                length = Double.parseDouble(in.nextLine());
                rectangleArea = new Rectangle(width, length).computeArea();
                System.out.println("The area of Rectangle is : " + rectangleArea);
                break;

            case "C":
                in = new Scanner(System.in);
                System.out.println("Enter the radius of the Triangle");
                radius = Double.parseDouble(in.nextLine());

                circleArea = new Circle(radius).computeArea();
                System.out.println("The area of Cirle is : " + circleArea);
                break;
            
            case "T":
                in = new Scanner(System.in);
                System.out.println("Enter the base of the Triangle");
                base = Double.parseDouble(in.nextLine());

                in = new Scanner(System.in);
                System.out.println("Enter the height of the Triangle");
                height = Double.parseDouble(in.nextLine());
                triangleArea = new Triangle(base, height).computeArea();
                System.out.println("The area of Triangle is : " + triangleArea);
                break;
        }
    }
}