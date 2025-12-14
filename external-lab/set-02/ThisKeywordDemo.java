class Student {
    int id;
    String name;

    // Constructor with parameters
    Student(int id, String name) {
        this.id = id;       // refers to current object's variable
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alex");
        s1.display();
    }
}
