package StaticExample;

public class InnerClass {
    public static void main(String[] args) {
        Inner obj = new Inner("Sahil");  // ✅ create object of Inner class
        Inner obj2= new Inner("Sam");
        System.out.println(obj.name);
        System.out.println(obj2.name);

    }
    static class Inner {
        String name;
        public Inner(String name){
            this.name=name;
        }
        void show() {
            System.out.println("Static nested class");
        }
    }
}

/*
static class Test{   Invalid static class should be dependent
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
}

*/