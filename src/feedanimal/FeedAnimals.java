package feedanimal;

import animal.Animal;

public class FeedAnimals

{
    void initialize(Animal animal) {};
    void startPlay(Animal animal) {};
    void endPlay(Animal animal) {};


    public final void feed(Animal animal){

        initialize(animal);

        startPlay(animal);

        endPlay(animal);
    }

}
