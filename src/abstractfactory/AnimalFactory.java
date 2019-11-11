package abstractfactory;
import Plant.Plant;
import animal.Animal;
import animal.Chicken;
import animal.Cow;
import animal.Fish;

public class AnimalFactory extends AbstractFactory {
	@Override
	public Animal GetAnimal(String animaltype) {
		if(animaltype == null) {
			return null;
		}
		if(animaltype.equalsIgnoreCase("fish")){
			return new Fish();
		}
		else if(animaltype.equalsIgnoreCase("cow")) {
			return new Cow();
		}
		else if(animaltype.equalsIgnoreCase("Chicken")) {
			return new Chicken();
		}
		return null;
	}

	@Override
	public void SetPlant(String name) {
		System.out.println("you shouldn't do that!");
	}

	@Override
	public Plant GetPlant() {
		// TODO Auto-generated method stub
		return null;
	}
}
