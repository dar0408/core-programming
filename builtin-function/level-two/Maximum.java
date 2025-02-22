// 2. Maximum of Three Numbers:

import java.util.Scanner;  // Importing Scanner class for user input

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for user input
        
        // Prompting user to enter three numbers
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        // Finding and displaying the maximum of the three numbers
        System.out.println("Maximum: " + findMaximum(num1, num2, num3));
    }

    // Method to find the maximum of three numbers using Math.max()
    public static int findMaximum(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));  // Returning the largest number
    }
}


// ○ Write a program that takes three integer inputs from the user and finds the
// maximum of the three numbers.
// ○ Ensure your program follows best practices for organizing code into modular
// functions, such as separate functions for taking input and calculating the
// maximum value.