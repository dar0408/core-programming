// Write a program to take 2 numbers and print their quotient and reminder
import java.util.Scanner;

public class Reminder {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter the number: ");
        // Read the number from user input
        int number = sc.nextInt();

        // Prompt the user to enter the divisor
        System.out.println("Enter the divisor: ");
        // Read the divisor from user input
        int divisor = sc.nextInt();

        // Call the findRemainderAndQuotient method to get the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Output the quotient and remainder to the user
        System.out.println("The quotient is " + result[0] + " and the remainder is " + result[1]);
    }

    // Method to calculate the quotient and remainder of a division
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Create an array to store the quotient and remainder
        int[] result = new int[2];
        
        // Calculate the quotient and store it in result[0]
        result[0] = number / divisor;
        
        // Calculate the remainder and store it in result[1]
        result[1] = number % divisor;

        // Return the result array containing the quotient and remainder
        return result;
    }
}

// Hint => 
// Take user input as integer
// Use division operator (/) for quotient and moduli operator (%) for reminder
// Write Method to find the reminder and the quotient of a number 
// public static int[] findRemainderAndQuotient(int number, int divisor) 
