package abstractfactory;

import animal.Animal;
import Plant.Plant;

public abstract class AbstractFactory {
	public abstract Animal GetAnimal(String animal);
    public abstract void SetPlant(String name);
    public abstract Plant GetPlant();
}
