package hw5;

public class Dog extends Animal {
    private String name;
    private boolean isVaccinated;
    public Dog(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    @Override
    public String voice() {
        return "Hello, my name is " + getName() + " Woof";
    }
}
