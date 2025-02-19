// Write a program to split the text into words and return the words along with their lengths in a 2D array

import java.util.Scanner;

public class SplitAndLength {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        // Split the string into words using the splitWords method
        String[] words = splitWords(str);
        
        // Get the words and their corresponding lengths
        String[][] wordsLength = splitWordsLength(words);
        
        // Output the words and their lengths
        System.out.println("Words and their lengths: ");
        System.out.println("Word\tLength");
        for (String[] word : wordsLength) {
            // Print each word and its length
            System.out.println(word[0] + "\t" + Integer.parseInt(word[1]));
        }
    }

    // Method to split the string into words based on spaces
    public static String[] splitWords(String str) {
        // Variable to count spaces in the string
        int count = 0;
        
        // Array to store the index positions of spaces
        int[] spaces = new int[str.length()];
        
        // Loop through the string to find the positions of spaces
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaces[count] = i;  // Store the space index
                count++;  // Increment space count
            }
        }
        
        // Array to store the words (count + 1 because the last word doesn't have a space after it)
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

    // Method to get the words and their corresponding lengths
    public static String[][] splitWordsLength(String[] words) {
        // Array to store words and their lengths
        String[][] wordsLength = new String[words.length][2];
        
        // Loop through the words and calculate the length of each word
        for (int i = 0; i < words.length; i++) {
            wordsLength[i][0] = words[i];  // Store the word
            wordsLength[i][1] = String.valueOf(findLength(words[i]));  // Store the length as a string
        }
        
        // Return the array containing words and their lengths
        return wordsLength;
    }

    // Method to find the length of a word by counting characters
    public static int findLength(String str) {
        int count = 0;
        
        // Try to access each character of the string until an exception occurs (end of string)
        try {
            while (true) {
                str.charAt(count);  // Access the character at position 'count'
                count++;  // Increment the count for each character
            }
        } catch (Exception e) {
            // Once the end of the string is reached, return the total count (length)
            return count;
        }
    }
}






// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
// Create a method to find and return a string's length without using the length() method. 
// Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
// The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display


