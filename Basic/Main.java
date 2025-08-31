
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // variable
        int age =25;
        String name="Sahil is Java Full Stack Developer "+age+" with exp"; // String
        System.out.println(name);
        Scanner input= new Scanner(System.in);

        int [] numbers={1,2,3,4,6,5}; // array declaration

        // casting
        int x=10;
        double y=(double)x;

        // constant
        final int MAX = 100;
        if(age<20){
            System.out.println("Valid");
        }else{
            System.out.println("InValid");
        }
        for(int i=0;i<numbers.length;i++){
            System.out.println("Array "+numbers[i]);
        }

       int result=add(5,4);
        System.out.println(result);
    }
    public static int add(int a, int b) {
        return a + b;
    }
}

