// Write a program to check if two texts are anagrams and display the result


import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the first text
        System.out.println("Enter the first text");
        String text1 = sc.nextLine();
        
        // Prompt the user to enter the second text
        System.out.println("Enter the second text");
        String text2 = sc.nextLine();
        
        // Call the method to check if the two texts are anagrams and display the result
        System.out.println("Are the texts anagrams? " + areAnagrams(text1, text2));
    }

    // Method to check if the two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // If the lengths of the strings are different, they can't be anagrams
        if (text1.length() != text2.length()) {
            return false; // Return false if lengths are not equal
        }
        
        // Create two arrays to store the frequency of each character for both texts
        int[] frequency1 = new int[256]; // Array for text1
        int[] frequency2 = new int[256]; // Array for text2
        
        // Loop through each character of the texts and count their frequencies
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++; // Increment the count for text1
            frequency2[text2.charAt(i)]++; // Increment the count for text2
        }
        
        // Compare the frequency of each character in both texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; // Return false if the frequencies don't match
            }
        }
        
        // If all character frequencies match, the texts are anagrams
        return true;
    }
}




// Hint => 
// An anagram is a word or phrase formed by rearranging the same letters to form different words or phrases,
// Write a method to check if two texts are anagrams. The logic used here is as follows:
// Check if the lengths of the two texts are equal
// Create an array to store the frequency of characters in the strings for the two text
// Find the frequency of characters in the two texts using the loop
// Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
// In the main function take user inputs, call user-defined methods, and displays result.  
