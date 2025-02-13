// Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
// y0 = y − (14 − m) / 12
// x = y0 + y0/4 − y0/100 + y0/400
// m0 = m + 12 × ((14 − m) / 12) − 2
// d0 = (d + x + 31m0 / 12) mod 7


import java.util.Scanner; // Import Scanner class for user input

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        // Prompt the user to enter month, day, and year
        System.out.println("Enter the month: ");
        int m = sc.nextInt(); // Read month input
        System.out.println("Enter the day: ");
        int d = sc.nextInt(); // Read day input
        System.out.println("Enter the year: ");
        int y = sc.nextInt(); // Read year input
        sc.close(); // Close the scanner to prevent resource leaks

        // Adjust the year for calculations based on Zeller's Congruence
        int y0 = y - (14 - m) / 12;
        
        // Calculate intermediate value for determining the day of the week
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        
        // Adjust the month for calculations
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        
        // Compute the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the computed day of the week (as a number)
        System.out.println("The day of the week is: " + d0);
    }
}
