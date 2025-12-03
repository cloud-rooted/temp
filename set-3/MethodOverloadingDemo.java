class OverloadDemo {

    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }

    void show(int a, int b) {
        System.out.println("Two integers: " + a + ", " + b);
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();

        obj.show(10);
        obj.show("Hello");
        obj.show(5, 15);
    }
}
