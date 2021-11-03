package chapter11;

public interface Product {
    // no defined field within an interface because if you define them, they'd have to be final
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String getBarcode() {
        return "no barcode";
    }
}

/*
Interface Key Points
Not for Instantiation
Interfaces cannot be instantiated
Implement
Interfaces are implemented (not extended)
Abstract if not implemented
Any class that implements an interface, must
implement all of its methods or it must declare
itself abstract.
Abstract Methods
Method in an interface must be abstract (no
explicit declaration needed) or default.
 */
