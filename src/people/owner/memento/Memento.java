package people.owner.memento;

import people.owner.Owner;
import prototype.Order;

import java.util.ArrayList;

//记录货物状态
public class Memento {
    private volatile static Memento instance;

    public static Memento getInstance() {
        if (instance == null) {
            synchronized (Owner.class) {
                if (instance == null) {
                    instance = new Memento();
                }
            }
        }
        return instance;
    }
    private ArrayList<Order> orderList=new ArrayList<Order>();

    public Memento(ArrayList<Order> state){
        this.orderList = state;
    }
    public Memento(){
    }
    public void add(Order order)
    {
        orderList.add(order);
    }
    public Order getState(int index){
        return orderList.get(index);
    }
}
