// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods



import java.util.*;

public class NumberChecker {
    
    // Method to count digits in a number
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

    // Method to check if a number is a Duck number
    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0") && numStr.charAt(0) != '0'; // Must contain '0' but not start with it
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int num) {
        int[] digits = getDigitsArray(num);
        int power = digits.length, sum = 0, temp = num;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == num;
    }

    // Method to find largest and second largest digit
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + (secondLargest == Integer.MIN_VALUE ? "None" : secondLargest));
    }

    // Method to find smallest and second smallest digit
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + (secondSmallest == Integer.MAX_VALUE ? "None" : secondSmallest));
    }

    // Main method to test all functions
    public static void main(String[] args) {
        int num = 153; // Change this number for different tests

        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));

        int[] digits = getDigitsArray(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        System.out.println("Is Duck Number? " + isDuckNumber(num));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(num));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}


// Hint => 
// Method to Find the count of digits in the number
// Method to Store the digits of the number in a digits array
// Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
// Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
// Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
// Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.

