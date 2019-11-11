package room;

import java.util.ArrayList;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import animal.Animal;
import feedanimal.FeedAnimals;

public class ChickenCoop extends Accommodation{
	
	public ChickenCoop() {
		this.animals=new ArrayList<Animal>(30);
		for(int i=0;i<10;i++) {
			AbstractFactory af=FactoryProducer.GetFactory("animal") ;
			animals.add(af.GetAnimal("chicken"));
		}
	}
	@Override
	public void feeding() {
		FeedAnimals fa =new FeedAnimals();
		for(Animal animal:animals) {
			fa.feed(animal);
		}
		
	}
	public void accept() {
		for(int i=0;i<animals.size();i++)
		{
			System.out.println("visiting "+(i+1)+" chicken");
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
