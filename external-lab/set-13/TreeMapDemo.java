import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println("TreeMap: " + map);

        // Iterating through TreeMap
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}


// TreeMap stores key-value pairs in a sorted order based on the natural ordering of keys.