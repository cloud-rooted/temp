class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {  // Overriding parent method
        System.out.println("Child class method");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();  // Calls Parent's method

        Child c = new Child();
        c.show();  // Calls Child's method
    }
}
