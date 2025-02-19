// Write a program to find the frequency of characters in a string using the charAt() method and display the result

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a text
        System.out.println("Enter the text");
        String text = sc.nextLine();

        // Calculate character frequency in the given text
        int[][] result = findFrequency(text);

        // Display character frequencies
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            if (result[i][1] != 0) { // Print only characters that appear in the text
                System.out.println((char) result[i][0] + "\t\t" + result[i][1]);
            }
        }
    }

    // Function to compute the frequency of each character in the given text
    public static int[][] findFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of all ASCII characters

        // Count the occurrences of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int[][] result = new int[256][2]; // 2D array to store character and its frequency

        // Store characters and their frequencies in the result array
        for (int i = 0; i < 256; i++) {
            result[i][0] = i; // ASCII value of the character
            result[i][1] = frequency[i]; // Frequency of the character
        }
        return result;
    }
}




// Hint => 
// Create a method to find the frequency of characters in a string using the charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
// Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
// Loop through the text to find the frequency of characters in the text
// Create an array to store the characters and their frequencies
// Loop through the characters in the text and store the characters and their frequencies
// In the main function take user inputs, call user-defined methods, and displays result.  
