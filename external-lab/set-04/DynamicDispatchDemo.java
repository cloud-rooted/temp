class A {
    void show() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void show() {
        System.out.println("This is class B");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {

        A obj;          // Superclass reference
        obj = new B();  // Subclass object

        obj.show();     // Calls B's show() at runtime
    }
}
