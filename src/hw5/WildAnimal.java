package hw5;

public class WildAnimal extends Animal{

    private boolean isPredator;

    public WildAnimal(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public String voice(){
        return super.voice() + "I am a wild animal.";
    }
}
