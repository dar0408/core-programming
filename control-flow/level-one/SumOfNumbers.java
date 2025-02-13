// Write a program to find the sum of numbers until the user enters 0
// Hint => 
// Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
// Use the while loop to check if the user entered is 0
// If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
// The loop will continue till the user enters zero and outside the loop display the total value

import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0; // Variable to store the sum of numbers
        double num;

        // Using a do-while loop to repeatedly take user input and add to total
        do {
            System.out.println("Enter the number: ");
            num = sc.nextDouble(); // Read the number from the user
            total += num; // Add the number to the total sum
        } while (num != 0); // Stop when the user enters 0

        // Display the final sum of entered numbers
        System.out.println("The sum of numbers is " + total);
    }
}
