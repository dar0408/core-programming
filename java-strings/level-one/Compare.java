// Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method


import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter the first string
        System.out.println("Enter the first string: ");
        String str1 = sc.next();  // Read the first string from the user
        
        // Ask the user to enter the second string
        System.out.println("Enter the second string: ");
        String str2 = sc.next();  // Read the second string from the user
        
        // Call the compareStrings method and print the result
        System.out.println(compareStrings(str1, str2));  // Output true if the strings are equal, false otherwise
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        // First, check if the lengths of the two strings are different
        if (str1.length() != str2.length()) {
            return false;  // If lengths are different, the strings are not equal
        }
        
        // Loop through each character of the strings
        for (int i = 0; i < str1.length(); i++) {
            // Compare characters at the same position in both strings
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;  // If any character is different, the strings are not equal
            }
        }
        
        // If all characters match, return true
        return true;
    }
}




// Hint => 
// Take user input using the  Scanner next() method for 2 String variables
// Write a method to compare two strings using the charAt() method and return a boolean result
// Use the String Built-In method to check if the results are the same and display the result 
