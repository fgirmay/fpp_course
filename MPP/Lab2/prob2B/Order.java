package prob2B;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fissehaye on 6/26/18.
 */
public class Order {

    private int orderNum;
    private List<OrderLine> orderLines;

    public Order(int orderNum){
        this.orderNum = orderNum;
        this.orderLines = new ArrayList<>();
    }

}
