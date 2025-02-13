// Write a program to create a calculator using switch...case.
// Hint => 
// Create two double variables named first and second and a String variable named op.
// Get input values for all variables.
// The input for the operator can only be one of the four values: "+", "-", "*" or "/".
// Run a for loop from i = 1 to i < number.
// Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
// If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
// If op is neither of those 4 values, print Invalid Operator.


import java.util.Scanner; // Import Scanner class for user input

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        System.out.println("Enter the first number: ");
        double first = sc.nextDouble(); // Read the first number from user

        System.out.println("Enter the second number: ");
        double second = sc.nextDouble(); // Read the second number from user

        System.out.println("Enter the operator (+, -, *, /): ");
        String op = sc.next(); // Read the operator as a string

        sc.close(); // Close the scanner to prevent resource leaks

        // Switch statement to perform the selected operation
        switch (op) {
            case "+": // Case for addition
                System.out.println("The result of the addition is: " + (first + second));
                break;
            case "-": // Case for subtraction
                System.out.println("The result of the subtraction is: " + (first - second));
                break;
            case "*": // Case for multiplication
                System.out.println("The result of the multiplication is: " + (first * second));
                break;
            case "/": // Case for division
                if (second != 0) { // Check to prevent division by zero
                    System.out.println("The result of the division is: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            default: // Default case for invalid operator
                System.out.println("Invalid Operator");
        }
    }
}
