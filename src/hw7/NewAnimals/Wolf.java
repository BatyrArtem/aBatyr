package hw7.NewAnimals;


import hw7.Interfaces.Howl;

public class Wolf extends Wild implements Howl {

    public Wolf(int id, double weight, int age, String color, boolean isPredator) {
        super(id, weight, age, color, isPredator);
    }

    @Override
    public void toHowl(){
        System.out.println("I like howling at the moon.");
    }
}
