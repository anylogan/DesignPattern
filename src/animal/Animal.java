package animal;

import action.Move;

public class Animal {
	public static PetDog petdog = new PetDog();
	public String state = "alive";
	public String growthstate="born";
	public String Animalname;
	public Move move;
	public void act() {	move.action(); }
	public void produce() {
		
	}
	public void feed() {
		
	}
	public void grow() {
		if(this.growthstate.equals("born")) {
			this.growthstate="growing";
		}
		else if(this.growthstate.equals("growing")) {
			this.growthstate="mature";
		}
		else {
			System.out.println("The animal has been mature!");
		}
	}
}
