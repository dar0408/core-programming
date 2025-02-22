// 8. Temperature Converter:

import java.util.Scanner;  // Importing Scanner class for user input

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for user input
        
        // Displaying menu options to the user
        System.out.println("Choose an option:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = sc.nextInt();  // Reading the user's choice
        
        // Handling user's choice
        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();  // Reading Fahrenheit temperature
                System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit));  // Converting and displaying the result
                break;
            case 2:
                System.out.println("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();  // Reading Celsius temperature
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));  // Converting and displaying the result
                break;
            default:
                System.out.println("Invalid choice!");  // Handling invalid choices
        }
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;  // Formula for conversion
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;  // Formula for conversion
    }
}




// ○ Write a program that converts temperatures between Fahrenheit and Celsius. ○
// The program should have separate functions for converting from Fahrenheit to
// Celsius and from Celsius to Fahrenheit.