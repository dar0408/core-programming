// Write a program to create a calculator using switch...case.
// Hint => 
// Create two double variables named first and second and a String variable named op.
// Get input values for all variables.
// The input for the operator can only be one of the four values: "+", "-", "*" or "/".
// Run a for loop from i = 1 to i < number.
// Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
// If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
// If op is neither of those 4 values, print Invalid Operator.



import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double first = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double second = sc.nextDouble();
        System.out.println("Enter the operator (+, -, *, /): ");
        String op = sc.next();
        sc.close();
        switch (op) {
            case "+":
                System.out.println("The result of the addition is: " + (first + second));
                break;
            case "-":
                System.out.println("The result of the subtraction is: " + (first - second));
                break;
            case "*":
                System.out.println("The result of the multiplication is: " + (first * second));
                break;
            case "/":
                System.out.println("The result of the division is: " + (first / second));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}