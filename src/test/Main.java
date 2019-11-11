package test;

import java.util.List;

import Plant.*;
import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import animal.Animal;
import fertilize.Farmer;
import Sleep.*;

public class Main {
    public static void main(String []args){
        AbstractFactory pf = FactoryProducer.GetFactory("plant");
        pf.SetPlant("Rice");
//        ArrayList<Plant>Plants = new ArrayList<Plant>(10);
//        for(int i=0;i<10;i++) {
//            Plants.add(pf.GetPlant());
//        }
//        for(int i=0;i<10;i++){
//            Plants.get(i).Growing();
//        }
//        for (int i = 0; i < 10; i++) {
//            Plants.get(i).Harvested();
//        }
        //
        
        Plant plant = pf.GetPlant();
        plant.Growing();
        plant.Fertilization();
        plant.Watering();
        plant.Fertilization();
        plant.Weeding();
        plant.Fertilization();
        
        pf=FactoryProducer.GetFactory("animal");
        Animal animal=pf.GetAnimal("chicken");
        System.out.println(animal.Animalname);
        animal.act();
        test.sleeptest();
        System.out.println(animal.growthstate);
        animal.grow();
        System.out.println(animal.growthstate);
        animal.grow();
        System.out.println(animal.growthstate);
        animal.grow();
        animal.feed();
        animal.produce();
        Animal.petdog.sleep();
        
        Farmer.doFertilize();
    }
}
