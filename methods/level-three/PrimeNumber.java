// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods



public class PrimeNumber {

    // Method to check if a number is a prime number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    // Main method to test all functions
    public static void main(String[] args) {
        int num = 25; // Example number (change for testing)

        System.out.println("Number: " + num);
        System.out.println("Is Prime? " + isPrime(num));
        System.out.println("Is Neon? " + isNeon(num));
        System.out.println("Is Spy? " + isSpy(num));
        System.out.println("Is Automorphic? " + isAutomorphic(num));
        System.out.println("Is Buzz? " + isBuzz(num));
    }
}


// Hint => 
// Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. 
// Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
// Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
// Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
// Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7

