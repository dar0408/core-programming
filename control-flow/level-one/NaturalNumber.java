// Write a program to check for the natural number and write the sum of n natural numbers 
// Hint => 
// A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
// A sum of n natural numbers is n * (n+1) / 2 
// I/P => number
// O/P => If the number is a positive integer then the output is
// The sum of ___ natural numbers is ___
// Otherwise 
// The number ___ is not a natural number


import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        // Checking if the number is a natural number (greater than 0)
        if(num > 0){
            // Using the formula for the sum of the first N natural numbers: n(n+1)/2
            System.out.println("The sum of " + num + " natural numbers is " + num * (num + 1) / 2);
        } else {
            // If the number is not a natural number, display a message
            System.out.println("The number " + num + " is not a natural number");
        }
    }
}
