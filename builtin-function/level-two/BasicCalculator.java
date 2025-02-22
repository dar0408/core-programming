// 9. Basic Calculator:

import java.util.Scanner;  // Importing Scanner class for user input

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for user input
        
        // Prompting user to enter the first number
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        
        // Prompting user to enter the second number
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        
        // Displaying operation choices
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        int choice = sc.nextInt();  // Reading user's choice
        
        // Performing the selected operation using a switch case
        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));  // Addition
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));  // Subtraction
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));  // Multiplication
                break;
            case 4:
                System.out.println("Result: " + divide(num1, num2));  // Division
                break;
            default:
                System.out.println("Invalid choice!");  // Handling invalid input
        }
    }

    // Method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method for division
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}




// ○ Write a program that performs basic mathematical operations (addition,
// subtraction, multiplication, division) based on user input.
// ○ Each operation should be performed in its own function, and the program should
// prompt the user to choose which operation to perform.