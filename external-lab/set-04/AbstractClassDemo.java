abstract class Shape {

    abstract void draw();   // Abstract method

    void display() {        // Non-abstract method
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {

        Shape s = new Circle();   // Reference of abstract class
        s.draw();
        s.display();
    }
}
