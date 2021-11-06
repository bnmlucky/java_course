package chapter13;

public class DivideByZero {
    public static void main(String[] args) {
        try {
            int c = 30/0;
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("You can't divide by zero.");
        } finally {
            System.out.println("Division is fun.");
        }
    }
}
