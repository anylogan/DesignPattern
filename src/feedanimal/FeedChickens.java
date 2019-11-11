package feedanimal;

import animal.Animal;

public class FeedChickens extends FeedAnimals
{


    @Override
    void endPlay(Animal animal) {
        animal.feed();
    }

    @Override
    void initialize(Animal animal) {
        System.out.println("The farmer start feeding "+animal.Animalname);
    }

    @Override
    void startPlay(Animal animal) {
        System.out.println(animal.Animalname+" is going to be fed");
    }

}
