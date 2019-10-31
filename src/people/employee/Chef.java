package people.employee;

import people.ChatRoom;
import people.People;

public class Chef implements People {
    @Override
    public void work() {
        System.out.println("chef create food");
    }

    @Override
    public void chat(String message) {
        ChatRoom.showMessage(this,message);
    }
    @Override
    public String getname() {
        return "Chef";
    }

}