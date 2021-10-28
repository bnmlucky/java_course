package chapter6;

public class Rectangle {
    private double length;
    private double width;

    // constructor, you can have as many as you want
    public Rectangle(){
        length = 0;
        width = 0;
    }

    // another constructor
    public Rectangle(double length, double width) {
       this.length = length; // can be set this way
       setWidth(width); // can be set through calling a setter method
    }

    //getter
    public double getLength() {
        return length;
    }

    //setter
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
// it's either getter and setter methods or using a constructor instead.  All objects have a constructor.
    public double calculatePerimeter() {
        return(2 * length + 2 * width);
    }

    public double calculateArea() {
        return length * width;
    }
}
// Encapsulation - when you create a class representing an object, your fields should be private.
// Make your methods to access those fields public