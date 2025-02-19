// Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown below


import java.util.Scanner;

public class Calander {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for month and year
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        // Display the calendar for the given month and year
        displayCalander(month, year);
    }

    public static void displayCalander(int month, int year) {
        // Array containing month names
        String[] months = {"January", "February", "March", "April", "May", "June", "July", 
                           "August", "September", "October", "November", "December"};

        // Array containing the number of days in each month (excluding leap year adjustment)
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Get the first day of the month
        int day = getFirstDay(month, year);

        // Print the header with the month and year
        System.out.println("Calendar for " + months[month - 1] + " " + year);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        // Print initial spaces for the first day of the month
        for (int i = 0; i < day; i++) {
            System.out.print("\t");
        }

        // Print the days of the month
        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.print(i + "\t");

            // Move to a new line after Saturday (every 7 days)
            if ((i + day) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static int getFirstDay(int month, int year) {
        // Zeller’s Congruence algorithm to calculate the first day of the month
        int y0 = year - (14 - month) / 12;    // Adjust year for January and February
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400; // Leap year adjustments
        int m0 = month + 12 * ((14 - month) / 12) - 2; // Convert month into Zeller’s format
        int d0 = (1 + x + 31 * m0 / 12) % 7; // Compute day of the week (0 = Saturday, 1 = Sunday, ..., 6 = Friday)

        return d0; // Return the first day index of the month
    }
}



// Hint => 
// Write a Method to get the name of the month. For this define a month Array to store the names of the months
// Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, check for Leap Year to get the number of days. Also, define a Leap Year Method. 
// Write a method to get the first day of the month using the Gregorian calendar algorithm
// y0 = y − (14 − m) / 12
// x = y0 + y0/4 − y0/100 + y0/400
// m0 = m + 12 × ((14 − m) / 12) − 2
// d0 = (d + x + 31m0 / 12) mod 7
