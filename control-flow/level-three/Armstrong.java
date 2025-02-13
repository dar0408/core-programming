// Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
// Hint => 
// Armstrong Number is a number whose Sum of cubes of each digit results in the original number as in for e.g. 153 = 1^3 + 5^3 + 3^3
// Get an integer input and store it in the number variable and define sum variable, initialize it to zero and originalNumber variable and assign it to input number variable
// Use the while loop till the originalNumber is not equal to zero
// In the while loop find the reminder number by using the modulus operator as in  number % 10. Find the cube of the number and add it to the sum variable
// Again in while loop find the quotient of the number and assign it to the original number using number / 10 expression. This romoves the last digit of the original number.
// Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly

import java.util.Scanner; // Import Scanner class for user input

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        // Prompt the user to enter a number
        System.out.println("Enter the number: ");
        int number = sc.nextInt(); // Read the user input
        sc.close(); // Close the scanner to prevent resource leaks

        int sum = 0; // Initialize sum to store the sum of cube of digits
        int originalNumber = number; // Store the original number to compare later

        // Loop to extract each digit and calculate the sum of its cube
        while (originalNumber != 0) {
            int remainder = originalNumber % 10; // Extract last digit
            sum += Math.pow(remainder, 3); // Add the cube of the digit to sum
            originalNumber /= 10; // Remove the last digit
        }

        // Check if the number is an Armstrong Number
        if (number == sum) {
            System.out.println("The number is an Armstrong Number"); // Print if the sum matches the original number
        } else {
            System.out.println("The number is not an Armstrong Number"); // Print if the sum does not match
        }
    }
}
