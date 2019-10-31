package people.owner;

import people.People;

public class SalesmanOwnerDecorator extends OwnerDecorator{
    public SalesmanOwnerDecorator(People decoratorPeople)
    {
        super(decoratorPeople);
    }

    @Override
    public  void work()
    {
        decoratorowner.work();
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


