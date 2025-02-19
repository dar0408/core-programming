// Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates

import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of chocolates
        System.out.println("Enter the number of chocolates: ");
        // Read the number of chocolates
        int numberOfChocolates = sc.nextInt();

        // Prompt the user to enter the number of children
        System.out.println("Enter the number of children: ");
        // Read the number of children
        int numberOfChildren = sc.nextInt();

        // Call the findRemainderAndQuotient method to find the number of chocolates per child and the remainder
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Output the result to the user
        System.out.println("Each child will get " + result[0] + " chocolates and the remaining chocolates are " + result[1]);
    }

    // Method to calculate the quotient and remainder of division
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Create an array to store the quotient and remainder
        int[] result = new int[2];
        // Calculate the quotient (number of chocolates per child)
        result[0] = number / divisor;
        // Calculate the remainder (remaining chocolates)
        result[1] = number % divisor;
        // Return the result array
        return result;
    }
}

// Hint => 
// Get an integer value from user for the numberOfchocolates and numberOfChildren.
// Write the method to find the number of chocolates each child gets and number of remaining chocolates
// public static int[] findRemainderAndQuotient(int number, int divisor) 
