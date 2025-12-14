public class StringMethodsDemo {
    public static void main(String[] args) {

        String s = "Java Programming";

        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Substring: " + s.substring(5));
        System.out.println("Character at index 2: " + s.charAt(2));
        System.out.println("Replace: " + s.replace("Java", "Did you learn Java"));
    }
}
