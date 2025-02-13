// Similarly, write the DoubleOpt program by taking double values and doing the same operations.

import java.util.Scanner;

public class Similar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for three double values
        System.out.println("Enter the value of a: ");
        double a = sc.nextDouble();
        
        System.out.println("Enter the value of b: ");
        double b = sc.nextDouble();
        
        System.out.println("Enter the value of c: ");
        double c = sc.nextDouble();

        // Performing different arithmetic operations
        double result1 = a + b * c;   // Multiplication has higher precedence than addition
        double result2 = a * b + c;   // Multiplication has higher precedence than addition
        double result3 = c + a / b;   // Division has higher precedence than addition
        double result4 = a % b + c;   // Modulus has higher precedence than addition

        // Displaying results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
