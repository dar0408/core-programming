// 3. Prime Number Checker:

import java.util.Scanner;  // Importing Scanner class for user input

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for user input
        
        // Prompting user to enter a number
        System.out.println("Enter a number: ");
        int num = sc.nextInt();  // Reading the input number
        
        // Checking if the entered number is a prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");  // If prime
        } else {
            System.out.println(num + " is not a prime number.");  // If not prime
        }
    }

    // Method to check if the number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {  // Numbers less than or equal to 1 are not prime
            return false;
        }
        
        // Loop from 2 to the square root of num to check for divisibility
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {  // If num is divisible by i, it's not prime
                return false;
            }
        }
        return true;  // If no divisors found, num is prime
    }
}


// ○ Create a program that checks whether a given number is a prime number. ○
// The program should use a separate function to perform the prime check and
// return the result.