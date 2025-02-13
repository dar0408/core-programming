// Create a program to count the number of digits in an integer.
// Hint => 
// Get an integer input for the number variable.
// Create an integer variable count with value 0.
// Use a loop to iterate until number is not equal to 0.
// Remove the last digit from number in each iteration
// Increase count by 1 in each iteration.
// Finally display the count to show the number of digits

import java.util.Scanner; // Import Scanner class for user input

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        // Prompt the user to enter a number
        System.out.println("Enter the number: ");
        int number = sc.nextInt(); // Read the input number
        sc.close(); // Close the scanner to prevent resource leaks

        int count = 0; // Initialize counter to count digits

        // Loop to count the number of digits in the integer
        while (number != 0) {
            number /= 10; // Remove the last digit of the number
            count++; // Increase the count
        }

        // Print the total count of digits
        System.out.println("The number of digits in the integer is: " + count);
    }
}
