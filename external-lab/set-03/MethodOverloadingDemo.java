class Overload {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        Overload obj = new Overload();

        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}
