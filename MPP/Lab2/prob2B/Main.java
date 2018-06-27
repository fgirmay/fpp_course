package prob2B;

/**
 * Created by fissehaye on 6/26/18.
 */
public class Main {

    public static void main(String[] args) {

        int orderId = 1;

        Order order = new Order(orderId);

        OrderLine orderLine1 = new OrderLine(order);
        OrderLine orderLine2 = new OrderLine(order);
        OrderLine orderLine3 = new OrderLine(order);

        order.addOrderLines(orderLine1);
        order.addOrderLines(orderLine2);
        order.addOrderLines(orderLine3);

    }
}
