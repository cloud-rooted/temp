import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        // Create HashSet
        HashSet<String> hs = new HashSet<>();

        // Add elements
        hs.add("Java");
        hs.add("Python");
        hs.add("C++");
        hs.add("Java");   // Duplicate element

        // Display HashSet
        System.out.println("HashSet elements:");
        for (String s : hs) {
            System.out.println(s);
        }
    }
}
