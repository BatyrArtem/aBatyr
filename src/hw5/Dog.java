package hw5;

public class Dog extends PetAnimal {

    public Dog(int id, int age, double weight, String color, String name, boolean isVaccinate) {
        super(id, age, weight, color, name, isVaccinate);
    }

    @Override
    public String voice() {
        return super.voice() + " Woof";
    }
}
