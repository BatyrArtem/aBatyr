package hw5;

public class Hamster extends Animal {
    public int name;

    public Hamster(int id, int age, double weight, String color, int name) {
        super(id, age, weight, color);
        this.name = name;
    }

    public int getName() {
        return name;
    }

    @Override
    public String voice() {
        return "Hello, my name is" + getName();
    }
}
