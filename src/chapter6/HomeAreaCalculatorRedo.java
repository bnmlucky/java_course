package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        /*
        We created an instance of this same very class to get the things that are not static in this class.
        In Java a default constructor is always defined implicitly.
         */
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);
        calculator.scanner.close();
    }
    public Rectangle getRoom() {

        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();


        return new Rectangle(length, width);
    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
