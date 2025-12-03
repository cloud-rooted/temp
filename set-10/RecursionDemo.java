public class RecursionDemo {

    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1)  // base case
            return 1;
        else
            return n * factorial(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
