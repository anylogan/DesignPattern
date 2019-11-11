package animal;

import action.ChickenMove;

public class Chicken extends Animal {
	public Chicken() {
		Animalname="chicken";
		move=new ChickenMove();
		move.getself(this);
	}
	public void produce() {	   //·µ»ØÒ»¸öegg
		System.out.println("you get an egg!");
	}
	public void feed() {
		System.out.println("The chicken eats some rice!");
	}
}
