// Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
// Hint => 
// Take the input for a number
// Find the count of digits in the number
// Find the digits in the number and save them in an array
// Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
// Display the frequency of each digit in the number

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter the number");
        int number = sc.nextInt();  // Read the input number

        // Initialize a variable to count the number of digits in the number
        int count = 0;
        int temp = number;  // Use a temporary variable to avoid modifying the original number

        // Loop to count the number of digits in the number
        while (temp != 0) {
            temp /= 10;  // Remove the last digit
            count++;  // Increment the digit count
        }

        // Create an array to store each digit of the number
        int[] digits = new int[count];
        int index = 0;

        // Loop to extract digits from the number and store them in the digits array
        while (number != 0) {
            digits[index] = number % 10;  // Get the last digit
            number /= 10;  // Remove the last digit
            index++;  // Move to the next index in the array
        }

        // Create an array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Loop through the digits array and update the frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;  // Increment the frequency count for the current digit
        }

        // Print the frequency of each digit
        System.out.println("The frequency of each digit in the number is");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] != 0) {  // Only print digits that appear at least once
                System.out.println(i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
