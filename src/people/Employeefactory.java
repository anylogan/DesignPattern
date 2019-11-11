package people;

import people.employee.Breeder;
import people.employee.Salesman;
import people.employee.Farmer;
public class Employeefactory {
    public People getcareer(String career){
        if(career == null){
            return null;
        }
        if(career.equalsIgnoreCase("breeder")){
            return new Breeder();
        }
        else if(career.equalsIgnoreCase("farmer")){
            return new Farmer();
        }
        else if  (career.equalsIgnoreCase("salesman")){
            return new Salesman();
        }
        return null;
    }

}
