package hw7.NewAnimals;


import hw7.Interfaces.Think;
import hw7.Interfaces.Voice;

public class Fish extends Domestic implements Voice, Think {
    public Fish(int id, double weight, int age, String color, String name, boolean isVaccinated) {
        super(id, weight, age, color, name, isVaccinated);
    }

    @Override
    public void printVoice(){
        System.out.println("........");
    }
}
