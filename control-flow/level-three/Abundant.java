// Create a program to check if a number is an Abundant Number.
// Hint => 
// An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
// Divisor of 12: 1, 2, 3, 4, 6
// Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
// Get an integer input for the number variable.
// Create an integer variable sum with initial value 0.
// Run a for loop from i = 1 to i < number.
// Inside the loop, check if number is divisible by i.
// If true, add i to sum.
// Outside the loop Check if sum is greater than number.
// If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number.
import java.util.Scanner; // Import Scanner class for user input

public class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        // Prompt the user to enter a number
        System.out.println("Enter the number: ");
        int number = sc.nextInt(); // Read the user input
        sc.close(); // Close the scanner to prevent resource leaks

        int sum = 0; // Initialize sum to store the sum of factors

        // Loop to find the sum of proper divisors (excluding the number itself)
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if 'i' is a factor of 'number'
                sum += i; // Add the factor to sum
            }
        }

        // Check if the number is an Abundant Number
        if (sum > number) {
            System.out.println("The number is an Abundant Number"); // Print if sum is greater than the number
        } else {
            System.out.println("The number is not an Abundant Number"); // Print if sum is less than or equal to the number
        }
    }
}
