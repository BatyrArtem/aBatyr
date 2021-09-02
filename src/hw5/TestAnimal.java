package hw5;

public class TestAnimal {
    public static void main(String[] args) {
        Fish fish = new Fish(1, 3, 0.3, "blue");
        System.out.println(fish.voice());

        Cat cat = new Cat(2,3,5.0,"black", "Simon", true);
        System.out.println(cat.voice());

        Crocodile crocodile = new Crocodile(3, 100, 60.0, "green", true);
        System.out.println(crocodile.voice());

        Dog dog = new Dog(4,5, 5.0,"yellow", "Sharik", true);
        System.out.println(dog.voice());

        Dog_guide dog_guide = new Dog_guide(5,5, 3.0, "pink", true);
        System.out.println(dog_guide.voice());

        Giraffe giraffe = new Giraffe(6,3, 7., "orange", true);
        System.out.println(giraffe.voice());

        Hamster hamster = new Hamster(7,1,6., "orange", 2);
        System.out.println(hamster.voice());

        Leo leo = new Leo(8,8,8.,"orange", true);
        System.out.println(leo.voice());

        Wolf wolf = new Wolf(9,9,9., "grey", true);
        System.out.println(wolf.voice());


    }
}
