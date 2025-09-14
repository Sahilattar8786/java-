public class FinalKeyword {

    public static void main(String[] args) {
//        final int x;  valid

    }
    static void show(){
       //      x=15;
    }
}
/*
 The final keyword is a non-access modifier used for variables, methods, and classes.
 It means cannot be changed further (depends on where you apply it).

1.Final Variable (Constant)
   Once assigned, its value cannot be changed.
   class Demo {
    final int x = 10;  // must be initialized once

    void show() {
        // x = 20; ❌ Error: cannot assign value to final variable
        System.out.println(x);
    }
}
  Blank Final Variable → declared but not initialized. Must be initialized in constructor.
  class Student {
    final int rollNo;

    Student(int rollNo) {
        this.rollNo = rollNo; // initialized only once
    }
  }

2. Final Method
   A final method cannot be overridden in subclasses.
   class Parent {
    final void display() {
        System.out.println("Parent display");
    }
    }

    class Child extends Parent {
    // void display() { ❌ Error: cannot override final method }
    }

3. Final Class
A final class cannot be inherited.
final class Vehicle {
    void run() {
        System.out.println("Running...");
    }
}

// class Car extends Vehicle { ❌ Error: cannot inherit final class }

// Quick Summary
	•	final variable → constant
	•	final method → no overriding
	•	final class → no inheritance
*/
