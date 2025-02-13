// Create a program to print the greatest factor of a number beside itself using a loop.
// Hint => 
// Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
// Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
// Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
// Display the greatestFactor variable outside the loop

import java.util.Scanner; // Import Scanner class for user input

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take user input

        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // Read the input number from the user

        int greatestFactor = 1; // Initialize the greatest factor with 1

        // Loop to find the greatest factor, starting from (number - 1) down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if i is a factor of the given number
                greatestFactor = i; // Store the first (largest) factor found
                break; // Exit the loop after finding the greatest factor
            }
        }

        // Print the greatest factor
        System.out.println("The greatest factor of " + number + " is " + greatestFactor);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
