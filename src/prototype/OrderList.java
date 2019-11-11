package prototype;
import java.util.ArrayList;


public class OrderList {
    public ArrayList<ArrayList<Order>> orderList = new ArrayList<>();

    public OrderList(){
    	orderList.add(OrderFolds.ChickenOrderList);
    	orderList.add(OrderFolds.FishOrderList);

    }

    public Interator getIterator(){
        System.out.println("------------Iterator test in Product------------");
        return new Interator();
    }

    public class Interator{
        int index;

        public boolean hasNext(){
            if(index<orderList.size()){
                return true;
            }
            else return false;
        }

        public ArrayList<Order> next(){
            if(hasNext()){
                return orderList.get(index++);
            }
            return null;
        }
    }


}

