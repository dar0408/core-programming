// Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 

import java.util.Scanner;

public class UnitConvertor {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Ask user for Fahrenheit value and read the input
        System.out.println("Enter Fahrenheit: ");
        double farhenheit = sc.nextDouble();
        
        // Convert Fahrenheit to Celsius and display the result
        System.out.println(farhenheit + " F is " + convertFarhenheitToCelsius(farhenheit) + " C");
    }

    // Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        // Formula to convert Fahrenheit to Celsius
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;  // Return the result
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        // Formula to convert Celsius to Fahrenheit
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;  // Return the result
    }

    // Method to convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        // Conversion factor from Pounds to Kilograms
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;  // Return the result
    }

    // Method to convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        // Conversion factor from Kilograms to Pounds
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;  // Return the result
    }

    // Method to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        // Conversion factor from Gallons to Liters
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;  // Return the result
    }

    // Method to convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        // Conversion factor from Liters to Gallons
        double liters2gallons = 0.264172;
        return liters * liters2gallons;  // Return the result
    }
}


// public static double convertFarhenheitToCelsius(double farhenheit) => 
// Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
// Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
// Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
// Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
// Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
// Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; 

