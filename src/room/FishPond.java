package room;


import java.util.ArrayList;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import animal.Animal;
import feedanimal.FeedAnimals;

public class FishPond extends Accommodation{
	
	public FishPond() {
		this.animals=new ArrayList<Animal>(50);
		for(int i=0;i<20;i++) {
			AbstractFactory af=FactoryProducer.GetFactory("animal") ;
			animals.add(af.GetAnimal("fish"));
		}
	}
	@Override
	public void feeding() {
		FeedAnimals fa =new FeedAnimals();
		for(Animal animal:animals) {
			fa.feed(animal);
		}
		
	}

	@Override
	public void watering() {
		/* TODO Auto-generated method stub
		for(Plant plant:plants) {
			plant.Watering();
		}*/
	}

}
