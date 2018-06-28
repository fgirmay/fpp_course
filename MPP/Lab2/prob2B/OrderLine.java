package prob2B;

/**
 * Created by fissehaye on 6/26/18.
 */
public class OrderLine {

    private Order order;

    public OrderLine(Order order) {
        this.order = order;
        this.order.addOrderLines(this);
    }

}
