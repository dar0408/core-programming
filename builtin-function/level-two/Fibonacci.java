// 4. Fibonacci Sequence Generator:

import java.util.Scanner;  // Importing Scanner class for user input

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for user input
        
        // Prompting user to enter the number of Fibonacci terms
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        
        // Generating Fibonacci sequence
        generateFibonacci(n);
    }

    // Method to generate and print Fibonacci sequence up to 'n' terms
    public static void generateFibonacci(int n) {
        int num1 = 0, num2 = 1;  // Initializing first two Fibonacci numbers
        System.out.print("Fibonacci Sequence: ");
        
        // Loop to generate Fibonacci numbers
        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");  // Printing current Fibonacci number
            
            int sum = num1 + num2;  // Calculating next Fibonacci number
            num1 = num2;  // Updating first number
            num2 = sum;  // Updating second number
        }
    }
}


// ○ Write a program that generates the Fibonacci sequence up to a specified number
// of terms entered by the user.
// ○ Organize the code by creating a function that calculates and prints the Fibonacci
// sequence.