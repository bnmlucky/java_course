package chapter11;

 public abstract class Shape {
    abstract double calculateArea();
    public void print() {
        System.out.println("I am a shape.");
    }
}
/*
Abstraction Key Points
Templates
Abstract classes and methods are templates that are meant to be implemented by their subclasses.
Reserved Word
Classes and methods are declared abstract by using the abstract keyword.
Implementation Required on Inheritance
If a subclass extends from an abstract class, it must implement its abstract methods, or be declared abstract itself.
Abstract Classes
Abstract classes cannot be instantiated.  It is only to be used as a superclass.
If even one method in a class is abstract, the class must be declared abstract as well.
 */
