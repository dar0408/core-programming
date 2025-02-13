// Create a program to find the factors of a number taken as user input.
// Hint => 
// Get input value for a variable named number.
// Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i.

import java.util.Scanner; // Import Scanner class for user input

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
        
        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // Read the input number from the user
        
        // Loop through all numbers from 1 to number - 1 to check for factors
        for (int i = 1; i < number; i++) { 
            // If number is divisible by i, then i is a factor
            if (number % i == 0) { 
                System.out.println(i); // Print the factor
            }
        }
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
