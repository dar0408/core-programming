
// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods



import java.util.*;

public class Frequency {

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

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of squares of the digits of a number
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int num) {
        int sum = sumOfDigits(getDigitsArray(num));
        return num % sum == 0;
    }

    // Method to find the frequency of each digit in a number
    public static int[][] digitFrequency(int num) {
        int[] digits = getDigitsArray(num);
        int[] freq = new int[10]; // Array to store frequency of digits 0-9

        for (int digit : digits) {
            freq[digit]++;
        }

        // Create a 2D array to store digit-frequency pairs
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    // Main method to test all functions
    public static void main(String[] args) {
        int num = 1729; // Example number (change it for testing)

        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));

        int[] digits = getDigitsArray(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));

        System.out.println("Is Harshad Number? " + isHarshadNumber(num));

        System.out.println("Digit Frequency:");
        int[][] frequency = digitFrequency(num);
        for (int[] pair : frequency) {
            System.out.println("Digit " + pair[0] + " appears " + pair[1] + " times");
        }
    }
}


// Hint => 
// Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
// Method to find the sum of the digits of a number using the digits array
// Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
// Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
// Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
