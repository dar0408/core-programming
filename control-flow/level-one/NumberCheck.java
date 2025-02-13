// Write a program to check whether a number is positive, negative, or zero.
// Hint => 
// Get integer input from the user and store it in the number variable.
// If the number is positive, print positive.
// If the number is negative, print negative.
// If the number is zero, print zero. 

import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        // Checking if the number is positive, negative, or zero
        if(num > 0){
            System.out.println("The number is positive."); // If the number is greater than 0
        } else if(num < 0){
            System.out.println("The number is negative."); // If the number is less than 0
        } else {
            System.out.println("The number is zero."); // If the number is exactly 0
        }
    }
}
