public class OOPS {
    public static void main(String[] args) {
        Student student = new Student(5, "John", 85.6f);
        System.out.println(student);
    }
}

class Student {
    int roll;
    String name;
    float marks;

    // Constructor
    Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    // toString() method to print object details
    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", Marks: " + marks;
    }
}