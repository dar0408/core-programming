// Write a program to find the frequency of characters in a string using nested loops and display the result


import java.util.Scanner;

public class FrequencyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a text
        System.out.println("Enter the text");
        String text = sc.nextLine();

        // Get the character frequencies
        String[][] result = findFrequency(text);

        // Display character frequencies
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            // Use .equals() to compare strings instead of "!="
            if (!result[i][1].equals("0")) {
                System.out.println(result[i][0] + "\t\t" + result[i][1]);
            }
        }
    }

    // Function to compute the frequency of each character
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters

        // Count occurrences of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // 2D String array to store characters and their frequency
        String[][] result = new String[256][2];

        // Populate the result array
        for (int i = 0; i < 256; i++) {
            result[i][0] = Character.toString((char) i); // Store character as a string
            result[i][1] = Integer.toString(frequency[i]); // Convert frequency to string
        }
        return result;
    }
}




// Hint => 
// Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. The logic used here is as follows:
// Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
// Loops to Find the frequency of each character in the text and store the result in a frequency array. For this use a Nested Loop with an Outer loop to iterate through each character in the text and initialize the frequency of each character to 1. And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to avoid counting them again.
// Create a 1D String array to store the characters and their frequencies. For this Iterate through the characters in the text and store the characters and their frequencies 
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
