interface Vehicle {
    int MAX_SPEED = 120;  // final member (constant)

    void start();          // abstract method
    void stop();           // abstract method
}

class Car implements Vehicle {

    public void start() {   // implementing abstract method
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    void showMaxSpeed() {
        System.out.println("Max Speed: " + MAX_SPEED);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
        c.showMaxSpeed();
    }
}
