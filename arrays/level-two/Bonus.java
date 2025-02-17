// Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
// Hint => 
// Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
// Define a double array to save salary and years of service for each of the 10 employees
// Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
// Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
// Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
// Print the total bonus payout as well as the total old and new salary of all the employees

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Create arrays to store salary, years of service, new salary, and bonus for 10 employees
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];

        // Variables to track total bonus, total old salary, and total new salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Loop to input the salary and years of service for each employee
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the salary of employee " + (i + 1));
            salary[i] = sc.nextDouble();

            // Validate the salary input (must be positive)
            if (salary[i] <= 0) {
                System.out.println("Please enter a valid salary");
                i--;  // Decrement i to repeat the input for the current employee
                continue;  // Skip the rest of the loop and go to the next iteration
            }

            System.out.println("Enter the years of service of employee " + (i + 1));
            years[i] = sc.nextDouble();

            // Validate the years of service input (must be positive)
            if (years[i] <= 0) {
                System.out.println("Please enter a valid year of service");
                i--;  // Decrement i to repeat the input for the current employee
            }
        }

        // Loop to calculate the bonus and new salary for each employee
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;  // 5% bonus for employees with more than 5 years of service
            } else {
                bonus[i] = salary[i] * 0.02;  // 2% bonus for employees with 5 or fewer years of service
            }

            // Calculate the new salary by adding the bonus to the original salary
            newSalary[i] = salary[i] + bonus[i];

            // Update total values for bonus, old salary, and new salary
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print the total payout details
        System.out.println("The total bonus payout is " + totalBonus);
        System.out.println("The total old salary payout is " + totalOldSalary);
        System.out.println("The total new salary payout is " + totalNewSalary);
    }
}
