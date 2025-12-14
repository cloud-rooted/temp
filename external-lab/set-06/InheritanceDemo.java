// Base class
class A {
    void showA() {
        System.out.println("Class A");
    }
}

/* ---------- Single Inheritance ---------- */
class B extends A {
    void showB() {
        System.out.println("Class B");
    }
}

/* ---------- Multilevel Inheritance ---------- */
class C extends B {
    void showC() {
        System.out.println("Class C");
    }
}

/* ---------- Hierarchical Inheritance ---------- */
class D extends A {
    void showD() {
        System.out.println("Class D");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        B obj1 = new B();
        obj1.showA();
        obj1.showB();

        System.out.println("\nMultilevel Inheritance:");
        C obj2 = new C();
        obj2.showA();
        obj2.showB();
        obj2.showC();

        System.out.println("\nHierarchical Inheritance:");
        D obj3 = new D();
        obj3.showA();
        obj3.showD();
    }
}
