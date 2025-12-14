import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {

        String str = "Java,Python,C++,C#";

        // Create StringTokenizer with comma as delimiter
        StringTokenizer st = new StringTokenizer(str, ",");

        System.out.println("Tokens:");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
