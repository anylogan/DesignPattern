package people.owner;

import people.People;

public class FarmerOwnerDecorator extends OwnerDecorator {
    public FarmerOwnerDecorator(People decoratorPeople)
    {
        super(decoratorPeople);
    }

    @Override
    public  void work()
    {
        decoratorowner.work();
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
