import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        // HashMap Example
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        System.out.println("HashMap: " + hm);

        // Hashtable Example
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(3, "Three");
        System.out.println("Hashtable: " + ht);
    }
}

/*
HashMap: Stores key-value pairs, allows null keys and values, non-synchronized.
Hashtable: Stores key-value pairs, does not allow null, synchronized.
*/