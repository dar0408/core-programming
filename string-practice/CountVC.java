// 1. Count Vowels and Consonants
// Problem:
// Write a Java program to count the number of vowels and consonants in a given string.

import java.util.Scanner;

public class CountVC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Variables to count vowels and consonants
        int vCount = 0, cCount = 0;

        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        // Loop through each character in the string
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character

            // Check if the character is a vowel
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++; // Increment vowel count
            } 
            // Check if the character is a consonant (i.e., a letter but not a vowel)
            else if(ch >= 'a' && ch <= 'z') {
                cCount++; // Increment consonant count
            }
        }

        // Print the number of vowels and consonants
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}
