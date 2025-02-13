// Create a program to find the power of a number.
// Hint => 
// Get integer input for two variables named number and power.
// Create a result variable with an initial value of 1.
// Run a for loop from i = 1 to i <= power.
// In each iteration of the loop, multiply the result with the number and assign the value to the result.
// Finally, print the result
import java.util.Scanner; // Import Scanner class for user input

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        // Prompt the user to enter the base number
        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // Read the base number

        // Prompt the user to enter the power (exponent)
        System.out.println("Enter the power: ");
        int power = sc.nextInt(); // Read the exponent

        int result = 1; // Initialize result to 1 (multiplicative identity)

        // Loop to calculate power (number^power)
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by number in each iteration
        }

        // Print the final result
        System.out.println("The result is " + result);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
