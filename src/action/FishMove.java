package action;

import animal.Animal;

public class FishMove implements Move{
	public Animal animal;
	@Override
	public void getself(Animal a) {
		animal=a;
	}
	@Override
	public void action() {
		System.out.println(animal.Animalname+" is swiming!");
	}
}
