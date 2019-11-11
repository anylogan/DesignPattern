package people.owner;

import people.People;
import room.Accommodation;

public class BreederOwnerDecorator extends OwnerDecorator {
    public BreederOwnerDecorator(People decoratorPeople)
    {
        super(decoratorPeople);
    }

    @Override
    public  void work(Accommodation accommodation)
    {
        decoratorowner.work(accommodation);
        doBreederWork(decoratorowner);

    }

    @Override
    public void chat(String message) {

    }

    @Override
    public String getname() {
        return null;
    }

    private void doBreederWork(People decoratorowner) {
        System.out.println("饲养");
    }





}
