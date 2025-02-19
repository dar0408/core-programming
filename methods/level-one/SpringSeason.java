// Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
// Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 

import java.util.Scanner;

public class SpringSeason {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the month
        System.out.println("Enter the month: ");
        // Read the month from user input
        int month = sc.nextInt();

        // Prompt the user to enter the day
        System.out.println("Enter the day: ");
        // Read the day from user input
        int day = sc.nextInt();

        // Call the checkSpringSeason method to check if it's spring season
        boolean result = checkSpringSeason(month, day);

        // Output the result based on whether it's spring season or not
        if (result) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    // Method to check if the given month and day fall under the spring season
    public static boolean checkSpringSeason(int month, int day) {
        // If it's March and the day is 20 or later, it's spring season
        if (month == 3 && day >= 20) {
            return true;
        } 
        // If it's April or May, it's always spring season
        else if (month == 4 || month == 5) {
            return true;
        } 
        // If it's June and the day is 20 or earlier, it's spring season
        else if (month == 6 && day <= 20) {
            return true;
        } 
        // Otherwise, it's not spring season
        else {
            return false;
        }
    }
}
