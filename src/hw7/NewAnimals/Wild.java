package hw7.NewAnimals;


import hw7.Interfaces.Voice;

public class Wild extends Animal implements Voice {

    private boolean isPredator;

    public Wild(int id, double weight, int age, String color, boolean isPredator) {
        super(id, weight, age, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    @Override
    public void printVoice(){
        System.out.println("Hello! I am a wild animal.");
        if(isPredator){
            System.out.println("I am angry.");
        }
    }
}
