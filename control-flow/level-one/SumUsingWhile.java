// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
// Hint => 
// Use infinite while loop as in while (true)
// Take the user entry and check if the user entered 0 or a negative number to break the loop using break;

import java.util.Scanner;

public class SumUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0; // Variable to store the sum of numbers
        double num;

        // Infinite while loop that will continue until a non-positive number is entered
        while (true) {
            System.out.println("Enter the number: ");
            num = sc.nextDouble(); // Read the number from the user

            // If the number is 0 or negative, exit the loop
            if (num <= 0) {
                break;
            }

            total += num; // Add the valid number to the total sum
        }

        // Display the final sum of entered numbers
        System.out.println("The sum of numbers is " + total);
    }
}
