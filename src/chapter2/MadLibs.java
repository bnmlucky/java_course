package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){

        System.out.println("Let's play Mad Libs.");
        // 1. Ask the user to enter an adjective.
        System.out.println("Please enter an adjective.");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.nextLine();
        // 2. Ask the user to enter a season of the year.
        System.out.println("Please enter a season of the year.");
        String season = scanner.nextLine();
        // 3. Ask the user a whole number.
        System.out.println("Please enter a whole number.");
        int numberOfCups = scanner.nextInt();
        scanner.close();
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + numberOfCups + " cups of coffee.");

    }
}
