// Write a program to demonstrate NullPointerException. 


import java.util.Scanner;

public class NullPointer {
    public static void main(String[] args) {
        // Call the method to generate an exception by trying to access a method on a null object
        generateException();
        
        // Call the method to handle the exception gracefully using try-catch
        handleException();
    }

    // Method to generate a NullPointerException by accessing a method on a null object
    public static void generateException() {
        String text = null;  // Initialize the string variable with null
        // Try to call the length method on a null object, which will throw a NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException using try-catch block
    public static void handleException() {
        String text = null;  // Initialize the string variable with null
        
        try {
            // Try to access the length method on a null object (this will throw a NullPointerException)
            System.out.println(text.length());
        } catch (NullPointerException e) {
            // Catch the NullPointerException and print an appropriate message
            System.out.println("NullPointerException caught");
        }
    }
}




// Hint => 
// Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
// Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
// From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException



