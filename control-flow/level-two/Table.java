// Create a program to find the multiplication table of a number entered by the user from 6 to 9.
// Hint => 
// Take integer input and store it in the variable number
// Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___ 


import java.util.Scanner; // Import Scanner class for user input

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // Read the number from the user

        // Loop to generate the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Print the multiplication result in the format: number * i = result
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
