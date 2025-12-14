class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

class Test {
    // Method accepting Student object as parameter
    void printStudent(Student s) {
        System.out.println("Inside method:");
        s.display();
    }
}

public class ObjectParameterDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Farhan", 75);
        Test t = new Test();

        t.printStudent(s1);    // passing object as parameter
    }
}
