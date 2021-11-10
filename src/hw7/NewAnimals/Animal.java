package hw7.NewAnimals;


import hw7.Interfaces.Voice;

public class Animal implements Voice {
    private int id;
    private double weight;
    private int age;
    private String color;

    public Animal(int id, double weight, int age, String color) {
        this.id = id;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
