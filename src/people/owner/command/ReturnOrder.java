package people.owner.command;

import product.Order;

public class ReturnOrder  implements Command {
    private Order order;

    public  ReturnOrder(Order order){

        this.order=order;
    }

    public void execute() {
      order.Return();
    }
}
