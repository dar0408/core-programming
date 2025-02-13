// Write a Program to find the factorial of an integer entered by the user.
// Hint => 
// For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
// Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
// Using a while loop, compute the factorial.
// Print the factorial at the end.

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        // Checking if the number is a non-negative integer
        if(num >= 0){
            int fact = 1; // Initializing factorial variable
            int i = 1; // Counter variable for the loop

            // Using a while loop to calculate factorial
            while(i <= num){
                fact *= i; // Multiplying fact by i to compute factorial
                i++; // Incrementing i
            }

            // Displaying the factorial of the given number
            System.out.println("The factorial of " + num + " is " + fact);
        } else {
            // If the number is negative, display a message
            System.out.println("The number " + num + " is not a positive integer");
        }
    }
}
