// Write a program to demonstrate StringIndexOutOfBoundsException

import java.util.Scanner;

public class IndexOBE {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter a text
        System.out.println("Enter the text: ");
        String text = sc.next();  // Read the text input from the user
        
        // Call method to generate an exception (accessing an invalid index)
        generateException(text);
        
        // Call method to handle the exception and demonstrate error handling
        handleException(text);
    }

    // Method to generate an exception by accessing an invalid index
    public static void generateException(String text) {
        // Try to access the character at an invalid index (length of the string)
        // This will throw StringIndexOutOfBoundsException as the index is out of bounds
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle exceptions using try-catch block
    public static void handleException(String text) {
        try {
            // Try to access the invalid index (this will throw the exception)
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the StringIndexOutOfBoundsException and print a message
            System.out.println("StringIndexOutOfBoundsException caught");
        }
    }
}





// Hint => 
// Define a variable of type String and take user input to assign a value
// Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
// Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
