// Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
// Hint => 
// Create a number variable and Take user input. 
// Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
// Create an integer variable index with the value 0 to reflect the array index.
// Use a loop to iterate until the number is not equal to 0.
// Remove the last digit from the number in each iteration and add it to the array.
// Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
// Define variable to store largest and second largest digit and initialize it to zero
// Loop through the array and use conditional statements to find the largest and second largest number in the array
// Finally display the largest  and second-largest number


import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter the number");
        int number = sc.nextInt();  // Read the input number

        // Initialize variables: maxDigit is the maximum number of digits to handle
        int maxDigit = 10;
        int[] digits = new int[maxDigit];  // Array to store individual digits
        int index = 0;

        // Loop to extract digits from the number and store them in the digits array
        while (number != 0) {
            digits[index] = number % 10;  // Get the last digit of the number
            number /= 10;  // Remove the last digit from the number
            index++;  // Move to the next index of the array
            if (index == maxDigit) {  // If the number has more than 10 digits, break the loop
                break;
            }
        }

        // Initialize variables to track the largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Loop through the digits array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;  // Update second largest before updating largest
                largest = digits[i];  // Update largest digit
            } else if (digits[i] > secondLargest) {
                secondLargest = digits[i];  // Update second largest if the current digit is greater
            }
        }

        // Print the largest and second largest digits
        System.out.println("The largest digit is " + largest);
        System.out.println("The second largest digit is " + secondLargest);
    }
}
