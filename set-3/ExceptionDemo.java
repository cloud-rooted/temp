public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;   // division by zero
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
        finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}
