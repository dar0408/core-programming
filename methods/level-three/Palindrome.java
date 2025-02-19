
// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

import java.util.Arrays;

public class Palindrome {

    // Method to count the number of digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits of a number in an array
    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a palindrome using digits array
    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    // Main method to test all functions
    public static void main(String[] args) {
        int num = 1221; // Example number (change for testing)

        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));

        int[] digits = getDigitsArray(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversed));

        System.out.println("Are the original and reversed arrays equal? " + areArraysEqual(digits, reversed));

        System.out.println("Is the number a Palindrome? " + isPalindrome(num));

        System.out.println("Is the number a Duck Number? " + isDuckNumber(num));
    }
}


// Hint => 
// Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
// Method to reverse the digits array 
// Method to compare two arrays and check if they are equal
// Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 
// Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it


