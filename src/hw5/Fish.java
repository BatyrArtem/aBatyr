package hw5;

public class Fish extends WildAnimal {

    public Fish(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String voice() {
        return "....";
    }




}
