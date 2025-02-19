// Write a program to find the frequency of characters in a string using unique characters and display the result

import java.util.Scanner;

public class FrequencyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for user input

        // Prompt the user to enter a text
        System.out.println("Enter the text");
        String text = sc.nextLine();

        // Call function to find character frequencies
        int[][] result = findFrequency(text);

        // Display the results
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            if (result[i][1] != 0) { // Only print characters that appear in the text
                System.out.println((char) result[i][0] + "\t\t" + result[i][1]);
            }
        }
    }

 
    // Function to calculate the frequency of characters in a given text.
    
    public static int[][] findFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters

        // Count occurrences of each character in the text
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // 2D array to store characters and their frequencies
        int[][] result = new int[256][2];

        // Populate the result array
        for (int i = 0; i < 256; i++) {
            result[i][0] = i;           // Store ASCII value of the character
            result[i][1] = frequency[i]; // Store corresponding frequency
        }
        return result;
    }
}



// Hint => 
// Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
// Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
// Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
// Loop through the text to find the frequency of characters in the text
// Call the uniqueCharacters() method to find the unique characters in the text
// Create a 2D String array to store the unique characters and their frequencies. 
// Loop through the unique characters and store the characters and their frequencies
// In the main function take user inputs, call user-defined methods, and displays result.
