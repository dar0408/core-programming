// 3. Palindrome String Check
// Problem:
// Write a Java program to check if a given string is a palindrome (a string that reads the
// same forward and backward).
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Initialize a flag to check if the string is a palindrome
        boolean isPalindrome = true;

        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        // Loop through the first half of the string
        for(int i = 0; i < str.length() / 2; i++) {
            // Check if the characters at mirrored positions are not the same
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false; // Set flag to false if it's not a palindrome
                break; // Exit the loop as the string is not a palindrome
            }
        }

        // Print whether the string is a palindrome or not
        if(isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
