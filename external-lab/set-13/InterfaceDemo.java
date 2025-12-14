interface MyInterface {
    int MAX = 100;          // final member (constant)
    void show();             // abstract method
}

class Demo implements MyInterface {
    public void show() {     // Implement abstract method
        System.out.println("MAX value = " + MAX);
        System.out.println("Interface method implemented");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}


/*
Members in interface are public static final by default
Methods are abstract by default
Implemented in a class using implements keyword
Supports multiple inheritance in Java
*/