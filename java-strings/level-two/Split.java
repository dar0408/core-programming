// Write a program to split the text into words, compare the result with the split() method and display the result 

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        // Split the string using the user-defined method
        String[] words = splitWords(str);
        
        // Split the string using the built-in split() method
        String[] words2 = str.split(" ");
        
        // Output the words from the built-in method
        System.out.println("Words using built-in method: ");
        for (String word : words2) {
            System.out.println(word);
        }
        
        // Output the words from the user-defined method
        System.out.println("Words using user-defined method: ");
        for (String word : words) {
            System.out.println(word);
        }
        
        // Compare the two word arrays and print the result
        System.out.println("Are the words equal? " + compareWords(words, words2));
    }

    // User-defined method to split the string into words based on spaces
    public static String[] splitWords(String str) {
        // Variable to count spaces
        int count = 0;
        
        // Array to store the index positions of spaces
        int[] spaces = new int[str.length()];
        
        // Loop through the string to find space positions
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaces[count] = i;  // Store space index
                count++;  // Increment space count
            }
        }
        
        // Create an array to store the words
        String[] words = new String[count + 1];
        
        // Extract the first word (before the first space)
        words[0] = str.substring(0, spaces[0]);
        
        // Loop through the spaces and extract the words
        for (int i = 1; i < count; i++) {
            words[i] = str.substring(spaces[i - 1] + 1, spaces[i]);
        }
        
        // Extract the last word (after the last space)
        words[count] = str.substring(spaces[count - 1] + 1);
        
        // Return the array of words
        return words;
    }

    // Method to compare two arrays of words
    public static boolean compareWords(String[] words, String[] words2) {
        // If the lengths of the two arrays are not equal, they are not the same
        if (words.length != words2.length) {
            return false;
        }
        
        // Loop through the arrays and compare each word
        for (int i = 0; i < words.length; i++) {
            // If any word doesn't match, return false
            if (!words[i].equals(words2[i])) {
                return false;
            }
        }
        
        // If all words match, return true
        return true;
    }
}




// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to find the length of the String without using the built-in length() method. 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
// Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
// Then Create an array to store the words and use the indexes to extract the words
// Create a method to compare the two String arrays and return a boolean
// The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
