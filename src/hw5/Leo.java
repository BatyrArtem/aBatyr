package hw5;

public class Leo extends WildAnimal {
    private boolean isPredator;

    public Leo(int id, int age, double weight, String color, boolean isPredator, boolean isPredator1) {
        super(id, age, weight, color, isPredator);
        this.isPredator = isPredator1;
    }

    @Override
    public String voice() {
        return super.voice() + " and I am angry";
    }
}
