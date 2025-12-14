public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");        // Add text
        sb.insert(5, "Language ");        // Insert text
        sb.replace(0, 4, "Core");         // Replace text
        sb.reverse();                     // Reverse string

        System.out.println(sb);
    }
}
