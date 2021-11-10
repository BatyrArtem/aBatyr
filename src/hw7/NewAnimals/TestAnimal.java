package hw7.NewAnimals;

public class TestAnimal {
    public static void main(String[] args) {
        Animal an = new Animal(23, 12.9, 1, "black");
        an.printVoice();

        Cat cat = new Cat(1, 3.5, 7, "black", "Persik", true);
        cat.printVoice();
        cat.specificVoice();
        cat.toPet();
        cat.toPlay();
        System.out.println("-------------------------");
        Crocodile croco = new Crocodile(2, 25.2, 14, "green", true);
        croco.printVoice();
        System.out.println("-------------------------");
        Dog dog = new Dog(3, 7.8, 3, "white", "Lucky", true);
        dog.printVoice();
        dog.specificVoice();
        dog.toSwim();
        dog.toPet();
        System.out.println("-------------------------");
        Fish fish = new Fish(4, 0.2, 1, "orange", "Blubie", false);
        fish.printVoice();
        fish.toThink();
        System.out.println("-------------------------");
        Giraffe giraffe = new Giraffe(5, 45.7, 12, "yellow", false);
        giraffe.printVoice();
        System.out.println("-------------------------");
        GuideDog guideDog = new GuideDog(6, 12.4, 9, "brown", "Bucky", true, true);
        guideDog.printVoice();
        guideDog.specificVoice();
        guideDog.toPet();
        guideDog.toTakeHome();
        guideDog.toSwim();
        System.out.println("-------------------------");
        Hamster hamster = new Hamster(7, 0.6, 2, "beige", "Rocky", false);
        hamster.printVoice();
        hamster.toPet();
        System.out.println("-------------------------");
        Lion lion = new Lion(8, 78.9, 16, "golden", true);
        lion.printVoice();
        System.out.println("-------------------------");
        Wolf wolf = new Wolf(9, 70.0, 10, "grey", true);
        wolf.printVoice();
        wolf.toHowl();
    }
}
