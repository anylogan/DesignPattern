package people.owner.memento;

import product.Order;

import java.util.ArrayList;

//记录货物状态
public class Memento {
    private ArrayList<Order> orderList;

    public Memento(ArrayList<Order> state){
        this.orderList = state;
    }
    public Memento(){
    }
    public Order getState(int index){
        return orderList.get(index);
    }
}
