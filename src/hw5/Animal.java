package hw5;

public class Animal {
    public int id;
    public int age;
    public double weight;
    public String color;

    public Animal(int id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String voice() {
        return "Hello ";
    }
}
