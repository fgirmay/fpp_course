package prob2B;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fissehaye on 6/26/18.
 */
public class Order {

    private int orderNum;
    private List<OrderLine> orderLines = new ArrayList<>();

    public Order(int orderNum){
        this.orderNum = orderNum;
    }

    public void addOrderLines(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

}
