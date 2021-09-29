package hw5;

public class Dog_guide extends Animal{
    private boolean isTrained;

    public Dog_guide(int id, int age, double weight, String color, boolean isTrained) {
        super(id, age, weight, color);
        this.isTrained = isTrained;
    }
    @Override
    public String voice() {
        return "Hello, I can take you home";
    }
}
