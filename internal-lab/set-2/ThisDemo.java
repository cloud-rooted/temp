class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;     // using 'this' to refer to instance variable
        this.name = name;
    }

    void display() {
        System.out.println("Roll: " + this.roll + ", Name: " + this.name);
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Student s1 = new Student(99, "Alice");
        s1.display();
    }
}
