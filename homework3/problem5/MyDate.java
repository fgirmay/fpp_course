import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyDate {

    private Scanner in;
    private LocalDate date;
    private int month;
    private String monthText;
    private int day;
    private int dayOfYear;
    private int year;
    private String choice;
    private boolean repeat = true;

    private String dateOutput1;
    private String dateOutput2;
    private String dateOutput3;

    private static final String datePattern1 = "MM/dd/yyyy";
    private static final String datePattern2 = "MMMM dd,yyyy";
    private static final String datePattern3 = "DDD YYYY";

    public String datePattern;

    public static void main(String[] args) {

        MyDate myDate = new MyDate();

        while (myDate.repeat) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter 1 for format: MM/DD/YYYY");
            System.out.println("Enter 2 for format: Month DD, YYYY");
            System.out.println("Enter 3 for format: DDD YYYY");
            System.out.println("Enter 4 to exit");
            System.out.println();
            System.out.println("Choose your Choice :");
            myDate.choice = input.nextLine();

            myDate.formatMyDate(myDate.choice);

            if (myDate.repeat) {
                myDate.in = new Scanner(System.in);
                System.out.println("Do you want to Continue :");
                myDate.choice = myDate.in.nextLine();

                if (!myDate.choice.trim().equals("y")) {
                    myDate.repeat = false;
                }
            }
        }

    }


    public void formatMyDate(String choice) {

        System.out.println("Choice: " + choice);

        switch(choice) {
            case "1":
                in = new Scanner(System.in);
                System.out.println("Enter Month:");
                this.month = Integer.parseInt(in.nextLine());

                in = new Scanner(System.in);
                System.out.println("Enter Day:");
                this.day = Integer.parseInt(in.nextLine());

                in = new Scanner(System.in);
                System.out.print("Enter Year:");
                this.year = Integer.parseInt(in.nextLine());

                this.date = LocalDate.of(this.year, this.month, this.day);

                this.dateOutput1 = localDateAsString(this.date, this.datePattern1);
                System.out.println(this.datePattern1 + ": " + this.dateOutput1);

                this.dateOutput2 = localDateAsString(this.date, this.datePattern2);
                System.out.println(this.datePattern2 + ": " + this.dateOutput2);

                this.dateOutput3 = localDateAsString(this.date, this.datePattern3);
                System.out.println(this.datePattern3 + ": " + this.dateOutput3);

                break;

            case "2":
                in = new Scanner(System.in);
                System.out.println("Enter Month in text:");
                this.monthText = in.nextLine();

                in = new Scanner(System.in);
                System.out.println("Enter Day:");
                this.day = Integer.parseInt(in.nextLine());

                in = new Scanner(System.in);
                System.out.print("Enter Year:");
                this.year = Integer.parseInt(in.nextLine());

                this.date = LocalDate.of(this.year, Month.valueOf(this.monthText.toUpperCase()), this.day);

                this.dateOutput1 = localDateAsString(this.date, this.datePattern1);
                System.out.println(this.datePattern1 + ": " + this.dateOutput1);

                this.dateOutput2 = localDateAsString(this.date, this.datePattern2);
                System.out.println(this.datePattern2 + ": " + this.dateOutput2);

                this.dateOutput3 = localDateAsString(this.date, this.datePattern3);
                System.out.println(this.datePattern3 + ": " + this.dateOutput3);

                break;

            case "3":
                in = new Scanner(System.in);
                System.out.println("Enter Day of Year:");
                this.dayOfYear = Integer.parseInt(in.nextLine());

                in = new Scanner(System.in);
                System.out.print("Enter Year:");
                this.year = Integer.parseInt(in.nextLine());

                this.date = LocalDate.ofYearDay(this.year, this.dayOfYear);

                this.dateOutput1 = localDateAsString(this.date, this.datePattern1);
                System.out.println(this.datePattern1 + ": " + this.dateOutput1);

                this.dateOutput2 = localDateAsString(this.date, this.datePattern2);
                System.out.println(this.datePattern2 + ": " + this.dateOutput2);

                this.dateOutput3 = localDateAsString(this.date, this.datePattern3);
                System.out.println(this.datePattern3 + ": " + this.dateOutput3);

                break;
            default:
                this.repeat = false;
                break;
        }
    }

    public static String localDateAsString(LocalDate date, String datePattern) {
        return date.format(DateTimeFormatter.ofPattern(datePattern));
    }

}