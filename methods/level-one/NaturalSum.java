// Write a program to find the sum of n natural numbers using loop
// Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 


import java.util.Scanner;

public class NaturalSum {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        // Read the number from user input
        int number = sc.nextInt();

        // Call the findNaturalSum method to calculate the sum
        int sum = findNaturalSum(number);

        // Output the result to the user
        System.out.println("The sum of first " + number + " natural numbers is " + sum);
    }

    // Method to calculate the sum of first 'number' natural numbers
    public static int findNaturalSum(int number) {
        // Initialize sum to 0
        int sum = 0;
        // Loop through numbers from 1 to 'number'
        for (int i = 1; i <= number; i++) {
            // Add each number to the sum
            sum += i;
        }
        // Return the final sum
        return sum;
    }
}
