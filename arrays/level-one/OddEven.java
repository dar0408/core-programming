// Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
// Hint => 
// Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
// Create an integer array for even and odd numbers with size = number / 2 + 1
// Create index variables for odd and even numbers and initialize them to zero
// Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
// Finally, print the odd and even numbers array using the odd and even index

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter the number");
        int number = sc.nextInt();

        // If the number is less than or equal to 0, ask for a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
            System.exit(0); // Exit the program if the input is invalid
        }

        // Create arrays to store odd and even numbers
        int[] odd = new int[number / 2 + 1];  // Array for odd numbers
        int[] even = new int[number / 2 + 1]; // Array for even numbers

        // Variables to keep track of the current index for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop through the numbers from 1 to the input number
        for (int i = 1; i <= number; i++) {
            // Check if the number is even or odd
            if (i % 2 == 0) {
                even[evenIndex] = i;  // Store even numbers in the 'even' array
                evenIndex++;  // Increment the even index
            } else {
                odd[oddIndex] = i;  // Store odd numbers in the 'odd' array
                oddIndex++;  // Increment the odd index
            }
        }

        // Print the odd numbers
        System.out.println("The odd numbers are");
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(odd[i]);
        }

        // Print the even numbers
        System.out.println("The even numbers are");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(even[i]);
        }
    }
}
