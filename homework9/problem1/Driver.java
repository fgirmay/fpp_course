package problem1;

import java.util.Arrays;

/**
 * Created by fissehaye on 6/14/18.
 */
public class Driver {

    public static void main(String[] args) {

        ArrayQueueImpl aqi = new ArrayQueueImpl(10);
        aqi.enqueue(7);
        aqi.enqueue(9);
        aqi.enqueue(3);
        aqi.enqueue(8);
        aqi.enqueue(4);
        aqi.enqueue(6);
        aqi.enqueue(3);
        aqi.enqueue(5);
        aqi.enqueue(2);

        aqi.enqueue(16);
        aqi.enqueue(13);
        aqi.enqueue(15);
        aqi.enqueue(12);

        System.out.println("The first size is " + aqi.size());
        System.out.println(aqi.dequeue());
        System.out.println(aqi.dequeue());
        System.out.println("The last size is " + aqi.size());
        aqi.enqueue(24);
        System.out.println(aqi.dequeue());
        System.out.println("The final size is " + aqi.size());

    }
}
