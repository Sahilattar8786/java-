public class TypeCasting
{
    public static void main(String[] args) {
         // type casting
         int num =(int)(67.56f);
         System.out.println(num); // 67

         //automatic type promotion in expression
         int a=257;
         byte b= (byte)(a);
         System.out.println(b); //1
         char c='a';


    }
}
