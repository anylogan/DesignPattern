package animal;

import action.CowMove;

public class Cow extends Animal{
	public Cow() {
		Animalname="cow";
		move=new CowMove();
		move.getself(this);
	}
	public void produce() {	    //∑µªÿ“ªøÈ≈£»‚
		System.out.println("you get some beef!");
	}
	public void feed() {
		System.out.println("The cow eats some grass!");
	}
}
