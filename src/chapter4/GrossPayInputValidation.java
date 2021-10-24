package chapter4;

import java.util.Scanner;

/*
WHILE LOOP
Each store employee makes $15 an hour.  Write a program that allows the employee
to enter the number of hours worked for the week.  Do not allow overtime.
 */
public class GrossPayInputValidation {
    public static void main(String[] args) {

        // Initialize known variables
        int rate = 15;
        int maxHours = 40;

        // Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Validate input
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry.  Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
            // hoursWorked is called Sentinel and needs to be updated inside the while loop as it's the exit condition
        }
        scanner.close();
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
/*
While Loop
Condition-controlled
Loop continues running while the specified condition remains true
Pre-test
Condition is tested before entering the loop
Execution
Best to use when the loop may or may not need to execute, based on the situation
Step 01
Starts with a condition to determine if loop needs to execute.
Step 02
Executes statements inside of loop.
Step 03
Rechecks condition to determine if to repeat.
 */