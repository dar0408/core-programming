// Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results

import java.util.Scanner; // Import Scanner class for user input

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Prompt user to enter a string
        System.out.println("Enter the text: ");
        String text = sc.next(); // Read the input string

        // Prompt user to enter the start index for the substring
        System.out.println("Enter the start index: ");
        int start = sc.nextInt(); // Read the start index

        // Prompt user to enter the end index for the substring
        System.out.println("Enter the end index: ");
        int end = sc.nextInt(); // Read the end index

        // Generate substring using a custom method that uses charAt()
        System.out.println("Substring using charAt(): " + createSubstring(text, start, end));

        // Generate substring using Java's built-in substring() method
        System.out.println("Substring using substring(): " + text.substring(start, end));

        // Compare the two generated substrings and display if they are equal
        System.out.println("Are the substrings equal? " + compareStrings(createSubstring(text, start, end), text.substring(start, end)));
    }

    // Method to create a substring manually using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = ""; // Initialize an empty string to store the substring

        // Loop through the specified range and append characters to result
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result; // Return the manually created substring
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        // If lengths do not match, return false immediately
        if (str1.length() != str2.length()) {
            return false;
        }

        // Loop through each character and compare
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) { // If any character is different, return false
                return false;
            }
        }
        return true; // Return true if all characters match
    }
}






// Hint => 
// Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
// Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
// Write a method to compare two strings using the charAt() method and return a boolean result
// Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
