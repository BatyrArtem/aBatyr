package hw9;

public class TestCustomCollection {
    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        String[] str = {"two", "three", "four"};
        collection.addAll(str);

        CustomCollection cl = new Collection();
        String[] str2 = {"five", "six", "seven"};
        cl.addAll(str2);
        collection.addAll(cl);

        collection.delete(1);
        collection.delete(10);
        collection.delete("four");
        collection.delete("eleven");

        Collection collection2 = new Collection();
        collection2.add("one");
        collection2.add("three");
        collection2.get(0);
        collection.contains("five");
        collection2.contains("six");
        collection.equals(collection2);
        collection.clear();
        collection.size();
        collection2.size();
    }
}
