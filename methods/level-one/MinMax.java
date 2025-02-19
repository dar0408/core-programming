// Write a program to find the smallest and the largest of the 3 numbers.
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number: ");
        // Read the first number
        int number1 = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number: ");
        // Read the second number
        int number2 = sc.nextInt();

        // Prompt the user to enter the third number
        System.out.println("Enter the third number: ");
        // Read the third number
        int number3 = sc.nextInt();

        // Call the findSmallestAndLargest method to find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Output the result to the user
        System.out.println("The smallest number is " + result[0] + " and the largest number is " + result[1]);
    }

    // Method to find the smallest and largest numbers from three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // Create an array to store the smallest and largest numbers
        int[] result = new int[2];

        // Find the smallest number using Math.min
        result[0] = Math.min(number1, Math.min(number2, number3));

        // Find the largest number using Math.max
        result[1] = Math.max(number1, Math.max(number2, number3));

        // Return the result array containing the smallest and largest numbers
        return result;
    }
}

// Hint => 
// Take user input for 3 numbers
// Write a single method to find the smallest and largest of the three numbers
// public static int[] findSmallestAndLargest(int number1, int number2, int number3)

