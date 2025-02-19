// Write a program to convert the complete text to uppercase and compare the results

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();

        // Compare manually converted uppercase with Java's built-in conversion
        System.out.println("Is the text in uppercase? " + compareStrings(text.toUpperCase(), convertToUpperCase(text)));
    }

    // Method to convert text to uppercase manually
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder(); // Use StringBuilder for better performance
        for (int i = 0; i < text.length(); i++) {
            result.append(Character.toUpperCase(text.charAt(i))); // Use built-in method
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2); // Simplified comparison using equals()
    }
}



// Hint => 
// Take user input using the  Scanner nextLine() method to take the complete text into a String variable
// Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
// Write a method to compare two strings using the charAt() method and return a boolean result
// In the main() use the String built-in method toLowerCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
