public class Wrapper {
    public static void main(String[] args) {
       Integer a=10;
       System.out.println(a.toString());
    }
}
/*
Wrapper classes are classes that “wrap” Java primitive types into objects.

Why do we need Wrapper Classes?

1.Collections (like ArrayList, HashMap) :-
  Collections in Java work with objects, not primitives.
  ArrayList<int> list = new ArrayList<>(); // ❌ not allowed
  ArrayList<Integer> list = new ArrayList<>(); // ✅ Wrapper class

2.Utility methods
  int num = Integer.parseInt("100"); // string → int

3.OOP Features
  Primitives don’t have methods, wrappers do.
  Integer x = 10;
  System.out.println(x.toString()); // "10"
*/