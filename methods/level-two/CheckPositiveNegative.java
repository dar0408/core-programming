// Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less


import java.util.Scanner;

public class CheckPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        // Input numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        // Display positivity and evenness
        System.out.println("Checking numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even");
                } else {
                    System.out.println(numbers[i] + " is positive and odd");
                }
            } else {
                System.out.println(numbers[i] + " is negative");
            }
        }
        
        // Compare first and last number
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("First number is greater than last number");
        } else if (result == 0) {
            System.out.println("First number is equal to last number");
        } else {
            System.out.println("First number is less than last number");
        }
    }

    static boolean isPositive(int num) {
        return num >= 0; // Simplified using a return statement
    }

    static boolean isEven(int num) {
        return num % 2 == 0; // Simplified using a return statement
    }

    static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
}


// Hint => 
// Write a Method to Check whether the number is positive or negative
// Write a Method to check whether the number is even or odd
// Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
// In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
// If the number is negative, print negative. 
// Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
