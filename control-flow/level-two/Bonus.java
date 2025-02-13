// Create a program to find the bonus of employees based on their years of service.
// Hint => 
// Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
// Take salary and year of service in the year as input.
// Print the bonus amount.

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take user input
        
        // Prompt the user to enter their salary
        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble(); // Read the salary input
        
        // Prompt the user to enter their years of service
        System.out.println("Enter the years of service: ");
        int years = sc.nextInt(); // Read the years of service input

        // Check if the employee has worked for more than 5 years
        if (years > 5) {
            double bonus = salary * 0.05; // Calculate 5% bonus on salary
            System.out.println("The bonus amount is: " + bonus); // Print the bonus amount
        } else {
            System.out.println("No bonus for you!"); // Message for employees with <= 5 years of service
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
