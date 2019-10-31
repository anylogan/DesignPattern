package people.owner;

import people.People;

public class ChefOwnerDecorator extends OwnerDecorator {
    public ChefOwnerDecorator(People decoratorPeople)
    {
        super(decoratorPeople);
    }

    @Override
    public  void work()
    {
        decoratorowner.work();
        doChefWork(decoratorowner);

    }

    @Override
    public void chat(String message) {

    }

    @Override
    public String getname() {
        return null;
    }

    private void doChefWork(People decoratorowner) {
        System.out.println("做饭");
    }

}