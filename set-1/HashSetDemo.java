import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");   // duplicate – ignored

        System.out.println("HashSet Elements:");
        for (String item : set) {
            System.out.println(item);
        }
    }
}
