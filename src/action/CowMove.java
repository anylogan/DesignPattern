package action;

import animal.Animal;

public class CowMove implements Move{
	public Animal animal;
	@Override
	public void action() {
		System.out.println(animal.Animalname+" is walking!");
	}

	@Override
	public void getself(Animal a) {
		animal=a;
	}

}
