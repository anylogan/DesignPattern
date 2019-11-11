package people.owner.command;

import people.owner.Owner;
import people.owner.memento.Memento;
import prototype.Order;

public class ReturnOrder  implements Command {
    public  int index;

    public  ReturnOrder(int index){

        this.index=index;
    }

    public void execute()
    {
        Memento memento=Memento.getInstance();
        Order o=memento.getState(index);
        Owner owner=Owner.getInstance();
        owner.money-=o.getNum();
        System.out.println("ReturnOrder is successfully");
    }
}
