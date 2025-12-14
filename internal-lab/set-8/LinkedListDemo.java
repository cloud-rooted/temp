import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.addFirst("Mango");   // add at beginning
        list.addLast("Grapes");   // add at end

        System.out.println("LinkedList Elements: " + list);

        // Access elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        // Remove elements
        list.remove("Banana");
        list.removeFirst();
        list.removeLast();

        System.out.println("After removals: " + list);
        System.out.println("Size of LinkedList: " + list.size());
    }
}
