package people.employee;

import people.ChatRoom;
import people.People;
import product.Order;

public class Salesman implements People {
    @Override
    public void work() {
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
        System.out.println("把产品卖出去了");
    }
}
