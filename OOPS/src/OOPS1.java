import java.util.Arrays;

// OOP 1 | Introduction & Concepts - Classes, Objects, Constructors, Keywords
// new keyword - dynamically allocates memory return reference to it
// object is stored in heap memory
// student [] james - happens on compile time
// new student [] - happens on run time
// memory and ram allocated when your program is running is called dynamic memory allocation

public class OOPS1 {
    public static void main(String[] args) {
      student[] james=new student[5];
      // System.out.println(Arrays.toString(james)); null null null ....

      student sahil=new student();
        System.out.println(sahil.roll_no); // by default 0
        System.out.println(sahil.name); // by default null

    }
}
//class
class  student{
      int roll_no;
      String name;
      int marks ;
}
