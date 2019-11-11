package people.owner;

import people.ChatRoom;
import people.People;
import people.employee.Salesman;
import people.owner.command.Command;
import people.owner.command.ReturnOrder;
import people.owner.memento.Memento;
import prototype.Order;
import room.Accommodation;

import java.util.ArrayList;
import java.util.List;

public class Owner implements People {
    //鍒涘缓 owner 鐨勪竴涓璞�
    private volatile static Owner instance;
    public int money ;   //money鐢ㄦ潵瀹炵幇澶囧繕褰曟ā寮�
    private Memento memento;
    private Salesman salesman;
    private List<Command> commandList = new ArrayList<Command>();
    //璁╂瀯閫犲嚱鏁颁负 private锛岃繖鏍疯绫诲氨涓嶄細琚疄渚嬪寲
    private Owner() {
    }

    public static Owner getInstance() {
        if (instance == null) {
            synchronized (Owner.class) {
                if (instance == null) {
                    instance = new Owner();
                }
            }
        }
        return instance;
    }

    @Override
    public void work(Accommodation accommodation) {
        System.out.println("Owner Work");
    }

 
    @Override
    public void chat(String message) {
        ChatRoom.showMessage(this,message);
    }
    @Override
    public String getname() {
        return "Owner";
    }

    public void sale(Order order)
    {
        salesman.sale(order);
    }


    public void takCommand(Command command){
        commandList.add(command);
    }

    public void placeCommand(){
        for (Command command :  commandList) {
            command.execute();
        }
        commandList.clear();
    }

    public void setsales() {
        this.salesman=new Salesman();
    }
}
