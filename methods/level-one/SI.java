// Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

import java.util.Scanner;

public class SI {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the Principal amount
        System.out.println("Enter the Principal amount: ");
        // Read the Principal amount from user input
        double principal = sc.nextDouble();

        // Prompt the user to enter the Rate of Interest
        System.out.println("Enter the Rate of Interest: ");
        // Read the Rate of Interest from user input
        double rate = sc.nextDouble();

        // Prompt the user to enter the Time
        System.out.println("Enter the Time: ");
        // Read the Time from user input
        double time = sc.nextDouble();

        // Call the calculateSimpleInterest method to calculate the simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Output the calculated simple interest to the user
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }

    // Method to calculate the simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Formula for Simple Interest: (Principal * Rate * Time) / 100
        return (principal * rate * time) / 100;
    }
}


// Hint => 
// Simple Interest = Principal * Rate * Time / 100
// Take user input for principal, rate, time
// Write a method to calculate the simple interest given principle, rate and time as parameters
// Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
