public class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "  Hello World  ";

        System.out.println("Original String: \"" + str + "\"");
        System.out.println("Length: " + str.length());

        System.out.println("charAt(3): " + str.charAt(3));

        System.out.println("Substring(2, 7): " + str.substring(2, 7));

        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("Trimmed: \"" + str.trim() + "\"");

        System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x'));

        System.out.println("Equals 'Hello World': " + str.trim().equals("Hello World"));
        System.out.println("Concat: " + str.trim().concat("!!!"));
    }
}
