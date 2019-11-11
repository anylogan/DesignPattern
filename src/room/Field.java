package room;

import java.util.ArrayList;
import Plant.Plant;
import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;

public class Field extends Accommodation{
	
	public Field() {
		this.plants = new ArrayList<Plant>(30);
		AbstractFactory pFactory = FactoryProducer.GetFactory("Plant");
		pFactory.SetPlant("Rice");
		for (int i=0;i<10;i++) {
			this.plants.add(pFactory.GetPlant());
		}
	}
	
	public void feeding() {
		// TODO Auto-generated method stub
		
	}

	public void watering() {
		for(Plant plant:plants) {
			plant.Watering();
		}
	}

}
