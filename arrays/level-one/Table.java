// Create a program to print a multiplication table of a number.
// Hint => 
// Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
// Run a loop from 1 to 10 and store the results in the multiplication table array
// Finally, display the result from the array in the format number * i = ___

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number for the multiplication table
        System.out.println("Enter the number for multiplication table");
        int number = sc.nextInt();

        // Create an array to store the multiplication results
        int[] table = new int[10];  // Store the first 10 multiples of the entered number

        // Loop to calculate the multiplication results and store them in the array
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);  // Multiply the number by (i + 1) and store the result
        }

        // Loop to print the multiplication table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);  // Display each multiplication result
        }
    }
}
