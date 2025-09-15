package StaticExample;

public class Human {
    int age;
    String name;
    boolean married;
    static long Population; // creating static variable

    public Human(int age,String name,boolean married){
        this.age=age;
        this.name=name;
        this.married=married;
        Human.Population=+1;  // to access static variable

    }

    static void smile(){
//        handshake();   static method cannt access non static method due it non static method require object
//        System.out.println(this.age);  it will not work due to this is for object

    }

    void speak(){
//        Human();
        System.out.println("hello");
        HandShake();
    }
    void HandShake(){
        System.out.println("Make an HandShake");
    }
}
/*
Static Keyword - “This member belongs to the class, not to individual objects.”
Static Methods can only access static data it cannt acess non static data .

Non-static (instance) → every object gets its own copy.
Static → only one copy per class (shared by all objects).

Static Variables (Class Variables) -
class Counter {
    static int count = 0;  // shared variable
    Counter() { count++; }
}

public class Test {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println(Counter.count); // 3
    }
}

2. Static Methods - Belong to class, not objects.
class MathUtil {
    static int square(int x) {
        return x * x;
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println(MathUtil.square(5)); // 25
    }
}
3.Static Block - Runs once when the class is loaded (before main).
Used for static initialization.
class Demo {
    static {
        System.out.println("Static block executed");
    }
    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}
4. Static Class (Nested Class)
 -Only inner classes can be static.
 -They don’t need an object of the outer class.
 class Outer {
    static class Inner {
        void show() {
            System.out.println("Static nested class");
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner(); // no Outer object needed
        obj.show();
    }
}

Interview Question
Q1: Can we override static methods?
class Parent {
    static void show() { System.out.println("Parent"); }
}
class Child extends Parent {
    static void show() { System.out.println("Child"); }
}
public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();   // Output: Parent ❌ (not Child)
    }
}

Q2: Can we access a static method using an object?
 Yes, but not recommended (compiler rewrites it as ClassName.method).
 Counter c = new Counter();
c.count = 10;  // works, but bad practice

Q3: Difference between static block and constructor?
Static block runs once when class loads.
Constructor runs every time an object is created.

Q4:Can an interface have static methods?
Since Java 8 → Yes, static methods in interfaces are allowed.
interface MyInterface {
    static void hello() {
        System.out.println("Hello from static interface method");
    }
}
Q5 Why can’t we use this inside static methods?
Because this refers to the current object, but static methods belong to class, not to objects.

Q6: What happens if we declare main as non-static?
JVM won’t be able to call it without creating an object → program won’t run.
here static allow main to call without creating an object

 */