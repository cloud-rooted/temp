class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        super();  // Calls parent constructor
        System.out.println("Child constructor");
    }

    void show() {
        super.show();  // Calls parent method
        System.out.println("Child show()");
        System.out.println("Parent x = " + super.x); // Access parent variable
        System.out.println("Child x = " + x);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
