// Write a program FizzBuzz, take a number as user input, and if it is a positive integer loop from 0 to the number and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
// Hint => 
// Write the program and use for loop

import java.util.Scanner; // Import Scanner class for user input

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take user input
        
        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // Read the input number from the user
        
        // Check if the number is negative
        if (number < 0) {
            System.out.println("Please enter a positive integer"); // Prompt for valid input
        } else {
            // Iterate from 0 to the given number
            for (int i = 0; i <= number; i++) {
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
            }
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
