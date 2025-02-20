// 5. Find the Longest Word in a Sentence
// Problem:
// Write a Java program that takes a sentence as input and returns the longest word in the
// sentence.

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input sentence from the user
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words using space as the delimiter
        String[] words = sentence.split(" ");

        // Initialize the longest word as an empty string
        String longestWord = "";

        // Loop through each word in the words array
        for(String word : words) {
            // If the current word is longer than the longestWord, update it
            if(word.length() > longestWord.length()) {
                longestWord = word; // Update the longest word
            }
        }

        // Print the longest word
        System.out.println("Longest word: " + longestWord);
    }
}
