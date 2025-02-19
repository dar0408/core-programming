// Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result

import java.util.Scanner;

public class ReturnCharacter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a text
        System.out.println("Enter the text: ");
        String text = sc.next(); // Read the input text from the user

        // Display the characters extracted from the string
        System.out.println("Characters in the string: " + returnCharacters(text));

        // Compare the returned string from returnCharacters() with the original string converted to a character array
        System.out.println("Are the characters equal? " + compareArrays(returnCharacters(text), text.toCharArray()));
    }

    // Method to return the characters of a string as a concatenated result
    public static String returnCharacters(String text) {
        String result = ""; // Initialize an empty string to store the characters
        
        // Loop through each character of the input string
        for (int i = 0; i < text.length(); i++) {
            result += text.charAt(i); // Append each character to the result string
        }
        return result; // Return the concatenated result
    }

    // Method to compare a string with a character array
    public static boolean compareArrays(String str1, char[] str2) {
        // If lengths do not match, return false immediately
        if (str1.length() != str2.length) {
            return false;
        }

        // Loop through each character and compare them
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2[i]) { // If any character is different, return false
                return false;
            }
        }
        return true; // If all characters match, return true
    }
}



// Hint => 
// Take user input using the  Scanner next() method to take the text into a String variable
// Write a method to return the characters in a string without using the toCharArray() 
// Write a method to compare two string arrays and return a boolean result
// In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
