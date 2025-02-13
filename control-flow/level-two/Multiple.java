// Create a program to find all the multiple of a number taken as user input below 100.
// Hint => 
// Get input value for a variable named number.
// Run a for loop backwards: from i = 100 to i = 1.
// Inside the loop, check if i perfectly divides number.
// If true, print the number and continue the loop.

import java.util.Scanner; // Import Scanner class for user input

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // Read the input number from the user

        // Loop from 100 down to 1 to find multiples of the given number
        for (int i = 100; i >= 1; i--) {
            // Check if 'i' is a multiple of the given number
            if (i % number == 0) {
                System.out.println(i); // Print the multiple
            }
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
