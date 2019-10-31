package people.owner;

import people.People;

public class BreederOwnerDecorator extends OwnerDecorator {
    public BreederOwnerDecorator(People decoratorPeople)
    {
        super(decoratorPeople);
    }

    @Override
    public  void work()
    {
        decoratorowner.work();
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
