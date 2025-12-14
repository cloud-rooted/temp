import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("ArrayList Elements: " + list);

        // Access element
        System.out.println("First Element: " + list.get(0));

        // Modify element
        list.set(1, "Mango");
        System.out.println("After modification: " + list);

        // Remove element
        list.remove("Orange");
        System.out.println("After removal: " + list);

        // Size of ArrayList
        System.out.println("Size of ArrayList: " + list.size());

        // Check if element exists
        System.out.println("Contains Mango? " + list.contains("Mango"));
    }
}
