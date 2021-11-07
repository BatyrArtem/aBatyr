package hw5;

public class Wolf extends WildAnimal {

    public Wolf(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String voice() {
        return super.voice() + " and I am angry";
    }
}
