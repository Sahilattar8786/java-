public class GarbageCollection {
    public static void main(String[] args) {
        Demo d1 = new Demo(1);
        Demo d2 = new Demo(2);

        d1 = null;            // Object 1 eligible for GC
        d2 = new Demo(3);     // Object 2 eligible for GC

        System.gc();          // Request Garbage Collector
    }
}

class Demo {
    int id;

    Demo(int id) {
        this.id = id;
    }

    @Override   // Good practice to mark overriding methods
    protected void finalize() {
        System.out.println("Object " + id + " is garbage collected");
    }
}

/*

What is Garbage Collection (GC)?

In Java, objects are created in the Heap memory using new.
When no reference variable points to an object anymore, it becomes eligible for Garbage Collection.
The Garbage Collector (GC) is a background JVM process that automatically frees memory by destroying unused objects




*/