public class ConstructorOverloading {
    public static void main(String[] args) {
        SmartStudent sahil=new SmartStudent(1,"Sahil");
        SmartStudent second=new SmartStudent(sahil);
        System.out.println(second.name);
    }


}
class SmartStudent{
    int roll_no; String name;

     SmartStudent(int roll_no, String name){
         this.roll_no=roll_no;
         this.name=name;
     }
     SmartStudent( SmartStudent other){
         this.roll_no=other.roll_no;
         this.name= other.name;
     }
}