// Case 1: Final variable
class TestFinal {
    final int MAX = 100;  // constant

    void show() {
        System.out.println("Max value = " + MAX);
    }
}

// Case 2: Final method
class Parent {
    final void display() {
        System.out.println("This is a final method");
    }
}

class Child extends Parent {
    // void display() { }  // Cannot override final method
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        TestFinal t = new TestFinal();
        t.show();

        Child c = new Child();
        c.display();
    }
}
