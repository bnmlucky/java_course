package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        // ask for the plan fee
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the plan fee: ");
        double planFee = scanner.nextDouble();

        // ask for overage minutes
        System.out.println("Please enter the amount of overage minutes:");
        int overageMinutes = scanner.nextInt();
        scanner.close();

        double overageCharge = calculateOverages(overageMinutes);
        double taxAmount = calculateTax(planFee + overageCharge);

        // overage minute cost is 0.25
        // tax on the subtotal is 15%

        // print the itemized bill
        calculateAndPrintBill(planFee, overageCharge, taxAmount);
    }
    // a separate method to calculate overage fees
    public static double calculateOverages(double extraMinutes) {
        double overageRate = 0.25;
        double overageAmount = extraMinutes * overageRate; //why is this variable redundant? How can it be done differently?
        return overageAmount;
    }
    // a separate method to calculate tax
    public static double calculateTax(double subtotal) {
        double taxRate = 0.15;
        double taxAmount = subtotal * taxRate; // why is this variable redundant?  How can it be done differently?
        return taxAmount;
    }
    // a separate method to calculate the final total
    public static void calculateAndPrintBill(double planFee, double overageAmount, double taxAmount) {
        double finalTotal = planFee + overageAmount + taxAmount;

        System.out.println("Phone Bill Statement: ");
        System.out.println("Plan Fee: $" + planFee);
        System.out.println("Overage Amount: $" + overageAmount);
        System.out.println("Tax: $" + taxAmount);
        System.out.println("Total: $" + finalTotal);
    }
}
