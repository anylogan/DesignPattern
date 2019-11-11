package animal;

public class PetDog implements PetDogSleep{
	public PetDog() {
	}

	@Override
	public void sleep() {
		System.out.println("Pet dog is sleeping!");
	}
}
