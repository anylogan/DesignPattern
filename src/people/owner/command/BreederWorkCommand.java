package people.owner.command;

import people.employee.Breeder;

public class BreederWorkCommand implements Command{
    private Breeder person;
    BreederWorkCommand(Breeder p){
        this.person=p;
    }
    @Override
    public void execute(){
        //person.work();
    }
}
