// 5. Palindrome Checker:

import java.util.Scanner;  // Importing Scanner class for user input

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for user input
        
        // Prompting user to enter a string
        System.out.println("Enter a string: ");
        String str = sc.nextLine();  // Reading the input string
        
        // Checking if the entered string is a palindrome
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");  // If palindrome
        } else {
            System.out.println(str + " is not a palindrome.");  // If not palindrome
        }
    }

    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;  // Initializing pointers at the beginning and end of the string
        
        // Loop to check if characters at both ends are equal
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {  // If characters don't match, return false
                return false;
            }
            i++;  // Moving the left pointer towards the right
            j--;  // Moving the right pointer towards the left
        }
        return true;  // If all characters match, it's a palindrome
    }
}


// ○ Write a program that checks if a given string is a palindrome (a word, phrase, or
// sequence that reads the same backward as forward).
// ○ Break the program into functions for input, checking the palindrome condition,
// and displaying the result.