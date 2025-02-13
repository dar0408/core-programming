// Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
// Hint => 
// Get integer input from the user and store it in the age variable.
// If the person is 18 or older, print "The person can vote." Otherwise, print "The person cannot vote." 
// I/P => age
// O/P => If the person's age is greater or equal to 18 then the output is 
// The person's age is ___ and can vote.
// Otherwise 
// The person's age is ___ and cannot vote.

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter the age: ");
        
        // Check if input is a valid integer
        if (sc.hasNextInt()) { 
            int age = sc.nextInt(); // Read the integer input

            // Check if the entered age is a valid positive number
            if (age >= 0) { 
                // Check if the person is eligible to vote
                if (age >= 18) { 
                    System.out.println("The person's age is " + age + " and they can vote.");
                } else {
                    System.out.println("The person's age is " + age + " and they cannot vote.");
                }
            } else {
                // Handle invalid negative age input
                System.out.println("Invalid age! Age cannot be negative.");
            }
        } else {
            // Handle non-integer input
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
