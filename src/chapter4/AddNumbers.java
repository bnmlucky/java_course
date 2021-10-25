package chapter4;

import java.util.Scanner;

/*
DO WHILE LOOP
Write a program that allows a user to enter two numbers,
and then sums up the two numbers.  The user should be able to
repeat this action until they indicate they are done.
 */
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declare a Sentinel variable first
        boolean again;

        do{
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is " + sum);

            // Update the Sentinel inside the loop
            System.out.println("Would you like to start over? Enter 'true' or 'false'.");
            again = scanner.nextBoolean();
        } while (again);
    }
}

/*
Do While Loop
Condition-controlled
Loop continues running while the specified condition remains true.
Post-test
Condition is tested after completing the loop.
Execution
Best to use when the loop may or may not need to exectue, based on the situation.
Step 01
Executes statements inside of loop
Step 02
Checks condition to determine if to repeat
 */
