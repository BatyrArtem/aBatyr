package hw7.NewAnimals;


import hw7.Interfaces.ToPet;
import hw7.Interfaces.Voice;

public class Domestic extends Animal implements Voice, ToPet {

    private String name;
    private boolean isVaccinated;

    public Domestic(int id, double weight, int age, String color, String name, boolean isVaccinated) {
        super(id, weight, age, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public void printVoice(){
        System.out.print("Hello! My name is " + name + ". I am a domestic animal.");
    }
}
