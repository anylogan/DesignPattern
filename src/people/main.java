package people;

import people.employee.Farmer;
import people.owner.FarmerOwnerDecorator;
import people.owner.Owner;
import people.owner.command.ReturnOrder;
import people.owner.command.SubmitOrder;
import product.Order;

public class main {
    public static void main(String[] args)
    {

        //单例模式测试
        Owner owner=Owner.getInstance();
        owner.work();

        //工厂模式测试
        Employeefactory employeefactor= new Employeefactory();
        People chef=employeefactor.getcareer("chef");
        chef.work();

        //装饰器模式测试

        Farmer farmer= new Farmer();
        FarmerOwnerDecorator farmerowner=new FarmerOwnerDecorator(new Farmer());
        farmer.work();
        farmerowner.work();


        //vistor模式测试


        //Command模式测试
        Order od=new Order();
        SubmitOrder so=new SubmitOrder(od);
        ReturnOrder ro=new ReturnOrder(od);

        owner.takCommand(so);
        owner.takCommand(ro);

        owner.placeCommand();


        //备忘录模式测试

        //中介者模式测试
        farmer.chat("cao");
        owner.chat("sb");
        chef.chat("fjaskd");



        //代理模式测试
        Order order=new Order();
        owner.setsales();
        owner.sale(order);


    }
}
