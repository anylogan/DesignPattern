package people.employee;

import people.ChatRoom;
import people.People;
import animal.*;
public class Breeder implements People,AnimalVisitor {
    @Override
    public void work() {
        System.out.println("breeder bree");
    }

    @Override
    public String getname() {
        return "Breeder";
    }
    @Override
    public void chat(String message) {
        ChatRoom.showMessage(this,message);
    }

    @Override
    public void visit(Fish fish)
    {
        System.out.println("Display Fish");
    }
    @Override
    public void visit(Ox ox)
    {
        System.out.println("Display Ox");
    }
    @Override
    public void visit(Chicken chicken)
    {

        System.out.println("Display Chicken");
    }
}