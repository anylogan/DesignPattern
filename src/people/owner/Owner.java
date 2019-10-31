package people.owner;

import people.ChatRoom;
import people.People;
import people.employee.Salesman;
import people.owner.command.Command;
import people.owner.command.ReturnOrder;
import people.owner.memento.Memento;
import product.Order;

import java.util.ArrayList;
import java.util.List;

public class Owner implements People {
    //创建 owner 的一个对象
    private volatile static Owner instance;
    private int money ;   //money用来实现备忘录模式
    private Memento memento;
    private Salesman salesman;
    private List<Command> commandList = new ArrayList<Command>();
    //让构造函数为 private，这样该类就不会被实例化
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
    public void work() {
        System.out.println("发工资什么的");
    }

    public void returnOrder(int ordernumber)   //
    {
        //产生一个ReturnOrder命令
        Order order=memento.getState(ordernumber);

        ReturnOrder returnorder=new ReturnOrder(order);  //创建退货命令

        //计算钱
        //money加上去
        //仓库里把货物放进去
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
