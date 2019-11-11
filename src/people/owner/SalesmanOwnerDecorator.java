package people.owner;

import people.People;
import room.Accommodation;
import sun.java2d.pipe.hw.AccelDeviceEventListener;

public class SalesmanOwnerDecorator extends OwnerDecorator{
    public SalesmanOwnerDecorator(People decoratorPeople)
    {
        super(decoratorPeople);
    }

    @Override
    public  void work(Accommodation accommodation)
    {
        decoratorowner.work(accommodation);
        doSalesmanWork(decoratorowner);

    }

    @Override
    public void chat(String message) {

    }

    @Override
    public String getname() {
        return null;
    }

    private void doSalesmanWork(People decoratorowner) {
        System.out.println("销售");
    }
}


