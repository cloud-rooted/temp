// Base class for Single & Multilevel inheritance
class Vehicle {
    void vehicleInfo() {
        System.out.println("General Vehicle");
    }
}

// Parent class for Multilevel inheritance
class Car extends Vehicle {
    void carInfo() {
        System.out.println("Car: Has 4 wheels");
    }
}

// Child class demonstrating Multilevel inheritance
class ElectricCar extends Car {
    void electricCarInfo() {
        System.out.println("Electric Car: Runs on battery");
    }
}

// Separate Parent class for Hierarchical inheritance
class Appliance {
    void applianceInfo() {
        System.out.println("General Appliance");
    }
}

// Child1 for Hierarchical inheritance
class WashingMachine extends Appliance {
    void washInfo() {
        System.out.println("Washing Machine: Cleans clothes");
    }
}

// Child2 for Hierarchical inheritance
class Refrigerator extends Appliance {
    void fridgeInfo() {
        System.out.println("Refrigerator: Keeps food cold");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        System.out.println("=== Multilevel Inheritance ===");
        ElectricCar ec = new ElectricCar();
        ec.vehicleInfo();
        ec.carInfo();
        ec.electricCarInfo();

        System.out.println("\n=== Hierarchical Inheritance ===");
        WashingMachine wm = new WashingMachine();
        wm.applianceInfo();
        wm.washInfo();

        Refrigerator rf = new Refrigerator();
        rf.applianceInfo();
        rf.fridgeInfo();
    }
}
