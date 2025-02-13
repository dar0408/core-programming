// Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
// Hint => 
// Create a variable number1 and number 2 and take user inputs.
// Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
// I/P => number1, number2
// O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        double number1, number2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        number1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        number2 = input.nextDouble();

        // Perform basic arithmetic operations
        double addition = number1 + number2;         // Adds both numbers
        double subtraction = number1 - number2;      // Subtracts second number from the first
        double multiplication = number1 * number2;   // Multiplies both numbers
        double division = number1 / number2;         // Divides first number by the second

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                + number1 + " and " + number2 + " is " + addition + ", " 
                + subtraction + ", " + multiplication + ", and " + division);
    }
}
