package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Sahil= new Human(24,"Sahil",false);
        System.out.println(Sahil.Population);
        Human Aarif=new Human(23,"Aarif",false);

        System.out.println(Sahil.Population);

        Student sam=new Student();
        System.out.println(Student.a+" "+Student.b);
        Student.b+=3;
        Student marks=new Student();
        System.out.println("second object");
        System.out.println(Student.a+" "+Student.b);





    }
}

class Student {
    static int a=2;
    static  int b=3;

    static {
        System.out.println("Its static block");
        b=a*5;
    }
}