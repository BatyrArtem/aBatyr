package hw11;

public interface StringColletion {
    String get(int index);
    boolean add(String str);
    boolean add(int index, String str);
    boolean delete(String str);
    boolean contains(String str);
    boolean equals(StringColletion colletion);
    boolean celar();
    int size();
}
