// Find unique characters in a string using the charAt() method and display the result

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        
        System.out.println("Enter the text");
        String text = sc.nextLine();
        
        int length = findLength(text); // Get the length of the text
        char[] unique = findUnique(text); // Find unique characters
        
        System.out.println("Length of the text is " + length);
        System.out.println("Unique characters in the text are:");
        
        // Print unique characters
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }

    // Method to find the length of the string
    public static int findLength(String text) {
        int length = 0;
        
        for (int i = 0; i < text.length(); i++) {
            length++;
        }
        
        return length;
    }

    // Method to find unique characters in the string
    public static char[] findUnique(String text) {
        char[] result = new char[text.length()];
        int k = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;

            // Check if the character has already appeared
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Add unique character to the result array
            if (isUnique) {
                result[k++] = text.charAt(i);
            }
        }

        // Copy only unique characters to a new array of correct size
        char[] unique = new char[k];
        for (int i = 0; i < k; i++) {
            unique[i] = result[i];
        }

        return unique;
    }
}




// Hint => 
// Create a Method to find the length of the text without using the String method length()
// Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array. The logic used here is as follows:
// Create an array to store the unique characters in the text. The size is the length of the text
// Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array
// Create a new array to store the unique characters 
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
