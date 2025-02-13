// Write a program to take 2 numbers and print their quotient and reminder
// Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
// I/P => number1, number2
// O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___

import java.util.Scanner;

public class Reminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for two numbers
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = sc.nextInt();

        // Calculating quotient and remainder
        int quotient = number1 / number2; // Integer division to get the quotient
        int remainder = number1 % number2; // Modulus operator to get the remainder

        // Displaying the results
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
    }
}
