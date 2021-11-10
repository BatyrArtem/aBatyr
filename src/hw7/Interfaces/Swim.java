package hw7.Interfaces;

public interface Swim {
    default void toSwim(){
        System.out.println("I can swim.");
    }
}
