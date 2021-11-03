package chapter11;

public class Rectangle extends Shape {
    //fields
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //constructor
    public Rectangle(double length, double width){
        setLength(length);
        setLength(width);
    }

    // we have to provide the implementation for the abstract method we inherited

    @Override
    double calculateArea() {
        return length * width;
    }
}
