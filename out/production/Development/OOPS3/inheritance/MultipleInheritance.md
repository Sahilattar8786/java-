# ☕ Multiple Inheritance in Java — A Deep Dive

## 🔍 Overview
**Inheritance** allows one class to acquire the properties and methods of another.  
However, when a class tries to inherit from **more than one parent class**, it is called **Multiple Inheritance**.

In Java, **multiple inheritance using classes is not supported** to avoid **ambiguity** and **complexity** —  
but it **is supported via interfaces**.

---

## 🧠 What is Multiple Inheritance?

### 📖 Definition
> Multiple Inheritance is a feature in which a single class can **inherit from more than one parent class**, thereby acquiring the members of all parent classes.

---

## ⚠️ Why Java Does Not Support Multiple Inheritance (with Classes)

Consider this example 👇

```java
class A {
    void show() {
        System.out.println("Class A");
    }
}

class B {
    void show() {
        System.out.println("Class B");
    }
}

// ❌ This is illegal in Java
class C extends A, B {
    // Error: Java does not support multiple inheritance
}

```

## Due To Multiple Inheritance not supported in Java  *Interface* Cames into picture 
