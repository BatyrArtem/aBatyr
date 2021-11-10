package hw7.NewAnimals;


import hw7.Interfaces.Swim;
import hw7.Interfaces.Voice;

public class Dog extends Domestic implements Swim, Voice {
    public Dog(int id, double weight, int age, String color, String name, boolean isVaccinated) {
        super(id, weight, age, color, name, isVaccinated);
    }

    @Override
    public void specificVoice(){
        System.out.println(" Woof!");
    }
}
