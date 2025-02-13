// Create a program to find the bonus of employees based on their years of service.
// Hint => 
// Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
// Take salary and year of service in the year as input.
// Print the bonus amount.

import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for salary
        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();

        // Taking user input for years of service
        System.out.println("Enter the years of service: ");
        int years = sc.nextInt();

        // Checking if the employee has more than 5 years of service
        if(years > 5){
            // Calculating 5% bonus on salary
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is " + bonus);
        } else {
            // If years of service are 5 or less, no bonus is given
            System.out.println("No bonus for you");
        }
    }
}
