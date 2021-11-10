package hw7.Interfaces;

public interface Think {
    default void toThink(){
        System.out.println("Unfortunately, I can't speak, but I like listening.");
    }
}
