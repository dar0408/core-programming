// Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
// Hint => 
// Take user input for a number. 
// Find the count of digits in the number. 
// Find the digits in the number and save them in an array
// Create an array to store the elements of the digits array in reverse order
// Finally, display the elements of the array in reverse order  
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter the number");
        int number = sc.nextInt();  // Read the number input by the user

        // Initialize a variable to count the number of digits in the number
        int count = 0;
        int temp = number;  // Create a temporary variable to preserve the original number

        // Count the number of digits in the number
        while (temp != 0) {
            temp /= 10;  // Remove the last digit
            count++;     // Increment the digit count
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];
        int index = 0;

        // Store each digit of the number in the digits array
        while (number != 0) {
            digits[index] = number % 10;  // Get the last digit of the number
            number /= 10;  // Remove the last digit from the number
            index++;  // Move to the next index in the digits array
        }

        // Create an array to store the reversed digits
        int[] reverse = new int[count];

        // Reverse the order of the digits
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - i - 1];  // Assign the digits in reverse order
        }

        // Print the reverse of the number
        System.out.println("The reverse of the number is");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);  // Print each digit of the reversed number
        }
    }
}
