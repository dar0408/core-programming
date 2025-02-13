// Create a program to check if a number taken from the user is a Harshad Number.
// Hint => 
// A Harshad number is an integer which is divisible by the sum of its digits. 
// For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
// Get an integer input for the number variable.
// Create an integer variable sum with initial value 0.
// Create a while loop to access each digit of the number.
// Inside the loop, add each digit of the number to sum.
// Check if the number is perfectly divisible by the sum.
// If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.

import java.util.Scanner; // Import Scanner class for user input

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        // Prompt the user to enter a number
        System.out.println("Enter the number: ");
        int number = sc.nextInt(); // Read user input
        sc.close(); // Close the scanner to prevent resource leaks

        int sum = 0; // Variable to store the sum of digits
        int originalNumber = number; // Store original number for checking divisibility

        // Calculate the sum of digits of the number
        while (number != 0) {
            int remainder = number % 10; // Get the last digit
            sum += remainder; // Add digit to sum
            number /= 10; // Remove last digit
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println("The number is a Harshad Number"); // Harshad number condition met
        } else {
            System.out.println("The number is not a Harshad Number"); // Not a Harshad number
        }
    }
}
