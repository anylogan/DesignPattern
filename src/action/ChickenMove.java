package action;

import animal.Animal;

public class ChickenMove implements Move{
	public Animal animal;

	@Override
	public void action() {
		System.out.println(animal.Animalname+" is running!");
	}

	@Override
	public void getself(Animal a) {
		animal=a;
	}
}
