package people.owner;

import people.People;
import room.Accommodation;

public class FarmerOwnerDecorator extends OwnerDecorator {
    public FarmerOwnerDecorator(People decoratorPeople)
    {
        super(decoratorPeople);
    }

    @Override
    public  void work(Accommodation accommodation)
    {
        decoratorowner.work(accommodation);
        doFarmerWork(decoratorowner);

    }

    @Override
    public void chat(String message) {

    }

    @Override
    public String getname() {
        return null;
    }

    private void doFarmerWork(People decoratorowner) {
        System.out.println("除草");
    }

}
