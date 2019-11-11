package people.employee;


import people.ChatRoom;
import people.People;
import room.Accommodation;

public class Farmer implements People {
    @Override
    public void work(Accommodation accommodation) {
        accommodation.watering();
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