package people;

import people.employee.Chef;

public class Employeefactory {
    public People getcareer(String career){
        if(career == null){
            return null;
        }
        if(career.equalsIgnoreCase("chef")){
            return new Chef();
        }
        return null;
    }

}
