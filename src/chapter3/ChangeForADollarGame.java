package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {

        // Declare what I know
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.1;
        double quarter = 0.25;
        int dollar = 1;

        // Ask for what I don't know
        System.out.println("Welcome to the 'Change for a Dollar!' Game." + "Your goal is to get enough change to make exactly $1.00!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number of pennies: ");
        int numberOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels: ");
        int numberOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes: ");
        int numberOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters: ");
        int numberOfQuarters = scanner.nextInt();

        scanner.close();

        // Perform calculations of what I got

        double total = numberOfPennies * penny + numberOfNickels * nickel + numberOfDimes * dime + numberOfQuarters
                * quarter;

        if(total > dollar) {
            double amountOver = total - dollar;
            // Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were over $" + String.format("%.2f", amountOver));
        } else if (total < dollar) {
            double amountShort = dollar - total;
            System.out.println("Sorry, you lose! You were short $" + String.format("%.2f", amountShort));
        } else {
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }
}
