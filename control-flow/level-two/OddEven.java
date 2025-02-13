// Create a program to print odd and even numbers between 1 to the number entered by the user.
// Hint => 
// Get an integer input from the user, assign to a variable number and check for Natural Number
// Using a for loop, iterate from 1 to the number
// In each iteration of the loop, print the number is odd or even number

import java.util.Scanner; // Import Scanner class for user input

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // Read the input number from the user

        // Check if the number is negative
        if (number < 0) {
            System.out.println("Please enter a natural number"); // Prompt user for valid input
        } else {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else { // If not even, it's odd
                    System.out.println(i + " is an odd number");
                }
            }
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
