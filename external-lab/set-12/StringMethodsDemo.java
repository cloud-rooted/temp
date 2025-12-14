public class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "Java Programming";

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (5 onwards): " + str.substring(5));
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Replace 'Java' with 'Core Java': " + str.replace("Java", "Core Java"));
    }
}
