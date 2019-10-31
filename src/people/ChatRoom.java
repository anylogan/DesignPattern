package people;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(People user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getname() +"] : " + message);
    }
}