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

//        student sahil =new student();
//        System.out.println(sahil.roll_no); // by default 0
//        System.out.println(sahil.name); // by default null

//        student kunal=new student();
//        kunal.roll_no=21;
//        kunal.name="Kunal";
//        kunal.marks=90;
//        System.out.println(kunal.roll_no);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);
          student sahil = new student(13,"Sahil",90);
          System.out.println(sahil.name);


    }
}
//class

/*
  Constructor - its basically defines what happens when your class object is getting created

  student sahil = new student();
  System.out.println(sahil.name); // Sahil
 class  student{
      int roll_no;
      String name;
      int marks ;

      student(int rno,String getname,int Marks){
          this.roll_no=rno;
          this.name=getname;
          this.marks=Marks;
      }
}

 student sahil = new student(13,"Sahil",90);
 System.out.println(sahil.name);



*/
class  student{
      int roll_no;
      String name;
      int marks ;

      student(int rno,String getname,int Marks){
          this.roll_no=rno;
          this.name=getname;
          this.marks=Marks;
      }
}
