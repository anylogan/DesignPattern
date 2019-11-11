package people.employee;

import people.ChatRoom;
import people.People;
import people.owner.Owner;
import prototype.Order;
import room.Accommodation;

public class Salesman implements People {
    @Override
    public void work(Accommodation accommodation) {
        System.out.println("salesman sale");
    }
    @Override
    public void chat(String message) {
        ChatRoom.showMessage(this,message);
    }
    @Override
    public String getname() {
        return "Salesman";
    }

    public void sale(Order order)
    {
        Owner owner=Owner.getInstance();
        order.setNum(10);
        owner.money+=order.getNum();
        System.out.println("order has been sold");
    }
}
