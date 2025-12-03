abstract class Animal {
    abstract void sound();          // abstract method

    void sleep() {                  // concrete method
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void sound() {                  // implementing abstract method
        System.out.println("Dog barks");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Animal a = new Dog();       // upcasting
        a.sound();
        a.sleep();
    }
}
