package people.owner.command;

import people.employee.Farmer;

public class FarmerWorkCommand implements Command {

    private Farmer person;
    FarmerWorkCommand(Farmer p){
        this.person=p;
    }
    @Override
    public void execute(){
        //person.work();
    }

}
