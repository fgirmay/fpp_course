package problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by fissehaye on 6/12/18.
 */
public class Main {

    static List<Marketing> marketingList = new ArrayList<>();

    public static void main(String[] args) {

        Main main = new Main();

        marketingList = new ArrayList<>();

        Marketing marketing1 = new Marketing("Fissehaye", "Macbook Pro", 2499);
        Marketing marketing2 = new Marketing("Henok", "iPhone X", 999.99);
        Marketing marketing3 = new Marketing("Alem", "Dell Laptop", 699.99);
        Marketing marketing4 = new Marketing("Aman", "HP Laptop", 599.99);
        Marketing marketing5 = new Marketing("Teddy", "Surface Laptop", 1200);

        marketingList.add(marketing1);
        marketingList.add(marketing2);
        marketingList.add(marketing3);
        marketingList.add(marketing4);
        marketingList.add(marketing5);

        System.out.println("The size of the list before deletion is " + marketingList.size());

        marketingList.remove(2);

        System.out.println("The size of the list after removing the item in the second index is " + marketingList.size());

        Collections.sort(marketingList, new MarketingComparator());

        System.out.println(main);

        List<Marketing> result = listMoreThan1000(marketingList);

        System.out.println(result);

    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        //Implement body
        List<Marketing> result = new ArrayList<>();

        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000) {
                result.add(marketing);
            }
        }

        Collections.sort(result, new MarketingComparator());
        System.out.println("The list is " + result);
        return result;
    }

    @Override
    public String toString() {

        String result = "{ ";

        for (Marketing marketing : marketingList) {

            result += "[" + marketing.getEmployeeName() + ","+marketing.getProductName() + "," + marketing.getSalesAmount() + "]";
        }

        result += " }";

        return result;
    }
}
