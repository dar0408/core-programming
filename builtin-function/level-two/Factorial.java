// 6. Factorial Using Recursion:
import java.util.Scanner;  // Importing Scanner class for user input

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for user input
        
        // Prompting user to enter a number
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        // Calculating and displaying the factorial of the entered number
        System.out.println("Factorial: " + factorial(num));
    }

    // Recursive method to calculate factorial of a number
    public static int factorial(int num) {
        if (num == 0) {  // Base case: factorial of 0 is 1
            return 1;
        }
        return num * factorial(num - 1);  // Recursive case: num * factorial(num-1)
    }
}





// ○ Write a program that calculates the factorial of a number using a recursive
// function.
// ○ Include modular code to separate input, calculation, and output processes.