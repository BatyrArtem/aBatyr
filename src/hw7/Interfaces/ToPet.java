package hw7.Interfaces;

public interface ToPet {
    default void toPet(){
        System.out.println("I like when my owner pets me.");
    }
}
