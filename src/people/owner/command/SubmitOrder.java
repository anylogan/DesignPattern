package people.owner.command;

import people.owner.Owner;
import people.owner.memento.Memento;
import prototype.Order;
public class SubmitOrder implements Command{
    private Order order;

    public SubmitOrder(Order order){
        this.order = order;
    }
    @Override
    public void execute()
    {
       order.setNum(10);
       Owner owner= Owner.getInstance();
       owner.money+=order.getNum();
       System.out.println("SubmitOrder is successfully");
       //加到备忘录中
        Memento memento=Memento.getInstance();
        memento.add(order);

    }
}
