// Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators

import java.util.Scanner; // Import Scanner class for user input

public class LeepWithIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        // Prompt the user to enter a year
        System.out.println("Enter the year: ");
        int year = sc.nextInt(); // Read user input
        sc.close(); // Close the scanner to prevent resource leaks

        // Check if the year is a leap year using a single if condition
        // Leap year conditions: 
        // - Must be divisible by 4 and not by 100, OR divisible by 400
        if (year >= 1582 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println("The year is a Leap Year");
        } else {
            System.out.println("The year is not a Leap Year");
        }
    }
}
