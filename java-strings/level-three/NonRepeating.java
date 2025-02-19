// Write a program to find the first non-repeating character in a string and show the result


import java.util.Scanner;

public class NonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for user input

        // Prompt the user to enter a text
        System.out.println("Enter the text");
        String text = sc.nextLine();

        // Call function to find the first non-repeating character
        char result = findNonRepeating(text);

        // Display the result
        if (result != ' ') {
            System.out.println("First non-repeating character in the text is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

   
     // Function to find the first non-repeating character in a given text.
     
    public static char findNonRepeating(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters

        // Count occurrences of each character in the text
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return ' '; // Return space if no unique character is found
    }
}




// Hint => 
// Non-repeating character is a character that occurs only once in the string
// Create a Method to find the first non-repeating character in a string using the charAt() method and return the character. The logic used here is as follows:
// Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
// Loop through the text to find the frequency of characters in the text
// Loop through the text to find the first non-repeating character in the text by checking the frequency of each character
// In the main function take user inputs, call user-defined methods, and displays result. 
