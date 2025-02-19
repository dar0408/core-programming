// Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 

import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        // Check if the number is a natural number (non-negative)
        if (num < 0) {
            System.out.println("Please enter a natural number");  // Error message for invalid input
            System.exit(0);  // Exit the program if input is invalid
        }
        
        // Call and display the sum of natural numbers using recursion
        System.out.println("Sum of " + num + " natural numbers using recursion: " + sumOfNaturalNumbers(num));
        
        // Call and display the sum of natural numbers using the formula
        System.out.println("Sum of " + num + " natural numbers using formula: " + sumOfNaturalNumbersFormula(num));
    }

    // Recursive method to calculate the sum of first 'num' natural numbers
    static int sumOfNaturalNumbers(int num) {
        // Base case: if the number is 0, return 0 (end of recursion)
        if (num == 0) {
            return 0;
        }
        // Recursive case: sum the current number and the sum of remaining numbers
        return num + sumOfNaturalNumbers(num - 1);
    }

    // Formula-based method to calculate the sum of first 'num' natural numbers
    static int sumOfNaturalNumbersFormula(int num) {
        // Use the formula: n * (n + 1) / 2
        return num * (num + 1) / 2;
    }
}

// Hint => 
// Take the user input number and check whether it's a Natural number, if not exit
// Write a Method to find the sum of n natural numbers using recursion
// Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
// Compare the two results and print the result
