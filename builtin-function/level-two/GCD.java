// 7. GCD and LCM Calculator:


import java.util.Scanner;  // Importing Scanner class for user input

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for user input
        
        // Prompting user to enter the first number
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        
        // Prompting user to enter the second number
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        
        // Calculating and displaying GCD and LCM
        System.out.println("GCD: " + gcd(num1, num2));  // Greatest Common Divisor
        System.out.println("LCM: " + lcm(num1, num2));  // Least Common Multiple
    }

    // Recursive method to calculate GCD using the Euclidean algorithm
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {  // Base case: if second number is 0, return first number
            return num1;
        }
        return gcd(num2, num1 % num2);  // Recursive call with remainder
    }

    // Method to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int lcm(int num1, int num2) {
        return (num1 * num2) / gcd(num1, num2);
    }
}


// ○ Create a program that calculates the Greatest Common Divisor (GCD) and Least
// Common Multiple (LCM) of two numbers using functions.
// ○ Use separate functions for GCD and LCM calculations, showcasing how modular
// code works.