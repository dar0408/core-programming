// Write a program to check whether a number is positive, negative, or zero.
// Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        // Read the number from user input
        int number = sc.nextInt();

        // Call the checkNumber method to determine if the number is positive, negative, or zero
        int result = checkNumber(number);

        // Output the result based on the value returned by checkNumber method
        if (result == 1) {
            // If result is 1, the number is positive
            System.out.println("The number is positive");
        } else if (result == -1) {
            // If result is -1, the number is negative
            System.out.println("The number is negative");
        } else {
            // If result is 0, the number is zero
            System.out.println("The number is zero");
        }
    }

    // Method to check whether the number is positive, negative, or zero
    public static int checkNumber(int number) {
        // If the number is greater than 0, return 1 (positive)
        if (number > 0) {
            return 1;
        } 
        // If the number is less than 0, return -1 (negative)
        else if (number < 0) {
            return -1;
        } 
        // If the number is equal to 0, return 0
        else {
            return 0;
        }
    }
}
