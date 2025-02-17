// Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
// Hint => 
// Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
// Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
// Finally, display the result from the array in the format number * i = ___

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a number for multiplication table
        System.out.println("Enter the number for multiplication table");
        int number = sc.nextInt();
        
        // Declare an array to store multiplication results
        int[] table = new int[4];
        
        // Calculate the multiplication table for numbers 6 to 9
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 6);
        }
        
        // Display the multiplication table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + table[i]);
        }
    }
}
