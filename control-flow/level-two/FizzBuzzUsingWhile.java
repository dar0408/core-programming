// Rewrite the program 5 FizzBuzz using while loop 

import java.util.Scanner; // Import Scanner class for user input

public class FizzBuzzUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take user input
        
        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // Read the input number from the user
        
        // Check if the number is negative
        if (number < 0) {
            System.out.println("Please enter a positive integer"); // Prompt for valid input
        } else {
            int i = 0; // Initialize loop variable
            
            // Loop using while from 0 to the given number
            while (i <= number) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3 only
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5 only
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // If not divisible by 3 or 5, print the number
                else {
                    System.out.println(i);
                }
                i++; // Increment loop variable
            }
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
