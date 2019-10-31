package people.owner.command;

import product.Order;

public class SubmitOrder implements Command{
    private Order order;

    public SubmitOrder(Order order){
        this.order = order;
    }
    @Override
    public void execute() {
       order.sell();
    }
}
