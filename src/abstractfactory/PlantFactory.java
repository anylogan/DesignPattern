package abstractfactory;

import Plant.*;
import animal.Animal;

public class PlantFactory extends AbstractFactory{
    private Plant plant;

    public Plant GetPlant(){
        try {
            return (Plant) plant.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.print(e.getMessage());
        }
        return null;
    }
    public void SetPlant(String name){
        if(name.equals("Rice"))
            plant = new Rice();
        else if(name.equals("Grass"))
            plant = new Grass();
        else if (name.equals("Corn"))
            plant = new Corn();
        else
            plant = null;
    }
	@Override
	public Animal GetAnimal(String animal) {
		// TODO Auto-generated method stub
		return null;
	}

}
