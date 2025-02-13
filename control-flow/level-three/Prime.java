// Write a Program to check if the given number is a prime number or not
// Hint => 
// A number that can be divided exactly only by itself and 1 are Prime Numbers,
// Prime Numbers checks are done for number greater than 1
// Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
// Use isPrime boolean variable to store the result

import java.util.Scanner; // Import Scanner class for user input

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        System.out.println("Enter the number: ");
        int num = sc.nextInt(); // Read the input number from user

        sc.close(); // Close the scanner to prevent resource leaks

        boolean isPrime = true; // Variable to track if the number is prime

        if (num > 1) { // Prime numbers are greater than 1
            for (int i = 2; i < num; i++) { // Loop from 2 to num-1
                if (num % i == 0) { // Check if num is divisible by i
                    isPrime = false; // If divisible, it's not a prime number
                    break; // Exit the loop early
                }
            }
        } else {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        }

        // Output the result
        if (isPrime) {
            System.out.println("The number is a Prime Number");
        } else {
            System.out.println("The number is not a Prime Number");
        }
    }
}
