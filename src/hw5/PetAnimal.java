package hw5;

public class PetAnimal extends Animal{

    String name;
    boolean isVaccinate;

    public PetAnimal(int id, int age, double weight, String color, String name, boolean isVaccinate) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinate = isVaccinate;
    }

    public String voice(){
        return super.voice() + "My name is " + name + ". I am a domestic animal.";
    }
}
