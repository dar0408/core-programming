// 2. Reverse a String
// Problem:
// Write a Java program to reverse a given string without using any built-in reverse
// functions.

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Initialize an empty string to store the reversed string
        String rev = "";

        // Loop through the original string in reverse order
        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i); // Append each character to the result string
        }

        // Print the reversed string
        System.out.println("Reversed string: " + rev);
    }
}
