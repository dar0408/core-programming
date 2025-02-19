// Write a program that takes a year as input and outputs the Year is a Leap Year or not 


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a year
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        
        // Check if the year is before the Gregorian calendar started
        if (year < 1582) {
            System.out.println("Please enter a year greater than or equal to 1582");
            System.exit(0);  // Terminate the program if the year is before 1582
        }
        
        // Call the method to check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }

    // Method to check if the year is a leap year
    static boolean isLeapYear(int year) {
        // Year is divisible by 4
        if (year % 4 == 0) {
            // Year is divisible by 100
            if (year % 100 == 0) {
                // Year is divisible by 400
                if (year % 400 == 0) {
                    return true;  // It's a leap year
                }
                return false;  // It's not a leap year
            }
            return true;  // It's a leap year
        }
        return false;  // It's not a leap year
    }
}



// Hint => 
// The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
// Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
// Write a method to check for Leap Year using the conditions a and b
