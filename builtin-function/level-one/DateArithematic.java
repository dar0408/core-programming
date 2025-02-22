// 2. Problem 2: Date Arithmetic Create a program that:

import java.time.LocalDate;  // Importing LocalDate class from java.time package

public class DateArithematic {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();  // Getting the current date
        
        System.out.println("Current Date: " + date);  // Printing the current date
        
        // Performing date arithmetic operations
        System.out.println("After 7 days: " + date.plusDays(7));  // Adding 7 days to the current date
        System.out.println("After 1 month: " + date.plusMonths(1));  // Adding 1 month to the current date
        System.out.println("After 2 years: " + date.plusYears(2));  // Adding 2 years to the current date
        System.out.println("After 3 weeks: " + date.minusWeeks(3));  // Subtracting 3 weeks from the current date
    }
}





// ➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
// ➢ Then subtracts 3 weeks from the result.
// Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
//  minusWeeks() methods.