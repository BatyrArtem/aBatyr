package hw5;

public class Cat extends Animal {
    private String name;
    private boolean isVaccinated;

    public Cat(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    @Override
    public String voice() {
        return "Hello, my name is " + getName() + " Meow";
    }
}
