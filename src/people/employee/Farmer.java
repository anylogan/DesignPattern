package people.employee;


import people.ChatRoom;
import people.People;

public class Farmer implements People {
    @Override
    public void work() {
        System.out.println("farmer land");
    }
    @Override
    public void chat(String message) {
        ChatRoom.showMessage(this,message);
    }
    @Override
    public String getname() {
        return "Farmer";
    }
}