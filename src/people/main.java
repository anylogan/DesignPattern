package people;

import people.employee.Breeder;
import people.employee.Farmer;
import people.employee.Salesman;
import people.owner.BreederOwnerDecorator;
import people.owner.FarmerOwnerDecorator;
import people.owner.Owner;
import people.owner.SalesmanOwnerDecorator;
import people.owner.command.ReturnOrder;
import people.owner.command.SubmitOrder;
import prototype.FishOrder;
import prototype.Order;
import room.Accommodation;
import room.ChickenCoop;
import room.Field;

public class main {
    public static void main(String[] args)
    {

        ChickenCoop chickenCoop=new ChickenCoop();
        Field field =new Field();
        Market market=new Market();
        //单例模式测试
        Owner owner=Owner.getInstance();
        owner.work(chickenCoop);
        System.out.println("\n");

        //工厂模式测试
        Employeefactory employeefactor= new Employeefactory();
        People breeder=employeefactor.getcareer("breeder");
        People farmer=employeefactor.getcareer("farmer");
        People salesman=employeefactor.getcareer("salesman");
        breeder.work(chickenCoop);
        farmer.work(field);
        salesman.work(market);
        System.out.println("\n");

        //装饰器模式测试
        FarmerOwnerDecorator farmerowner=new FarmerOwnerDecorator(new Farmer());
        farmer.work(field);
        farmerowner.work(field);

        BreederOwnerDecorator breederowner= new BreederOwnerDecorator((new Breeder()));
        breeder.work(chickenCoop);
        breederowner.work(chickenCoop);

        SalesmanOwnerDecorator salesmanOwnerDecorator=new SalesmanOwnerDecorator(new Salesman());
        salesman.work(field);
        salesmanOwnerDecorator.work(market);

        System.out.println("\n");


        //vistor模式测试
        ChickenCoop cc=new ChickenCoop();
        Breeder breeder1= new Breeder();
        breeder1.visit(cc);


        //Command模式测试
        Order od=new FishOrder("2");
        SubmitOrder so=new SubmitOrder(od);
        owner.takCommand(so);
        owner.placeCommand();


        //备忘录模式测试
        ReturnOrder ro=new ReturnOrder(0);
        owner.takCommand(ro);
        owner.placeCommand();


        //中介者模式测试
        owner.chat("I am your Owner");
        farmer.chat("I am a farmer");
        salesman.chat("I am a salesman");
        breeder.chat("I am a breeder");
        System.out.println("\n");



        //代理模式测试
        Order order=new FishOrder("1");
        owner.setsales();
        owner.sale(order);


    }
}
