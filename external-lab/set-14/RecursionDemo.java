public class RecursionDemo {

    static int factorial(int n) {
        if (n == 0)       // Base case
            return 1;
        else
            return n * factorial(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println("Factorial of " + num + " = " + factorial(num));
    }
}
