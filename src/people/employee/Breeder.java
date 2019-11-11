package people.employee;

import room.Accommodation;
import room.ChickenCoop;
import people.ChatRoom;
import people.People;
public class Breeder implements People,AnimalVisitor {
    @Override
    public void work(Accommodation accommodation) {
        accommodation.feeding();
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
    public void visit(ChickenCoop chickenCoop)
    {
       chickenCoop.accept();
    }

}