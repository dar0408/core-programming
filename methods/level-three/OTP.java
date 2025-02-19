// Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same

import java.util.Arrays;
public class OTP {
    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPNumbersUnique(int[] otpNumbers) {
        for (int i = 0; i < otpNumbers.length; i++) {
            for (int j = i + 1; j < otpNumbers.length; j++) {
                if (otpNumbers[i] == otpNumbers[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Main method to test the utility class
    public static void main(String[] args) {
        int[] otpNumbers = new int[10];

        for (int i = 0; i < otpNumbers.length; i++) {
            otpNumbers[i] = generateOTP();
        }

        System.out.println("Generated OTP Numbers: " + Arrays.toString(otpNumbers));
        System.out.println("Are OTP Numbers Unique? " + areOTPNumbersUnique(otpNumbers));
    }
}


// Hint => 
// Write a method to Generate a 6-digit OTP number using Math.random() 
// Create an array to save the OTP numbers generated 10 times
// Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false

