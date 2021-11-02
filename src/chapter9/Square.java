package chapter9;

public class Square extends Rectangle {

    @Override //override annotation
    public double calculatePerimeter() { // this is how you override a method
        return sides * length; // exact same signature, but change the body
    }

    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
// Overloading methods - is when you have methods with the exact same name,
// but with different parameter lists.
/*
Limiting Access in Inheritance
Constructors are not inherited
Constructors are not technically members of a class and therefore are not inherited.
Public and protected members
All public and protected methods and fields in a superclass are inherited by its subclasses.
Private members
Private methods and fields are not inherited.
Final methods
Final methods are inherited but cannot be overridden.
Chain of inheritance.
 */