// 4. Problem 4: Date Comparison Write a program that:

import java.time.LocalDate;  // Importing LocalDate class for date handling
import java.util.Scanner;    // Importing Scanner class for user input

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for user input
        System.out.println("Enter the first date (yyyy-MM-dd): ");  // Prompting user to enter first date
        String date1 = sc.nextLine();  // Reading first date as string input
        System.out.println("Enter the second date (yyyy-MM-dd): ");  // Prompting user to enter second date
        String date2 = sc.nextLine();  // Reading second date as string input
        LocalDate firstDate = LocalDate.parse(date1);  // Converting first date string to LocalDate
        LocalDate secondDate = LocalDate.parse(date2);  // Converting second date string to LocalDate
        if (firstDate.isBefore(secondDate)) {  // Checking if first date is before second date
            System.out.println(firstDate + " is before " + secondDate);
        } else if (firstDate.isAfter(secondDate)) {  // Checking if first date is after second date
            System.out.println(firstDate + " is after " + secondDate);
        } else {  // Checking if both dates are equal
            System.out.println(firstDate + " is equal to " + secondDate);
        }
    }
}




// ➢ Takes two date inputs and compares them to check if the first date is before, after,
// or the same as the second date.
// Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate

// class.