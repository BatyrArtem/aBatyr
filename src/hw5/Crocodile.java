package hw5;

public class Crocodile extends Animal {
    private boolean isPredator;

    public Crocodile(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public String voice() {
        return "Hello, I am a wild animal" + " and I am angry";
    }
}
