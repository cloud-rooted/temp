public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");             // add at end
        System.out.println("After append: " + sb);

        sb.insert(5, ",");               // insert at index
        System.out.println("After insert: " + sb);

        sb.delete(5, 6);                 // delete character at index 5
        System.out.println("After delete: " + sb);

        sb.reverse();                    // reverse the string
        System.out.println("After reverse: " + sb);
    }
}
