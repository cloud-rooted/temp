class Student {
    private String name;      // private member
    private int marks;

    // Public setter methods
    public void setName(String n) {
        name = n;
    }

    public void setMarks(int m) {
        marks = m;
    }

    // Public getter methods
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class AccessSpecifierDemo {
    public static void main(String[] args) {
        Student s = new Student();

        // Accessing private members via public methods
        s.setName("Ruther");
        s.setMarks(95);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Marks: " + s.getMarks());

        s.display();
    }
}
