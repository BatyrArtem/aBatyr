package hw5;

public class Giraffe extends WildAnimal {
    private boolean isPredator;

    public Giraffe(int id, int age, double weight, String color, boolean isPredator, boolean isPredator1) {
        super(id, age, weight, color, isPredator);
        this.isPredator = isPredator1;
    }

    @Override
    public String voice() {
        return super.voice() + " and I am angry";
    }
}
