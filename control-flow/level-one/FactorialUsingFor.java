// Rewrite program 14 using for loop
// Hint => 
// Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 


import java.util.Scanner;
public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        // Checking if the number is a natural number (greater than 0)
        if(num > 0){
            int fact = 1; // Initializing factorial variable

            // Using a for loop to calculate factorial
            for(int i = 1; i <= num; i++){
                fact *= i; // Multiplying fact by i to compute factorial
            }

            // Displaying the factorial of the given number
            System.out.println("The factorial of " + num + " is " + fact);
        } else {
            // If the number is not a natural number, display a message
            System.out.println("The number " + num + " is not a natural number");
        }
    }
}

