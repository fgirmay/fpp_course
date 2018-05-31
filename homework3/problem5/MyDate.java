public class MyDate {

/*
Enter 1 for format: MM/DD/YYYY 
Enter 2 for format: Month DD, YYYY 
Enter 3 for format: DDD YYYY
Enter 4 to exit

Choose your Choice :
1
Choice: 1 
Enter Month: 12
Enter Day: 28
Enter Year:
2015
*/

    public static void main(String[] args) {

        String choice = "1";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for format: MM/DD/YYYY");
        System.out.println("Enter 2 for format: Month DD, YYYY");
        System.out.println("Enter 3 for format: DDD YYYY");
        System.out.println("Enter 4 to exit");
        System.out.println();
        System.out.println("Choose your Choice :");

        choice = in.nextLine();
        formatMyDate(choice);
    }

    public static void formatMyDate(String choice) {

        System.out.println("Choice: " + choice);

        switch(choice) {
            case "1":

                Enter Month: 12
                Enter Day: 28
                Enter Year:

                in = new Scanner(System.in);
                System.out.print("Enter Month:");
                width = Double.parseDouble(in.nextLine());

                in = new Scanner(System.in);
                System.out.println("Enter the length of the Rectangle");
                length = Double.parseDouble(in.nextLine());
                rectangleArea = new Rectangle(width, length).computeArea();
                System.out.println("The area of Rectangle is : " + rectangleArea);
                break;

            case "2":
                in = new Scanner(System.in);
                System.out.println("Enter the radius of the Triangle");
                radius = Double.parseDouble(in.nextLine());

                circleArea = new Circle(radius).computeArea();
                System.out.println("The area of Cirle is : " + circleArea);
                break;
            
            case "3":
                in = new Scanner(System.in);
                System.out.println("Enter the base of the Triangle");
                base = Double.parseDouble(in.nextLine());

                in = new Scanner(System.in);
                System.out.println("Enter the height of the Triangle");
                height = Double.parseDouble(in.nextLine());
                triangleArea = new Triangle(base, height).computeArea();
                System.out.println("The area of Triangle is : " + triangleArea);
                break;
            default:
                break;
        }
    }

}