class A {
    void show() {
        System.out.println("Show from Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Show from Class B");
    }
}

class C extends A {
    void show() {
        System.out.println("Show from Class C");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {

        A ref;  // reference of superclass

        ref = new B();   // object of subclass B
        ref.show();      // calls B's show()

        ref = new C();   // object of subclass C
        ref.show();      // calls C's show()
    }
}
