public class Packages {
}

/*

 What is a Package in Java?

 1.A Package is like folder/directory in Java used to group related classes ,interfaces and sub-package folder
 2.Think of it as a namespace that avoids naming conflicts and helps organize code.

Built-in Packages (provided by Java)
  1.java.util → contains utility classes like ArrayList, HashMap
  2.java.io → input/output classes
  3.java.sql → database connectivity
  e.g import java.util.ArrayList;

User-defined Packages (created by you)

package mypackage;   // define package at top of file

public class Student {
    public void display() {
        System.out.println("Hello from Student class!");
    }
}
And another file:
import mypackage.Student;  // import custom package

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

Why Use Packages?
 1.	Code Reusability → Group related classes (like all database classes in one package).
 2. Avoid Naming Conflicts → Two classes with the same name can exist in different packages.
 3. Access Protection → Use public, protected, default, private with packages for encapsulation.
 4. Easier Maintenance → Organized project structure.
Package Hierarchy Example
  java
 └── util
       ├── ArrayList
       ├── HashMap
       └── Collections

Importing Packages
Import a single class:import java.util.ArrayList;

Import all classes in a package: import java.util.*;


// Advanced & Tricky Interview Question

    What’s the default package in Java?
	    •If no package is specified, the class belongs to the default package.
	    •Not recommended for real projects because classes in default package can’t be imported outside it.

	How do access modifiers (public, protected, default, private) behave with packages?
        •public → accessible everywhere.
        •protected → accessible within package + subclasses.
        •default (no modifier) → accessible only within the package.
        •private → accessible only within the class.

    What is package sealing in Java?
	    •In JAR files, a package can be sealed → all classes for that package must come from the same JAR (security measure).

    What is the difference between package keyword and import keyword?
	    •package → defines the package where class belongs.
	    •import → makes classes from other packages accessible.

	Can we have two packages with the same name?
	    •Technically yes, if they are in different JARs. But JVM loads them separately (could cause classpath conflicts).

*/
