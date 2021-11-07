package hw5;

public class Cat extends PetAnimal {
    private boolean isTrained;

    public Cat(int id, int age, double weight, String color, String name, boolean isVaccinate, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinate);
        this.isTrained = isTrained;
    }

    @Override
    public String voice(){
        return (super.voice() + " Meow!");
    }
}
