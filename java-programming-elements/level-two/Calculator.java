// Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
// Hint => 
// Create a variable number1 and number 2 and take user inputs.
// Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
// I/P => number1, number2
// O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking two integer inputs from the user
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        // Performing basic arithmetic operations
        float addition = number1 + number2; // Addition of two numbers
        float subtraction = number1 - number2; // Subtraction of two numbers
        float multiplication = number1 * number2; // Multiplication of two numbers
        float division = number1 / number2; // Integer division (may lead to loss of precision)

        // Displaying the results
        System.out.println("The addition value of 2 numbers " + number1 + " and " + number2 + " is " + addition);
        System.out.println("The subtraction value of 2 numbers " + number1 + " and " + number2 + " is " + subtraction);
        System.out.println("The multiplication value of 2 numbers " + number1 + " and " + number2 + " is " + multiplication);
        System.out.println("The division value of 2 numbers " + number1 + " and " + number2 + " is " + division);
    }
}
