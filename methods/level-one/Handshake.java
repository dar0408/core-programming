// Create a program to find the maximum number of handshakes among N number of students.

import java.util.Scanner;

public class Handshake {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.println("Enter the number of students: ");
        // Read the number of students
        int n = sc.nextInt();

        // Call the calculateHandshakes method to calculate the number of handshakes
        int handshakes = calculateHandshakes(n);

        // Output the result to the user
        System.out.println("The maximum number of handshakes among " + n + " students is " + handshakes);
    }

    // Method to calculate the maximum number of handshakes in a group of n students
    public static int calculateHandshakes(int n) {
        // The formula for calculating handshakes is (n * (n - 1)) / 2
        return (n * (n - 1)) / 2;
    }
}

// Hint => 
// Get integer input for number of students
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Write a method to use the combination formulae to calculate the number of handshakes
