public class thiskeyword {
    public static void main(String[] args) {
        Student2 sahil=new Student2("Sahil",19);
        System.out.println(sahil.name);
        System.out.println(sahil.age);



    }
}
class Student{
    String name ;
    int age ;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class Student2{
     String name;
     int age ;

     Student2(){
         this("Unknown", 18); // Calls the other constructor
     }
    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


/*
 In Java, this is a reference variable that refers to the current object of the class.
 Whenever you create an object, this represents that specific instance of the class.

1.To refer to current object’s fields (instance variables)
Sometimes local variables (like method parameters) have the same name as instance variables.
In that case, this is used to differentiate them.

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;  // "this.name" → instance variable
        this.age = age;    // "age" → local variable
    }
}
2.To call another constructor in the same class (Constructor chaining)
class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 18); // Calls the other constructor
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
3.To pass current object as a parameter
class Student {
    void display() {
        System.out.println("Inside display()");
    }

    void show() {
        helper(this);  // Pass current object
    }

    void helper(Student s) {
        s.display();
    }
}
4.To return current object
class Student {
    String name;

    Student setName(String name) {
        this.name = name;
        return this; // return current object
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Sahil").setName("Kunal"); // Method chaining
    }
}


*/
