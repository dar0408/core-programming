// 3. Problem 3: Date Formatting Write a program that:


import java.time.LocalDate;  // Importing LocalDate class for date handling
import java.time.format.DateTimeFormatter;  // Importing DateTimeFormatter for formatting dates

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();  // Getting the current date
        
        // Defining different date formats
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        
        // Formatting and printing the date in different formats
        System.out.println("dd/MM/yyyy: " + date.format(formatter1));
        System.out.println("yyyy-MM-dd: " + date.format(formatter2));
        System.out.println("EEE, MMM dd, yyyy: " + date.format(formatter3));
    }
}





// ➢ Displays the current date in three different formats:
// ■ dd/MM/yyyy
// ■ yyyy-MM-dd
// ■ EEE, MMM dd, yyyy

// Hint: Use DateTimeFormatter with custom patterns for date formatting.