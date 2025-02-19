// Write a program to find and return the length of a string without using the length() method 
import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Enter a string: "); // Prompt the user to enter a string
        String str = sc.next(); // Read the input string (only first word)
        
        // Display string length using built-in method
        System.out.println("Length of the string using built-in method: " + str.length());
        
        // Display string length using user-defined method
        System.out.println("Length of the string using user-defined method: " + findLength(str));
    }

    // Method to find the length of a string without using built-in methods
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Try accessing characters one by one
                count++; // Increment counter
            }
        } catch (Exception e) { // Catch exception when index goes out of bounds
            return count; // Return the counted length
        }
    }
}


// Hint => 
// Take user input using the Scanner next() method 
// Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
// The main function calls the user-defined method as well as the built-in length() method and displays the result
