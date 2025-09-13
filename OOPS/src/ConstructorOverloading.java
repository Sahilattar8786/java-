public class ConstructorOverloading {
    public static void main(String[] args) {
        SmartStudent sahil=new SmartStudent(1,"Sahil");
        SmartStudent second=new SmartStudent(sahil);
        SmartStudent third=new SmartStudent();
        System.out.println(third.name);
        System.out.println(third.roll_no);
    }


}
class SmartStudent{
    int roll_no; String name;

     SmartStudent(int roll_no, String name){
         this.roll_no=roll_no;
         this.name=name;
     }
     // calling constructor from another constructor
     SmartStudent (){
         this(12,"Sahil") ;
     }
     SmartStudent( SmartStudent other){
         this.roll_no=other.roll_no;
         this.name= other.name;
     }
}