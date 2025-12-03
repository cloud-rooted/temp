import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {

        String str = "Java is fun to learn and it's speed is superb than python";

        StringTokenizer st = new StringTokenizer(str);

        System.out.println("Tokens:");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
