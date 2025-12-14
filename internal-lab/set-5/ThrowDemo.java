public class ThrowDemo {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access Denied! Age < 16 Games are not allowed.");
        }
        System.out.println("Access Granted.");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);   // this will cause exception
        }
        catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
